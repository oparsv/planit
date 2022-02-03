//package planit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.BrowserType;
//import planit.planitPages.loginPage.LoginPage;
//import planit.planitPages.releasesPage.ReleasesPage;
//
//import java.util.concurrent.TimeUnit;
//
//public class Application {
//
//    public WebDriver wd;
//
//    protected LoginPage loginPage;
//    protected ReleasesPage releasesPage;
//    private final String browser;
//
//    public Application(String browser) {
//        this.browser = browser;
//    }
//
//    public void init() {
//     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ezudin\\Downloads\\chromedriver.exe");
//
//        switch (browser) {
//            case BrowserType.CHROME:
//                wd = new ChromeDriver();
//                break;
//            case BrowserType.FIREFOX:
//                wd = new FirefoxDriver();
//                break;
//            case BrowserType.EDGE:
//                wd = new EdgeDriver();
//                break;
//        }
//
//        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        releasesPage = new ReleasesPage(wd);
//        loginPage = new LoginPage(wd);
//    }
//
//    public void goToLoginPage() {
//        wd.get("https://planit-tests.lab.nordigy.ru");
//        wd.findElement(By.linkText("Sign In")).click();
//    }
//
//    public void stop() {
//        wd.quit();
//    }
//
//    public void goToReleasesPage() {
//        wd.findElement(By.xpath("//div[@id='header']/div/div/div/mat-icon")).click();
//        wd.findElement(By.xpath("//div[@id='app']/mat-sidenav-container/mat-sidenav/div/app-sidenav/mat-nav-list/app-sidenav-block/app-sidenav-link/div/a/div/span")).click();
//    }
//
//    public ReleasesPage releasesPage() {
//        return releasesPage;
//    }
//
//    public LoginPage loginPage() {
//        return loginPage;
//    }
//}
