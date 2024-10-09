package PO;

import Base.BaseMethod;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethod {
    private final By logInButton = By.xpath("//li[@id='pt-login']//span");
    private final By nameField = By.xpath("//input[@id='wpName1']");
    private final By passwordField = By.xpath("//input[@id='wpPassword1']");
    private final By userName = By.xpath("//a[@class='new']/span");

    public void clickLogInButton(){
        click(logInButton);
    }
    public void enterName(String text){
        send(nameField, text);
    }
    public void enterPassword(String text){
        send(passwordField, text);
    }
    public void enterCredentials(){
        clickEnter(nameField);
    }
    public String userNameChecks(){
        return getTextFromElement(userName);
    }
}
