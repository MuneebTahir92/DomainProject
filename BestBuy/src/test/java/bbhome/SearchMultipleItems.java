package bbhome;

import items.MultipleItems;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class SearchMultipleItems extends CommonAPI {

    @Test
    public void multipleItems() throws InterruptedException {
        List<String> search = MultipleItems.multipleItems();
        for(String name:search){
            typeSomewhere("#gh-search-input", name);
            Thread.sleep(1000);
            clearField("#gh-search-input");

        }


    }
}
