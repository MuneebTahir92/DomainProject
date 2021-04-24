package chasehome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import start.CommonAPI;

public class SearchSomething extends CommonAPI {

    @Test
    public void search(){
        driver.findElement(By.cssSelector(".header__section__item header__section--search icon-search")).click();
        driver.findElement(By.cssSelector(".header__section--search__bar--search-input")).sendKeys("checking", Keys.ENTER);
    }
}
