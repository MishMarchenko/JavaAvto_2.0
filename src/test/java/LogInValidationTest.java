import PO.LoginPage;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LogInValidationTest extends BaseTest{
    @Test
    void incorrectUserName(){
        new LoginPage()
                .clickLogIn()
                .enterUserName("BlaBla")
                .enterPassword("qwer1608QWER")
                .clickEnter();
        assertThat(new LoginPage().getErrorMessage())
                .as("Error message is appeared")
                .isEqualTo("Ви ввели хибне ім'я користувача або пароль. Будь ласка, спробуйте знову.");
    }
    @Test
    void incorrectPassword(){
        new LoginPage()
                .clickLogIn()
                .enterUserName("МихоАвто")
                .enterPassword("qwerQWER")
                .clickEnter();
        assertThat(new LoginPage().getErrorMessage())
                .as("Error message is appeared")
                .isEqualTo("Ви ввели хибне ім'я користувача або пароль. Будь ласка, спробуйте знову.");
    }
}
