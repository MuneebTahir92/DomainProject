package chasehome;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import start.CommonAPI;

public class SignIntoAccount extends CommonAPI {

    @Test
    public void signIn(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.signInWithInfo("muneeb", "abc123");
    }
}
