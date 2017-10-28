package RaceResultsService;

import java.util.Collection;
import java.util.HashSet;

public class RaceResultService {
    private Collection<Client> clients = new HashSet<Client>();

    public void addSubscriber(Client client) {
          clients.add(client);
    }

    public void send(Message message) {
       for(Client client : clients)
           client.recieve(message);
    }

    public void removeSubscriber(Client clientA) {
        clients.remove(clientA);
    }
}
