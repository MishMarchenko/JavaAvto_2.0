package Builders;

import PO.LoginPage;

public class LoginPageBuilder {
    private String userName;
    private String password;
    public LoginPageBuilder withUserName(String userName){
        this.userName = userName;
        return this;
    }
    public LoginPageBuilder withPassword(String password){
        this.password = password;
        return this;
    }
    public LoginPage build(){
        return new LoginPage()
                .enterUserName(userName)
                .enterPassword(password);
    }
}
