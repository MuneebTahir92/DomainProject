package bbhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class ComputersAndTabletsDropDown extends CommonAPI {

    @Test
    public void compAndTablet(){
        driver.findElement(By.cssSelector(".btn-unstyled.menuHeader.active.flyBtn")).click();
        driver.findElement(By.cssSelector(".menu-item-button-44")).click();
        List<WebElement> products = driver.findElements(By.cssSelector(".flyout-content #header-menu-44 li"));
        for(WebElement product:products) {
            System.out.println(product.getText());
        }
    }
}
