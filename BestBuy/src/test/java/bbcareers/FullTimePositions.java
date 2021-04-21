package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

public class FullTimePositions extends CommonAPI {

    @Test
    public void fullTime(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnAlreadyAppliedButton();
        driver.findElement(By.cssSelector(".powerSearchLink")).click();
        driver.findElement(By.cssSelector(".checkbox.ng-pristine.ng-valid")).click();
        driver.findElement(By.cssSelector(".button-label.ng-binding")).click();
    }
}
