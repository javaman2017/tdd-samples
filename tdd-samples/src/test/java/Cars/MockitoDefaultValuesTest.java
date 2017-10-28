package Cars;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MockitoDefaultValuesTest {
    private Car myFerrari = Mockito.mock(Car.class);

    @Test
    public void testDefaultBehaviourOfTestDouble(){
        assertFalse("new test double should return false as boolean",myFerrari.needsFuel());
        assertEquals("new test double should return 0.0 as a double",0.0,myFerrari.getEngineTemperature(),0.0);
    }
}
