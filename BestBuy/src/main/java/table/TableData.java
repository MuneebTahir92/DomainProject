package table;

import org.openqa.selenium.By;
import start.CommonAPI;

public class TableData extends CommonAPI {

    public void dataInTable(){
        String data = driver.findElement(By.cssSelector(".brassring")).getText();
        System.out.println(data);
    }
}
