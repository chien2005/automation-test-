package RunTestCase;

import AbstractWeb.WebUI;
import BaseSetup.BaseSetUp;
import PageObject.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends BaseSetUp {
    private WebDriver driver;
    WebUI webUI;
    LoginPageObject loginPageObject;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test()
    public void LoginTest() throws Exception {
        loginPageObject = new LoginPageObject(driver);
        //Assert.assertTrue(webUI.verifyElementText(LoginPageUI.LOGIN,"dang nhap"));
        loginPageObject.login();
    }


}
