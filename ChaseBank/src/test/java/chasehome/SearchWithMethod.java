package chasehome;

import org.testng.annotations.Test;
import start.CommonAPI;

public class SearchWithMethod extends CommonAPI {

    @Test
    public void searching(){
        clickThenSearch(".header__section__item header__section--search icon-search", ".header__section--search__bar--search-input", "savings");
    }
}
