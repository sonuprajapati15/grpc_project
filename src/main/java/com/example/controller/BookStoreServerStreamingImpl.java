package com.example.controller;

import com.example.pojo.serverstream.BookStoreGrpc;
import com.example.pojo.serverstream.ServerStreaming.*;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

/**
 * BookStoreImpl class.
 *
 * @author sonuprajapati458
 * @since 08/08/24
 */
public class BookStoreServerStreamingImpl extends BookStoreGrpc.BookStoreImplBase{

    static Map<String, Book> bookMap = new HashMap<>();
    static {
        bookMap.put("Great Gatsby", Book.newBuilder().setName("Great Gatsby")
                .setAuthor("Scott Fitzgerald")
                .setPrice(300).build());
        bookMap.put("To Kill MockingBird", Book.newBuilder().setName("To Kill MockingBird")
                .setAuthor("Harper Lee")
                .setPrice(400).build());
        bookMap.put("Passage to India", Book.newBuilder().setName("Passage to India")
                .setAuthor("E.M.Forster")
                .setPrice(500).build());
        bookMap.put("The Side of Paradise", Book.newBuilder().setName("The Side of Paradise")
                .setAuthor("Scott Fitzgerald")
                .setPrice(600).build());
        bookMap.put("Go Set a Watchman", Book.newBuilder().setName("Go Set a Watchman")
                .setAuthor("Harper Lee")
                .setPrice(700).build());
    }

    @Override
    public void searchByAuthor(BookSearch searchQuery, StreamObserver<Book> responseObserver) {
        for (Map.Entry<String, Book> bookEntry : bookMap.entrySet()) {
            try {
                System.out.println("Going through more books....");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(bookEntry.getValue().getAuthor().startsWith(searchQuery.getAuthor())){
                System.out.println("Found book with required author: " + bookEntry.getValue().getName()+ ". Sending....");
                responseObserver.onNext(bookEntry.getValue());
            }
        }
        responseObserver.onCompleted();
    }
}
