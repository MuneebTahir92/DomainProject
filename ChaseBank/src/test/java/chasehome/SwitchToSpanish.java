package chasehome;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import start.CommonAPI;

public class SwitchToSpanish extends CommonAPI {

    @Test
    public void spanish(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.switchToSpanish();
    }
}
