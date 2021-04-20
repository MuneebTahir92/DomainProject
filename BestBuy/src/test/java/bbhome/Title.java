package bbhome;

import org.testng.annotations.Test;
import start.CommonAPI;

public class Title extends CommonAPI {

    @Test
    public void title(){
        System.out.println(driver.getTitle());
    }
}
