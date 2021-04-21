package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

public class FirstJobTitleInTable extends CommonAPI {

    @Test
    public void jobTitle(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnSearchOpeningsButton();
        String job = driver.findElement(By.cssSelector(".brassring tr:nth-child(3) td:nth-child(1) a")).getText();
        System.out.println(job);
    }
}
