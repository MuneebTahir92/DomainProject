package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class BBJobCategories extends CommonAPI {

    @Test
    public List<String> jobCategories(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.searchJobs("manager");
        careersPage.clickOnSearchSubmitButton();
        List<WebElement> jobs = driver.findElements(By.cssSelector("#job-select-dropdown option"));
        List<String> categories = new ArrayList<String>();
        for(WebElement city:jobs){
            categories.add(city.getText());
        }
        return categories;
    }
}
