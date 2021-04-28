package chasebusiness;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import start.CommonAPI;

public class LearnAboutVeteranBanking extends CommonAPI {

    @Test
    public void veterans(){
        driver.findElement(By.cssSelector(".module-bucket--tile__action-link.regular-link.chaseanalytics-track-link")).click();
    }
}
