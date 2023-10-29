package components;

import com.codeborne.selenide.SelenideElement;
import pages.AnimalsPage;
import pages.EnvironmentPage;
import pages.SciencePage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class Header {
    private SelenideElement menu = $("[aria-label=Menu]"),
                            searchIcon = $("[data-track-nav_item=search]"),
                            animalsTopic = $("a[href='/animals']"),
                            environmentTopic = $("a[href='/environment']"),
                            scienceTopic = $("a[href='/science']");



    public void clickOnHeaderMenu(){
        menu.click();
    }

    public SearchPage clickOnSearchIcon(){
        searchIcon.click();
        return page(SearchPage.class);
    }

    public AnimalsPage selectAnimalsTopic(){
        animalsTopic.click();
        return page(AnimalsPage.class);
    }

    public EnvironmentPage selectEnvironmentTopic(){
        environmentTopic.click();
        return page(EnvironmentPage.class);
    }

    public SciencePage selectScienceTopic(){
        scienceTopic.click();
        return page(SciencePage.class);
    }
}
