package bbhome;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import start.CommonAPI;

public class Search extends CommonAPI {

    @Test
    public void search(){
        typeSomewhere("#gh-search-input", "surface laptop");
    }
}
