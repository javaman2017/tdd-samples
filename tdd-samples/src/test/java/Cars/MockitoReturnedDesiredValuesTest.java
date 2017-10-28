package Cars;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoReturnedDesiredValuesTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testStubbing(){
        assertFalse("new test double should return false as boolean",myFerrari.needsFuel());

        when(myFerrari.needsFuel()).thenReturn(true);

        assertTrue("After instructed test double should return what we want",myFerrari.needsFuel());
    }
}
