### gRPC Send/Receive Metadata: Documentation and Summary

### Overview

Metadata in gRPC is used to send additional information between the client and server. This can include authentication tokens, user information, custom headers, and other contextual data. Metadata can be sent and received in both request and response phases of an RPC call.

### Types of Metadata

1. **Request Metadata**: Sent from the client to the server.
2. **Response Metadata**: Sent from the server to the client.
3. **Trailing Metadata**: Sent from the server to the client at the end of the RPC.

### Setting and Reading Metadata

#### Client-Side

**Sending Metadata:**

- **Java**: Use `Metadata` and `Metadata.Key`.
  ```java
  Metadata metadata = new Metadata();
  Metadata.Key<String> key = Metadata.Key.of("key-name", Metadata.ASCII_STRING_MARSHALLER);
  metadata.put(key, "value");
  stub = MetadataUtils.attachHeaders(stub, metadata);
  ```

- **Python**: Pass metadata as a tuple of key-value pairs.
  ```python
  metadata = [('key-name', 'value')]
  response = stub.MethodName(request, metadata=metadata)
  ```

- **Go**: Use `metadata.Pairs` and `grpc.WithMetadata`.
  ```go
  md := metadata.Pairs("key-name", "value")
  ctx := metadata.NewOutgoingContext(context.Background(), md)
  response, err := client.MethodName(ctx, request)
  ```

**Reading Metadata:**

- **Java**: Use `ClientCall.Listener`.
  ```java
  new ClientCall.Listener<RespT>() {
      @Override
      public void onHeaders(Metadata headers) {
          // Process headers
      }
  }
  ```

- **Python**: Use the `Call` object to access metadata.
  ```python
  metadata = response.initial_metadata()
  ```

- **Go**: Use the `grpc.Trailer` method.
  ```go
  trailer := grpc.Trailer()
  ```

#### Server-Side

**Receiving Metadata:**

- **Java**: Use `ServerCall.Listener`.
  ```java
  new ServerCall.Listener<ReqT>() {
      @Override
      public void onHalfClose() {
          Metadata metadata = call.getAttributes().get(Grpc.TRANSPORT_ATTR_CLIENT_METADATA);
          // Process metadata
      }
  }
  ```

- **Python**: Access metadata from the context.
  ```python
  metadata = context.invocation_metadata()
  ```

- **Go**: Use `metadata.FromIncomingContext`.
  ```go
  md, ok := metadata.FromIncomingContext(ctx)
  ```

**Sending Metadata:**

- **Java**: Use `ServerCall`.
  ```java
  Metadata metadata = new Metadata();
  metadata.put(Metadata.Key.of("key-name", Metadata.ASCII_STRING_MARSHALLER), "value");
  call.sendHeaders(metadata);
  ```

- **Python**: Use `context.send_initial_metadata`.
  ```python
  context.send_initial_metadata((('key-name', 'value'),))
  ```

- **Go**: Use `grpc.SendHeader` and `grpc.SetTrailer`.
  ```go
  md := metadata.Pairs("key-name", "value")
  grpc.SendHeader(ctx, md)
  grpc.SetTrailer(ctx, md)
  ```

### Flow Chart for Sending and Receiving Metadata

#### Sending Metadata

1. **Client Application**
   - The client sets the metadata key-value pairs.
2. **Send Metadata with Request**
   - The client sends the request along with the metadata to the server.
3. **Server Receives Request and Metadata**
   - The server processes the request and metadata.
4. **Server Processes Metadata**
   - The server can read and act on the metadata.
5. **Server Responds with Metadata**
   - The server sends back response metadata.
6. **Client Receives Response and Metadata**
   - The client processes the response and metadata.

```plaintext
Client Application
    |
    v
Set Metadata
    |
    v
Send Request with Metadata
    |
    v
Server Receives Request and Metadata
    |
    v
Server Processes Metadata
    |
    v
Server Sends Response with Metadata
    |
    v
Client Receives Response and Metadata
```

#### Receiving Metadata

1. **Server Application**
   - The server sets the metadata key-value pairs.
2. **Send Metadata with Response**
   - The server sends the response along with the metadata to the client.
3. **Client Receives Response and Metadata**
   - The client processes the response and metadata.

```plaintext
Server Application
    |
    v
Set Metadata
    |
    v
Send Response with Metadata
    |
    v
Client Receives Response and Metadata
```

### Detailed Summary

1. **Request Metadata**:
    - Metadata sent from the client to the server with the RPC call.
    - Used for sending additional context such as authentication tokens.

2. **Response Metadata**:
    - Metadata sent from the server to the client along with the response.
    - Used for sending additional information related to the response.

3. **Trailing Metadata**:
    - Metadata sent at the end of the RPC.
    - Used for sending status information and other end-of-call data.

### Practical Use Cases

- **Authentication**: Sending JWT tokens or API keys in metadata for each RPC call.
- **User Context**: Sending user-related information, such as user ID or session ID.
- **Tracing**: Sending tracing information for distributed tracing systems.

### Conclusion

Sending and receiving metadata in gRPC provides a flexible mechanism to transmit additional information along with RPC calls. It enhances the capability of gRPC to handle complex scenarios like authentication, context propagation, and custom headers, making it a powerful tool for building robust distributed systems.