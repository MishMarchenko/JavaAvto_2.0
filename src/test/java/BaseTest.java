import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static config.WebDriverInit.*;

public class BaseTest {
    WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        driver = getDriver();
        driver.get("https://uk.wikipedia.org/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        closeDriver();
    }
}
