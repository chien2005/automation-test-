package PageObject;

import AbstractWeb.WebUI;
import PageUI.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends WebUI {
    WebDriver driver;
    WebUI webUI;
    LoginPageUI loginPageUI;

    public LoginPageObject(WebDriver driver) {
        super(driver);
        //this.driver = driver;
    }

    public DashboardPage login() {
        webUI = new WebUI(driver);
        loginPageUI = new LoginPageUI();
        webUI.setText(loginPageUI.USERNAME, "abc");
        webUI.setText(loginPageUI.PASSWORD,"abc");
        webUI.clickElement(loginPageUI.LOGIN);
        return new DashboardPage(driver);
    }
}
