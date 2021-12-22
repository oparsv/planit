package planit.planitPages.releasesPage;

import org.openqa.selenium.WebDriver;
import planit.planitPages.PageBase;

public class ReleasesPage extends PageBase {

    public ReleasesPage(WebDriver wd) {
        super(wd);
    }

    ReleasesPageLocators locators = new ReleasesPageLocators();

    public void goToDeploymentPackagePage() {
        click(locators.sideMenu);
        click(locators.deploymentPackagesOption);
    }
}
