package Cars;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MockitoFailedVerificationArguments {

    private Car myFerrai = mock(Car.class);

    @Test
    public void testVerificationFailureArguments(){
        myFerrai.driveTo("Sweet home Alabama");
        verify(myFerrai).driveTo("Sweet home Belfast");
    }
}
