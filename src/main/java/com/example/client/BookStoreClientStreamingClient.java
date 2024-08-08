package com.example.client;

import com.example.pojo.client_stream.BookCartStoreGrpc;
import com.example.pojo.client_stream.ClientStreming;
import com.example.pojo.serverstream.ServerStreaming;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * BookStoreClientStreamingClient class.
 *
 * @author sonuprajapati458
 * @since 08/08/24
 */
public class BookStoreClientStreamingClient {

    private final BookCartStoreGrpc.BookCartStoreStub stub;
    private boolean serverResponseCompleted = false;
    StreamObserver<ServerStreaming.Book> streamClientSender;

    public BookStoreClientStreamingClient(Channel channel) {
        stub = BookCartStoreGrpc.newStub(channel);
    }

    public StreamObserver<ClientStreming.Cart> getServerResponseObserver() {
        StreamObserver<ClientStreming.Cart> observer = new StreamObserver<ClientStreming.Cart>() {
            @Override
            public void onNext(ClientStreming.Cart cart) {
                System.out.println("Order summary:" + "\nTotal number of Books:" + cart.getBooks() +
                        "\nTotal Order Value:" + cart.getPrice());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                //System.out.println("Server: Done reading orderreading cart");
                serverResponseCompleted = true;
            }
        };
        return observer;
    }

    public void addBook(String book) throws InterruptedException {
        System.out.println("Adding book with title starting with: " + book);
        ServerStreaming.Book request = ServerStreaming.Book.newBuilder().setName(book).build();

        if(streamClientSender == null) {
            streamClientSender = stub.totalCartValue(getServerResponseObserver());
        }
        try {
            Thread.sleep(2000);
            streamClientSender.onNext(request);
        }
        catch (StatusRuntimeException e) {
            System.out.println("RPC failed: " + e.getStatus());
        }
    }
    public void completeOrder() {
        System.out.println("Done, waiting for server to create order summary...");
        if(streamClientSender != null);
        streamClientSender.onCompleted();
    }

    public static void main(String[] args) throws InterruptedException {
        String serverAddress = "localhost:9200";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddress)
                .usePlaintext()
                .build();
        try {
            BookStoreClientStreamingClient client = new BookStoreClientStreamingClient(channel);
            List<String> bookNames = Arrays.asList("Great Gatsby", "To Kill MockingBird", "Passage to India", "The Side of Paradise", "Go Set a Watchman");

            for(String bookName : bookNames) {
                System.out.println("Type book name to be added to the cart....");
                if(bookName.equals("EXIT")) {
                    client.completeOrder();
                    break;
                }
                client.addBook(bookName);
                System.out.println();
            }

            while(client.serverResponseCompleted == false) {
                Thread.sleep(2000);
            }

        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
