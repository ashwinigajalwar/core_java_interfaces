public class FTPConnection implements Connectable,Disconnectable,Sendable{

    @Override
    public void connect() {
        System.out.println("Connected to FTP Server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from FTP Server");
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message to FTP Server:"+ message);
    }
}
