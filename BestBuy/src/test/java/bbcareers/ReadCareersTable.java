package bbcareers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;
import table.TableData;

public class ReadCareersTable extends TableData {

    @Test
    public void readTable(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnSearchOpeningsButton();
        dataInTable();

    }
}
