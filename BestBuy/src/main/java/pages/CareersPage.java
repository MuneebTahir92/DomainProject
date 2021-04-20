package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CareersPage {

    @FindBy(how = How.CSS, using = ".quick-search-keywords")
    public static WebElement searchJobsWebElement;

    @FindBy(how = How.CSS, using = ".search-jobs-image-button-rand")
    public static WebElement searchJobsSubmitButtonWebElement;

    @FindBy(how = How.CSS, using = ".s2-appy-now")
    public static WebElement searchOpeningsButtonWebElement;

    @FindBy(how = How.CSS, using = ".s2-login")
    public static WebElement alreadyAppliedLoginButtonWebElement;

    public void searchJobs(String value){
        searchJobsWebElement.sendKeys(value, Keys.ENTER);
    }

    public void clickOnSearchSubmitButton(){
        searchJobsSubmitButtonWebElement.click();
    }

    public void clickOnSearchOpeningsButton(){
        searchOpeningsButtonWebElement.click();
    }

    public void clickOnAlreadyAppliedButton(){
        alreadyAppliedLoginButtonWebElement.click();
    }

}
