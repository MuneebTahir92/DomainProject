package chasebusiness;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import start.CommonAPI;

public class DownloadChaseApp extends CommonAPI {

    @Test
    public void download(){
        driver.findElement(By.cssSelector(".hero__content--cta.cta.cta--btn-green-aloe.ta--small")).click();
    }
}
