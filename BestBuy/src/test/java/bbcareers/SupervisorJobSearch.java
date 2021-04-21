package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

public class SupervisorJobSearch extends CommonAPI {

    @Test
    public void supervisor(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnAlreadyAppliedButton();
        typeSomewhere("#initialSearchBox__00Q", "supervisor");
    }
}
