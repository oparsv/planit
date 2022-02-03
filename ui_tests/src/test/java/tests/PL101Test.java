package tests;

import common.BaseTestSuite;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import planitPageObjects.planitPages.loginPage.LoginPage;

import static common.utils.PropertyUtils.prop;

public class PL101Test extends BaseTestSuite {

        @Test
        @Owner("owner")
        @Severity(SeverityLevel.CRITICAL)
        @DisplayName("101 Check login")
        public void Test_101() {
                LoginPage loginPage = new LoginPage();
                loginPage.login(prop("loginBaseUser"), prop("passwordBaseUser"));
        }
}
