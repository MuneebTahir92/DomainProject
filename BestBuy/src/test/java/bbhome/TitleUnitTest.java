package bbhome;

import org.testng.Assert;
import org.testng.annotations.Test;
import start.CommonAPI;

public class TitleUnitTest extends CommonAPI {

    @Test
    public void unitTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
