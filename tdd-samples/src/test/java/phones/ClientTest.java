package phones;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientTest {

    Client client = new Client();
    final static Phone MOBILE_PHONE = mock(Phone.class);
    final static Phone STATIONARY_PHONE = mock(Phone.class);

    @Test
    public void shouldReturnTrueIfClientHasMobile(){
        client.addPhone(MOBILE_PHONE);
        client.addPhone(STATIONARY_PHONE);

        when(MOBILE_PHONE.isMobile()).thenReturn(true);

        assertTrue("when we add a mobile phone to a client Client.hasMobile should return true",
                   client.hasMobile());
    }

    @Test
    public void shouldReturnFalseIfClientHasNoMobile(){
        client.addPhone(STATIONARY_PHONE);

        assertFalse("when no mobile phone has been added to a client, Client.hasMobile should return false",
                    client.hasMobile());
    }
}