package start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void startUp(String url){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close(){
        driver.close();
    }

    public void typeSomewhere(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void clearField(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public List<String> dropDownList(String locator){
        List<WebElement> elements = driver.findElements(By.cssSelector(locator));
        List<String> values = new ArrayList<String>();
        for(WebElement element:elements){
            values.add(element.getText());
        }
        return values;
    }
}
