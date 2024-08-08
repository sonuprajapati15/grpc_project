package com.example;

import com.example.controller.*;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Server class.
 *
 * @author sonuprajapati458
 * @since 05/08/24
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            io.grpc.Server server = ServerBuilder.forPort(9200)
                    .addService(new Greeting())
                    .addService(new HealthCheck())
                    .addService(new BookStoreServerStreamingImpl())
                    .addService(new BookeStoreClientStreaming())
                    .addService(new BookeStoreServerBothStreaming())
                    .build();
            server.start();
            System.out.println("Server started at port 9200");
            server.awaitTermination(); // Ensure the server keeps running
            shutdownhook(server);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void shutdownhook(io.grpc.Server server) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    server.shutdown().awaitTermination(10, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}
