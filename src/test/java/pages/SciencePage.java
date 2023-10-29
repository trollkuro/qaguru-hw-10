package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SciencePage {

    private SelenideElement pageTitle = $(".BannerHeading__Title h1");

    public SciencePage checkTitleScience(String title){
        pageTitle.shouldHave(text(title));
        return this;
    }
}
