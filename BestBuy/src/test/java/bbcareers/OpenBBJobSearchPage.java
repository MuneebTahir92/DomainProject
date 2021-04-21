package bbcareers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

public class OpenBBJobSearchPage extends CommonAPI {

    @Test
    public void openPage(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnAlreadyAppliedButton();
    }
}
