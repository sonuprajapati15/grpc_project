package com.example.controller;

import com.example.pojo.HealthCheckRequest;
import com.example.pojo.HealthCheckResponse;
import com.example.pojo.HealthCheckServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * HealthCheck class.
 *
 * @author sonuprajapati458
 * @since 05/08/24
 */
public class HealthCheck extends HealthCheckServiceGrpc.HealthCheckServiceImplBase {

    @Override
    public void check(HealthCheckRequest request, StreamObserver<HealthCheckResponse> response) {
        System.out.println("Health is good");
        HealthCheckResponse healthCheckResponse = HealthCheckResponse.newBuilder().setMessage("Health is good").build();
        response.onNext(healthCheckResponse);
        response.onCompleted();
    }
}
