package chasehome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class OpenAnAccountElements extends CommonAPI {

    @Test
    public List<WebElement> getElements(){
        List<WebElement> accounts = driver.findElements(By.cssSelector(".header__section--dropdown__title"));

        return accounts;
    }
}
