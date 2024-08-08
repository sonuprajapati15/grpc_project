package com.example.controller;

import com.example.pojo.client_stream.BookCartStoreGrpc;
import com.example.pojo.client_stream.ClientStreming;
import com.example.pojo.serverstream.ServerStreaming.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * BookeStoreClientStreaming class.
 *
 * @author sonuprajapati458
 * @since 08/08/24
 */
public class BookeStoreClientStreaming extends BookCartStoreGrpc.BookCartStoreImplBase {

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
    public StreamObserver<Book> totalCartValue(StreamObserver<ClientStreming.Cart> responseObserver) {
        return new StreamObserver<Book>() {
            ArrayList<Book> bookCart = new ArrayList<Book>();

            @Override
            public void onNext(Book book) {
                System.out.println("Searching for book with title starting with: " + book.getName());
                for (
                        Map.Entry<String, Book> bookEntry : bookMap.entrySet()) {
                    if (bookEntry.getValue().getName().startsWith(book.getName())) {
                        System.out.println("Found book, adding to cart:....");
                        bookCart.add(bookEntry.getValue());
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error while reading book stream: " + t);
            }

            @Override
            public void onCompleted() {
                int cartValue = 0;
                for (Book book : bookCart) {
                    cartValue += book.getPrice();
                }
                responseObserver.onNext(ClientStreming.Cart.newBuilder()
                        .setPrice(cartValue)
                        .setBooks(bookCart.size()).build());
                responseObserver.onCompleted();
            }
        };
    }
}
