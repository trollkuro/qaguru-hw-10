package components;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Footer {
    private SelenideElement legalColumn = $("[aria-label=Legal]"),
                            ourSitesColumn = $("[aria-label='Our Sites']"),
                            joinUsColumn = $("[aria-label='Join Us']"),
                            followUsColumn = $("[aria-label='Follow us']");

    public Footer checkLegalColumn(){
        legalColumn.shouldBe(visible);
        return this;
    }

    public Footer checkOurSitesColumn(){
        ourSitesColumn.shouldBe(visible);
        return this;
    }

    public Footer checkJoinUsColumn(){
        joinUsColumn.shouldBe(visible);
        return this;
    }

    public Footer checkFollowUsColumn(){
        followUsColumn.shouldBe(visible);
        return this;
    }
}
