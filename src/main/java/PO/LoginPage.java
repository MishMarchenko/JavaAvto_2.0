package PO;

import Base.BaseMethod;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethod {
    private String userName;
    private String password;

    private final By logInButton = By.xpath("//li[@id='pt-login']//span");
    private final By nameField = By.xpath("//input[@id='wpName1']");
    private final By passwordField = By.xpath("//input[@id='wpPassword1']");
    private final By enterButton = By.xpath("//button[@id='wpLoginAttempt']");
    private final By errorMessage = By.xpath("//div[@class='cdx-message__content']");
    public LoginPage clickLogIn(){
        click(logInButton);
        return this;
    }

    public LoginPage enterUserName(String userName){
        this.userName = userName;
        send(nameField, userName);
        return this;
    }
    public LoginPage enterPassword(String password){
        this.password = password;
        send(passwordField, password);
        return this;
    }
    public void clickEnter(){
        click(enterButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
