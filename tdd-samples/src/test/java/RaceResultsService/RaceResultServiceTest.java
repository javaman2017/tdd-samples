package RaceResultsService;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class RaceResultServiceTest {

    RaceResultService racesResults = new RaceResultService();
    Client clientA = mock(Client.class,"clientA");
    Client clientB = mock(Client.class,"clientB");
    Message message = mock(Message.class);

    // zero subscribers
    @Test
    public void nonSubscribedClientsShouldNotRecieveMessages(){
        racesResults.send(message);

        verify(clientA,never()).recieve(message);
        verify(clientB,never()).recieve(message);
    }

    // one subscriber
    @Test
    public void subscribedClientShouldRecieveMessages(){
        racesResults.addSubscriber(clientA);
        racesResults.send(message);

        verify(clientA).recieve(message);
    }

    // two subscribers
    @Test
    public void allSubscribedClientsShouldRecieveMessages(){
        racesResults.addSubscriber(clientA);
        racesResults.addSubscriber(clientB);
        racesResults.send(message);

        verify(clientA).recieve(message);
        verify(clientB).recieve(message);
    }

    @Test
    public void shouldSendOnlyOneMethodToMultiSubscriber(){
        racesResults.addSubscriber(clientA);
        racesResults.addSubscriber(clientA);
        racesResults.send(message);

        verify(clientA).recieve(message);
    }

    @Test
    public void unsubscribedClientsShouldNotReceiveMessages(){
        racesResults.addSubscriber(clientA);
        racesResults.removeSubscriber(clientA);

        racesResults.send(message);

        verify(clientA,never()).recieve(message);
    }
}
