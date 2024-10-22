public class WebSocketConnection implements Connectable,Disconnectable,Sendable,Receivable{

    @Override
    public void connect() {
        System.out.println("Connected to websocket");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from websocket");
    }

    @Override
    public void send(String message) {
        System.out.println("WebSocket Sending message:"+ message);
    }

    @Override
    public void receive() {
        System.out.println("WebSocket Receiving message");
    }
}
