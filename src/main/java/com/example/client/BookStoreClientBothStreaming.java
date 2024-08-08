package com.example.client;

import com.example.pojo.client_stream.BookLiveCartStoreGrpc;
import com.example.pojo.client_stream.ClientStreming.*;
import com.example.pojo.serverstream.ServerStreaming.*;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * BookStoreClientBothStreaming class.
 *
 * @author sonuprajapati458
 * @since 08/08/24
 */
public class BookStoreClientBothStreaming {

    private final BookLiveCartStoreGrpc.BookLiveCartStoreStub stub;
    private boolean serverIntermediateResponseCompleted = true;
    private boolean serverResponseCompleted = false;

    StreamObserver<Book> streamClientSender;

    public BookStoreClientBothStreaming(Channel channel) {
        stub = BookLiveCartStoreGrpc.newStub(channel);
    }

    public StreamObserver<Cart> getServerResponseObserver() {
        StreamObserver<Cart> observer = new StreamObserver<Cart>() {
            @Override
            public void onNext(Cart cart) {
                System.out.println("Order summary:" +
                        "\nTotal number of Books:" + cart.getBooks() +
                        "\nTotal Order Value:" + cart.getPrice());

                serverIntermediateResponseCompleted = true;
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error while reading response fromServer: " + t);
            }

            @Override
            public void onCompleted() {
                //System.out.println("Server: Done reading orderreading cart");
                serverResponseCompleted = true;
            }
        };
        return observer;
    }

    public void addBook(String book) {
        System.out.println("Adding book with title starting with: " + book);
        Book request = Book.newBuilder().setName(book).build();
        if (streamClientSender == null) {
            streamClientSender = stub.liveCartValue(getServerResponseObserver());
        }
        try {
            streamClientSender.onNext(request);
        } catch (StatusRuntimeException e) {
            System.out.println("RPC failed: " + e.getStatus());
        }
    }

    public void completeOrder() {
        System.out.println("Done, waiting for server to create ordersummary...");
        if (streamClientSender != null) ;
        {
            streamClientSender.onCompleted();
        }
    }

    public static void main(String[] args) throws Exception {
        String serverAddress = "localhost:9200";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddress)
                .usePlaintext()
                .build();
        try {
            BookStoreClientBothStreaming client = new
                    BookStoreClientBothStreaming(channel);
            List<String> bookNames = Arrays.asList("Great Gatsby", "To Kill MockingBird", "Passage to India", "The Side of Paradise", "Go Set a Watchman");


            for (String bookName : bookNames) {
                if (client.serverIntermediateResponseCompleted == true) {
                    System.out.println("Type book name to beadded to the cart....");
                    if (bookName.equals("EXIT")) {
                        client.completeOrder();
                        break;
                    }
                    client.serverIntermediateResponseCompleted = false;
                    client.addBook(bookName);
                    Thread.sleep(500);
                    System.out.println();
                }
            }
            while (client.serverResponseCompleted == false) {
                Thread.sleep(2000);
            }

        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
