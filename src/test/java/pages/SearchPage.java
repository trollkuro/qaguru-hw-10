package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    private SelenideElement searchInput = $("[type=search]"),
                            searchResultContent = $(".ResultsContent");
    private ElementsCollection popularSearches = $$(".TermList__List a");


    public void setSearchQuery(String query){
        searchInput.setValue(query).pressEnter();
    }

    public SearchPage checkSearchResult(String result){
       searchResultContent.shouldHave(text(result));
       return this;
    }

    public SearchPage checkPopularSerches(List<String> Searches){
        popularSearches.filter(visible).shouldHave(CollectionCondition.texts(Searches));
        return this;
    }
}
