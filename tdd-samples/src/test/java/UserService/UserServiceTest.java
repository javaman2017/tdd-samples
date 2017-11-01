package UserService;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void shouldAssignPasswordToUser() throws Exception {
        User user = mock(User.class);
        UserDAO userDAO = mock(UserDAO.class);
        SecurityService securityService = mock(SecurityService.class);

        UserServiceImpl userServiceImpl = new UserServiceImpl(userDAO,securityService);

        

    }
}
