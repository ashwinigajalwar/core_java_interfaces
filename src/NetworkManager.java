import java.util.List;

public class NetworkManager {

   private final List<Connectable> connectables;
   private final List<Disconnectable> disconnectables;
   private final List<Sendable> sendables;
   private final List<Receivable> receivables;

    public NetworkManager(List<Connectable> connectables, List<Disconnectable> disconnectables, List<Sendable> sendables, List<Receivable> receivables) {
        this.connectables = connectables;
        this.disconnectables = disconnectables;
        this.sendables = sendables;
        this.receivables = receivables;
    }

    public void establishConnection() {
        for (Connectable connectable : connectables) {
            connectable.connect();
        }
    }

    public void sendMessage(String message) {
        for (Sendable sendable : sendables) {
            sendable.send(message);
        }
    }

    public void receiveMessage() {
        for (Receivable receivable : receivables) {
            receivable.receive();
        }
    }

    public void disconnectAll() {
        for (Disconnectable disconnectable : disconnectables) {
            disconnectable.disconnect();
        }
    }
}
