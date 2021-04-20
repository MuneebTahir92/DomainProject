package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class BestBuyCityLocations extends CommonAPI {

    @Test
    public List<String> cityLocations(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.searchJobs("manager");
        careersPage.clickOnSearchSubmitButton();
        List<WebElement> cities = driver.findElements(By.cssSelector("#location-select-dropdown option"));
        List<String> locations = new ArrayList<String>();
        for(WebElement city:cities){
            locations.add(city.getText());
        }
        return locations;
    }
}
