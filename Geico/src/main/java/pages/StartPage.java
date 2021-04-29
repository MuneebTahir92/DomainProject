package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StartPage {

    @FindBy(how = How.CSS, using = "#header-left-links .desktop-links li:nth-child(1)")
    public static WebElement insuranceDropDownWebElement;

    @FindBy(how = How.CSS,using = "#header-left-links .desktop-links li:nth-child(2)")
    public static WebElement informationDropDownWebElement;

    @FindBy(how = How.CSS,using = ".icon-geolocation")
    public static WebElement locationWebElement;

    @FindBy(how = How.CSS, using = ".user-zip")
    public static WebElement zipCodeTextBox;

    @FindBy(how = How.CSS, using = ".login.header-right-label")
    public static WebElement logInButtonWebElement;

    @FindBy(how = How.CSS, using = ".search")
    public static WebElement searchButtonWebElement;

    @FindBy(how = How.CSS, using = ".claims-center-links p:nth-child(1) a")
    public static WebElement trackAClaimButtonWebElement;

    public void clickOnInsuranceDropDown(){
        insuranceDropDownWebElement.click();
    }

    public void clickOnInformationDropDown(){
        informationDropDownWebElement.click();
    }

    public void enterZipCode(){

    }
}
