public class HTTPConnection implements Connectable,Disconnectable,Sendable,Receivable{

    @Override
    public void connect() {
        System.out.println("Connected to HTTP Server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from HTTP Server");
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message to HTTP Server:"+ message);
    }

    @Override
    public void receive() {
        System.out.println("Received from HTTP Server");
    }

}
