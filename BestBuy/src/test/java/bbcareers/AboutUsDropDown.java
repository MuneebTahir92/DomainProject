package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class AboutUsDropDown extends CommonAPI {

    @Test
    public void aboutThemDropDown(){
        List<WebElement> about = driver.findElements(By.cssSelector("#menu-menu-1 ##867 .sub-menu li"));
        for(WebElement us:about){
            System.out.println(us);
        }
    }
}
