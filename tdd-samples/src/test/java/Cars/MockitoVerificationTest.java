package Cars;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockitoVerificationTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerficiation(){
        myFerrari.driveTo("Sweet home Alabama");
        myFerrari.needsFuel();

        verify(myFerrari).driveTo("Sweet home Alabama");
        verify(myFerrari).needsFuel();
    }


}
