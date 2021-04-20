package bbcareers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

public class ManagerPosition extends CommonAPI {

    @Test
    public void managerPositions(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.searchJobs("manager");
        careersPage.clickOnSearchSubmitButton();
    }
}
