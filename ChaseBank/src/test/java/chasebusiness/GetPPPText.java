package chasebusiness;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BusinessPage;
import start.CommonAPI;

public class GetPPPText extends CommonAPI {

    @Test
    public void getText(){
        BusinessPage businessPage = PageFactory.initElements(driver, BusinessPage.class);
        businessPage.goToPPPWebsite();
        driver.findElement(By.cssSelector(".cmp-text p")).getText();
    }
}
