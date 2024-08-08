package com.example.client;

import com.example.pojo.serverstream.BookStoreGrpc;
import com.example.pojo.serverstream.ServerStreaming;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * ServerStreamingClient class.
 *
 * @author sonuprajapati458
 * @since 08/08/24
 */
public class ServerStreamingClient {
    private final BookStoreGrpc.BookStoreBlockingStub blockingStub;
    public ServerStreamingClient(Channel channel) {
        blockingStub = BookStoreGrpc.newBlockingStub(channel);
    }
    public void getBook(String author) {
        System.out.println("Querying for book with author: " + author);
        ServerStreaming.BookSearch request = ServerStreaming.BookSearch.newBuilder().setAuthor(author).build();
        Iterator<ServerStreaming.Book> response;
        try {
            response = blockingStub.searchByAuthor(request);
            while(response.hasNext()) {
                System.out.println("Found book: " + response.next());
            }
        } catch (StatusRuntimeException e) {
            System.out.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) throws Exception {
        List<String> authorName = Arrays.asList( "Great Gatsby", "The Alchemist", "The Da Vinci Code");
        String serverAddress = "localhost:9200";

        ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddress)
                .usePlaintext()
                .build();

        try {
            ServerStreamingClient client = new ServerStreamingClient(channel);
            for(String author : authorName) {
                client.getBook(author);
            }
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
