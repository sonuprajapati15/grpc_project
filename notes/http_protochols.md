### HTTP Versions: Evolution and Key Features

#### HTTP/1 (1996)
- **Introduction**: HTTP/1 was introduced in 1996.
- **Transport Layer**: Built on top of TCP.
- **Connection Handling**: Each request to the same server requires a separate TCP connection, leading to multiple connections.

#### HTTP/1.1 (1997)
- **Introduction**: Followed HTTP/1 in 1997.
- **Persistent Connections**: Introduced a keep-alive mechanism allowing reuse of connections for multiple requests.
  - **Benefit**: Reduces latency as it avoids the need for a new TCP handshake for each request.
- **HTTP Pipelining**: Allows sending multiple requests before receiving responses.
  - **Challenges**: Responses must be received in order, causing implementation issues and poor handling by proxy servers.
  - **Outcome**: Eventually removed from many browsers.
- **Head-of-Line Blocking**: Requests must wait for the previous ones to complete. A single blocked request affects all subsequent requests.
  - **Solution**: Browsers maintain multiple TCP connections to send parallel requests.

#### HTTP/2 (2015)
- **Introduction**: Published in 2015.
- **HTTP Streams**: Multiple streams of requests can be sent over a single TCP connection.
  - **Independence**: Streams are independent; no need for ordered sending/receiving.
  - **Head-of-Line Blocking**: Solves the issue at the application layer, though not at the TCP layer.
- **Server Push**: Servers can send updates to clients proactively without waiting for client requests.

#### HTTP/3 (2022)
- **Introduction**: Standardized in June 2022.
- **Transport Protocol**: Uses QUIC instead of TCP.
  - **Based on**: UDP.
  - **First-Class Streams**: Streams are fundamental at the transport layer, allowing independent delivery.
- **Eliminates Head-of-Line Blocking**: Packet loss in one stream does not affect others.
- **Designed for Mobile Usage**: Optimized for devices that frequently switch networks.
  - **Connection ID**: Allows seamless switching of connections across different IP addresses and networks.
- **Adoption**: Despite being new, it is used by 25% of websites and supported by many browsers.

### Summary
- **HTTP/1**: Multiple TCP connections for each request, leading to inefficiencies.
- **HTTP/1.1**: Introduced persistent connections and pipelining, reducing latency but facing implementation issues.
- **HTTP/2**: Introduced independent streams within a single TCP connection, solving application-layer head-of-line blocking and enabling server push.
- **HTTP/3**: Uses QUIC over UDP, eliminating head-of-line blocking at the transport layer, designed for mobile environments, and supports efficient network switching.

### Key Takeaways
- **HTTP/1.1** and **HTTP/2** made significant improvements in reducing latency and improving performance but still faced limitations due to TCP's head-of-line blocking.
- **HTTP/3**'s adoption of QUIC addresses these limitations, offering a more robust and efficient protocol for modern web usage.

