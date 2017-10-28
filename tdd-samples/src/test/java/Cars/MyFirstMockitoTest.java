package Cars;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

public class MyFirstMockitoTest {

    private Car myFerrari = Mockito.mock(Car.class);

    @Test
    public void testIfCarIsCar(){
        assertTrue(myFerrari instanceof Car);
    }
}
