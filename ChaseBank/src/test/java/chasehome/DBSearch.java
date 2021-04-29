package chasehome;

import info.Reader;
import org.testng.annotations.Test;
import start.CommonAPI;

import java.util.List;

public class DBSearch extends CommonAPI {

    Reader reader = new Reader();

    @Test
    public void searchIt() throws Exception{
        List<String> list = reader.getItemListFromDB();
        for (String categories : list) {
            clickThenSearch(".header__section__item header__section--search icon-search", ".header__section--search__bar--search-input", categories);
            clearField(".header__section--search__bar--search-input");
        }
    }
}
