package Org.exo2;

import com.google.javascript.jscomp.deps.ServiceException;
import org.exo2.UserService;
import org.exo2.Utilisateur;
import org.exo2.UtilisateurApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Test
    public void testCreerUtilisateur() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("dhia", "benammar", "dhia@gmail.com");
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);
        UserService userService = new UserService(utilisateurApiMock);
        userService.creerUtilisateur(utilisateur);
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }
}