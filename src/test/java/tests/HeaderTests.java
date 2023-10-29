package tests;

import components.Header;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AnimalsPage;
import pages.EnvironmentPage;
import pages.SciencePage;
import pages.SearchPage;


public class HeaderTests extends TestBase {

    private Header header = new Header();
    private AnimalsPage animalsPage = new AnimalsPage();
    private EnvironmentPage environmentPage = new EnvironmentPage();
    private SciencePage sciencePage = new SciencePage();
    private SearchPage searchPage = new SearchPage();
    private String bannerTitleAnimalPage = "Animals";
    private String bannerTitleEnvironmentPage = "Environment";
    private String bannerTitleSciencePage = "Science";

    @Tag("header")
    @Test
    void successfulRedirectTopicAnimal(){
        header.clickOnHeaderMenu();
        header.selectAnimalsTopic();
        animalsPage.checkTitleAnimals(bannerTitleAnimalPage);
    }

    @Tag("header")
    @Test
    void successfulRedirectTopicEnvironment(){
        header.clickOnHeaderMenu();
        header.selectEnvironmentTopic();
        environmentPage.checkTitleEnvironment(bannerTitleEnvironmentPage);
    }

    @Tag("header")
    @Test
    void successfulRedirectTopicScience(){
        header.clickOnHeaderMenu();
        header.selectScienceTopic();
        sciencePage.checkTitleScience(bannerTitleSciencePage);
    }
}
