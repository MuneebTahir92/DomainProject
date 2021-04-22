package bbhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class BrandsDropDown extends CommonAPI {

    @Test
    public void listOfBrands(){
        driver.findElement(By.cssSelector(".btn-unstyled menuHeader.flyBtn")).click();
        List<WebElement> brands = driver.findElements(By.cssSelector("#header-menu-3"));
        for(WebElement brand:brands){
            System.out.println(brand.getText());
        }
    }
}
