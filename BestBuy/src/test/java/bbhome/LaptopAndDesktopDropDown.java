package bbhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class LaptopAndDesktopDropDown extends CommonAPI {

    @Test
    public void lapAndDesk(){
        driver.findElement(By.cssSelector(".btn-unstyled.menuHeader.active.flyBtn")).click();
        driver.findElement(By.cssSelector(".menu-item-button-44")).click();
        driver.findElement(By.cssSelector("#header-menu-44 li:nth-child(1)")).click();
        List<WebElement> products = driver.findElements(By.cssSelector(".sidecar-menu sidecar-menu-0 .header-menu li a"));
        for(WebElement product:products) {
            System.out.println(product.getText());
        }
    }
}
