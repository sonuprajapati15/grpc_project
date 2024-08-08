package com.example.controller;

import com.example.pojo.Status;
import com.example.pojo.unary.GreetingRequest;
import com.example.pojo.unary.GreetingResponse;
import com.example.pojo.unary.GreetingServiceGrpc;
import com.example.pojo.unary.RejectRequest;
import io.grpc.stub.*;

/**
 * Greeting class.
 *
 * @author sonuprajapati458
 * @since 05/08/24
 */
public class Greeting extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greet(GreetingRequest request,
                      StreamObserver<GreetingResponse> responseObserver) {
        String name = request.getMessage();
        String greeting = "Hello  its fuckin grunning" + name;
        GreetingResponse response = GreetingResponse.newBuilder()
                .setDescription(greeting).setStatus(Status.SUCCESS).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void reject(RejectRequest request,
                       StreamObserver<GreetingResponse> responseObserver) {
        String name = request.getMessage();
        String greeting = "Hello " + name;
        GreetingResponse response = GreetingResponse.newBuilder()
                .setDescription(greeting).setStatus(Status.SUCCESS).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
