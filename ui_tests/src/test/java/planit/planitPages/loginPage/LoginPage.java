package planit.planitPages.loginPage;

import org.openqa.selenium.WebDriver;
import planit.planitPages.PageBase;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver wd) {
        super(wd);
    }

    LoginPageLocators locators = new LoginPageLocators();

    public void login(String username, String password) {
        type(locators.loginField, username);
        type(locators.passwordField, password);
        click(locators.signInButton);
    }

    public void loginAsReleaseManager() {
        login(locators.releaseManagerUser, locators.releaseManagerPassword);
    }
}
