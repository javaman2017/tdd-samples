package Cars;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockitoFailedVerificationTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerficationFailure(){
        myFerrari.needsFuel();

        verify(myFerrari).getEngineTemperature();
    }
}
