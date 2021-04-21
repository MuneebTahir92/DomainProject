package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JobSearchPage {

    @FindBy(how = How.CSS, using = ".UnderLineLink")
    public static WebElement signInButtonWebElement;

    @FindBy(how = How.CSS, using = "#initialSearchBox__00Q")
    public static WebElement searchJobsOpportunitesFieldWebElement;

    @FindBy(how = How.CSS, using = "#initialSearchBox__00R")
    public static WebElement searchLocationsFieldWebElement;

    @FindBy(how = How.CSS, using = ".ladda-label")
    public static WebElement searchButtonWebElement;

    public void clickOnSignInButton(){
        signInButtonWebElement.click();
    }

    public void searchPositions(String value){
        searchJobsOpportunitesFieldWebElement.sendKeys(value, Keys.ENTER);
    }

    public void searchLocations(String value){
        searchLocationsFieldWebElement.sendKeys(value, Keys.ENTER);
    }

    public void clickOnSearchButton(){
        searchButtonWebElement.click();
    }

    public void positionNLocationNEnter(String positionValue, String locationValue){
        searchJobsOpportunitesFieldWebElement.sendKeys(positionValue, Keys.ENTER);
        searchLocationsFieldWebElement.sendKeys(locationValue, Keys.ENTER);
        searchButtonWebElement.click();
    }
}
