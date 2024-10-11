import Builders.LoginPageBuilder;
import PO.ArticlePage;
import PO.LoginPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LogInTest extends BaseTest{
    ArticlePage article = new ArticlePage();
    @Test
    void checkUserNameAfterLogIn(){
        article.clickLogInButton();
        article.enterName("МихоАвто");
        article.enterPassword("qwer1608QWER");
        article.enterCredentials();
        assertEquals("МихоАвто", article.userNameChecks());
    }
    @Test
    void shouldBeEnterToTheSystem(){
        new LoginPage()
                .clickLogIn();
        LoginPage login = new LoginPageBuilder()
                .withUserName("МихоАвто")
                .withPassword("qwer1608QWER")
                .build();
        login.clickEnter();
    }
}
