package bbhome;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import start.CommonAPI;

public class DealOfTheDay extends CommonAPI {

    @Test
    public void currentDOTD(){
        driver.findElement(By.cssSelector(".right-container .top-nav-items li:nth-child(3) a")).click();
        String currentDeal = driver.findElement(By.cssSelector(".wf-offer-description productV2 .heading product-title a")).getText();
        System.out.println(currentDeal);
    }
}
