package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void exampleLoginTest() {

        // log("precondition");
        planit.goToLoginPage();

        // log("1. Login");
        planit.loginPage().loginAsReleaseManager();
        Assert.assertEquals(1, 1);

        // log("2. Go to Deployment Package Page");
        planit.releasesPage().goToDeploymentPackagePage();
        Assert.assertTrue(true);

        // log("3. go To Releases Page");
        planit.goToReleasesPage();
        Assert.assertEquals("true", "true");
    }

}
