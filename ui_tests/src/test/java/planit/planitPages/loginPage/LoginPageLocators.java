package planit.planitPages.loginPage;


import org.openqa.selenium.By;

public class LoginPageLocators {

    protected String releaseManagerUser = "RMP_bot_testing_Manager";
    protected String releaseManagerPassword = "RMP121PMP2000";

    By loginField = By.name("login");
    By passwordField = By.name("password");
    By signInButton = By.name("commit");
}
