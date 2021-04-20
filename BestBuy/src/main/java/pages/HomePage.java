package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using = ".search-input")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS,using = ".top-navigation-container .right-container .top-nav-items li:nth-child(2) a")
    public static WebElement topDealsWebElement;

    @FindBy(how = How.CSS,using = ".top-navigation-container .right-container .top-nav-items li:nth-child(3) a")
    public static WebElement dealOfTheDayWebElement;

    @FindBy(how = How.CSS, using = ".utility-navigation a:nth-child(1)")
    public static WebElement corporateInformationWebElement;

    @FindBy(how = How.CSS, using = ".utility-navigation a:nth-child(3)")
    public static WebElement careersWebElement;

    @FindBy(how = How.CSS, using = ".utility-navigation a:nth-child(5)")
    public static WebElement termsAndConditionsWebElement;

    public void clickOnTopDeals(){
        topDealsWebElement.click();
    }
    public void clickOnDealOfTheDay(){
        dealOfTheDayWebElement.click();
    }
    public void search(String value){
        searchWebElement.sendKeys(value, Keys.ENTER);
    }

    public void clickOnCorporateInfo(){
        corporateInformationWebElement.click();
    }

    public void clickOnCareers(){
        careersWebElement.click();
    }

    public void termsAndConditions(){
        termsAndConditionsWebElement.click();
    }
}
