package chasebusiness;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import start.CommonAPI;

public class CorporationChecklistPDF extends CommonAPI {

    @Test
    public void checklist(){
        driver.findElement(By.cssSelector(".module-bucket--tile__action-link.regular-link.chaseanalytics-track-link")).click();
        driver.findElement(By.cssSelector(".chaseanalytics-opt-doc-dnld.caret-link-rte")).click();
    }
}
