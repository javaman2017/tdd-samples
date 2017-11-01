package exceptions;

import org.junit.Test;
import org.mockito.Mockito;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class RequestHandlerIVRTest {
    @Test
    public void shouldThrowInvalidRequestExceptionForInvalidRequest() throws InvalidRequestException {
        RequestProcessor requestProcessor = mock(RequestProcessor.class);
        RequestHandler sut = new RequestHandler(requestProcessor);

        Request request = null;

        catchException(sut).handle(request);

        assertTrue("should have thrown an instance of InvalidRequestException",
                caughtException() instanceof InvalidRequestException);

        Mockito.verifyZeroInteractions(requestProcessor);
    }
}
