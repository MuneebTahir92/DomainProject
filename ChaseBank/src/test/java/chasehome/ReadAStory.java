package chasehome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class ReadAStory extends CommonAPI {

    @Test
    public void spotlightStory(){
        driver.findElement(By.cssSelector(".module-bucket--tile__desc")).click();
        List<WebElement> data = driver.findElements(By.cssSelector(".stories event__body.ss-print"));
        for(WebElement value:data){
            System.out.println(value.getText());
        }
    }
}
