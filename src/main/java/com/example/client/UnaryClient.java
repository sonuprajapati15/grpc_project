package com.example.client;

import com.example.pojo.unary.GreetingRequest;
import com.example.pojo.unary.GreetingResponse;
import com.example.pojo.unary.GreetingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * com.example.client.Client class.
 *
 * @author sonuprajapati458
 * @since 05/08/24
 */
public class UnaryClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9200)
                .usePlaintext()
                .build();

        GreetingServiceGrpc.GreetingServiceBlockingStub greetingServiceBlockingStub = GreetingServiceGrpc.newBlockingStub(channel);
        GreetingResponse greetingResponse = greetingServiceBlockingStub.greet(GreetingRequest.newBuilder().setMessage("Sonus").build());
        System.out.println(greetingResponse);
    }
}
