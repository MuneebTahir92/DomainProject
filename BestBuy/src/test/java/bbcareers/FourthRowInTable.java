package bbcareers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CareersPage;
import start.CommonAPI;

public class FourthRowInTable extends CommonAPI {

    @Test
    public void printRow(){
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.clickOnSearchOpeningsButton();
        String rowFour = driver.findElement(By.cssSelector(".brassring tr:nth-child(5) td")).getText();
        System.out.println(rowFour);
    }
}
