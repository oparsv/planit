package planitPageObjects.planitPages.loginPage;

import planitPageObjects.basePage.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    LoginPageLocators loginPageLocators = new LoginPageLocators();

    /**
     * login to Planit
     * @param username - login
     * @param password - password
     */
    public void login(String username, String password) {
        $(loginPageLocators.loginField).setValue(username);
        $(loginPageLocators.passwordField).setValue(password);
        $(loginPageLocators.signInButton).click();
    }

//    public void loginAsReleaseManager() {
//        login(loginPageLocators.releaseManagerUser, loginPageLocators.releaseManagerPassword);
//    }
}
