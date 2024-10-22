import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HTTPConnection http = new HTTPConnection();
        FTPConnection ftp = new FTPConnection();
        WebSocketConnection websocket = new WebSocketConnection();


        List<Connectable> connectables = Arrays.asList(http,ftp,websocket);
        List<Disconnectable> disconnectables= Arrays.asList(http,ftp,websocket);
        List<Sendable> sendables= Arrays.asList(http,ftp,websocket);
        List<Receivable> receivables= Arrays.asList(http,websocket);


        NetworkManager networkManager = new NetworkManager(connectables,disconnectables,sendables,receivables);

        networkManager.establishConnection();
        networkManager.sendMessage("Message Sent Successfully");
        networkManager.receiveMessage();
        networkManager.disconnectAll();

    }
}
