package bbhome;

import data.DataReader;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class SearchWithDB extends CommonAPI {

    DataReader dataReader = new DataReader();

    @Test
    public void search() throws Exception{
        List<String> list = dataReader.getItemListFromDB();
        for (String items : list) {
            typeSomewhere("#gh-search-input", items);
            clearField("#gh-search-input");
        }
    }
}

