package bbcareers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.JobSearchPage;
import start.CommonAPI;

public class SearchForJob extends CommonAPI {

    @Test
    public void getAJob(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnAlreadyAppliedButton();
        JobSearchPage jobSearchPage = PageFactory.initElements(driver, JobSearchPage.class);
        jobSearchPage.positionNLocationNEnter("manager", "brooklyn");

    }
}
