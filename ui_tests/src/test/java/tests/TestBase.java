package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import planit.Application;

public class TestBase {

    protected final Application planit = new Application(BrowserType.CHROME);

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        planit.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        planit.stop();
    }

}
