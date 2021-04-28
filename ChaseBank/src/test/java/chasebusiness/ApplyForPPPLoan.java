package chasebusiness;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BusinessPage;
import start.CommonAPI;

public class ApplyForPPPLoan extends CommonAPI {

    @Test
    public void apply(){
        BusinessPage businessPage = PageFactory.initElements(driver, BusinessPage.class);
        businessPage.goToPPPWebsite();
        driver.findElement(By.cssSelector(".chaseanalytics-track-link")).click();
        driver.findElement(By.cssSelector(".button.primary.promo-btn.chaseanalytics-track-link")).click();
    }
}
