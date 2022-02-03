package common;

import com.codeborne.selenide.Configuration;
import common.lifecycle.BeforeAfterExtension;
import common.utils.AllureUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.open;
import static common.utils.PropertyUtils.prop;


@ExtendWith(BeforeAfterExtension.class)
public class BaseTestSuite {

    static {
        System.setProperty("selenide.browser", prop("selenide.browser"));
//        System.setProperty("selenide.browser", "chrome");
        Configuration.timeout = 8000;
        Configuration.browserSize = "1920x1080";
//        Configuration.baseUrl = prop("baseUrl");

//        if (!prop("selenide.browser").contains("SelenoidProvider")) {
//            System.setProperty("webdriver.chrome.driver", prop("webdriver.drivers.path"));
////            Configuration.startMaximized = true;
//        }

        AllureUtils.createEnvironmentProperties();
    }

    @BeforeAll
    public static void beforeTestSuite() {
        open(prop("baseUrl"));
//        login();
    }
//
//    @BeforeEach
//    public void beforeEachTest() {
//        open(prop("url"));
//    }
//
    @AfterAll
    public static void afterTestSuite() {
//        close();
    }
}
