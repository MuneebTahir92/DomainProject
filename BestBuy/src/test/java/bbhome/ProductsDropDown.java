package bbhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class ProductsDropDown extends CommonAPI {

    @Test
    public void products(){
        driver.findElement(By.cssSelector(".btn-unstyled.menuHeader.active.flyBtn")).click();
        List<WebElement> products = driver.findElements(By.cssSelector(".flyout-content #header-menu-166 li h3"));
        for(WebElement product:products){
            System.out.println(product.getText());
        }
    }
}
