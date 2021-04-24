package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using = "#userId-text-input-field")
    public static WebElement typeUserNameFieldWebElement;

    @FindBy(how = How.CSS, using = "#password-text-input-field")
    public static WebElement typePasswordFieldWebElement;

    @FindBy(how = How.CSS, using = "#input-rememberMe")
    public static WebElement rememberMeBoxWebElement;

    @FindBy(how = How.CSS, using = "#signin-button")
    public static WebElement signInButtonWebElement;

    @FindBy(how = How.CSS, using = ".chaseanalytics-track-link.language-toggle")
    public static WebElement spanishLanguageWebElement;

    @FindBy(how = How.CSS, using = ".header__section__item header__section--search.icon-search")
    public static WebElement searchButtonWebElement;

    @FindBy(how = How.CSS, using = ".header__section--search__bar--search-input")
    public static WebElement searchFieldWebElement;

    public void typeUserName(String username){
        typeUserNameFieldWebElement.sendKeys(username, Keys.ENTER);
    }

    public void typePassWord(String password){
        typePasswordFieldWebElement.sendKeys(password, Keys.ENTER);
    }

    public void clickRememberMeBox(){
        rememberMeBoxWebElement.click();
    }

    public void clickOnSignInButton(){
        signInButtonWebElement.click();
    }

    public void signInWithInfo(String username, String password){
        typeUserNameFieldWebElement.sendKeys(username, Keys.ENTER);
        typePasswordFieldWebElement.sendKeys(password, Keys.ENTER);
        signInButtonWebElement.click();
    }

    public void switchToSpanish(){
        spanishLanguageWebElement.click();
    }

    public void searchForSomething(String input){
        searchButtonWebElement.click();
        searchButtonWebElement.sendKeys(input, Keys.ENTER);
    }
}
