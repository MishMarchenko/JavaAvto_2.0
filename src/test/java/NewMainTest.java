import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;


public class NewMainTest {
    public static void main(String[] args) {
        By history = By.xpath("//h3[@id='p-views-label']/following-sibling::div//li[3]");
        By search = By.xpath("//input[@name='search']");
        By result = By.xpath("//h1[@id='firstHeading']");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://uk.wikipedia.org/");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().maximize();
        driver.navigate().refresh();
        clickElement(driver, history);
        sendElement(driver, search, "Odesa");
        clickEnter(driver, search);
//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        assertEquals("Результати пошуку", getTextFromElement(driver, result));

        driver.quit();
    }
    static void clickElement(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(d -> d.findElement(locator)).click();
    }
    static void sendElement(WebDriver driver, By locator, String text){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }
    static void clickEnter(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(d -> d.findElement(locator)).sendKeys(Keys.ENTER);
    }
    static String getTextFromElement(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(d -> d.findElement(locator)).getText();
    }
}
