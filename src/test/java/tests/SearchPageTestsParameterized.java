package tests;

import components.Header;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import pages.SearchPage;

import java.util.List;
import java.util.stream.Stream;


public class SearchPageTestsParameterized extends TestBase {

    private Header header = new Header();
    private SearchPage searchPage = new SearchPage();


    @Tag("search")
    @CsvFileSource(resources = "/successfulSearch.csv")
    @ParameterizedTest
    void searchArticlesTestWithFileSource(String searchQuery, String expectedArticle){
        header.clickOnSearchIcon();
        searchPage.setSearchQuery(searchQuery);
        searchPage.checkSearchResult(expectedArticle);
    }

    @Tag("search")
    @CsvSource(value = {
            "bird,  Birds of Paradise",
            "whale, Whale Shark"})
    @ParameterizedTest
    void searchArticlesTestWithSource(String searchQuery, String expectedArticle){
        header.clickOnSearchIcon();
        searchPage.setSearchQuery(searchQuery);
        searchPage.checkSearchResult(expectedArticle);
    }

    static Stream<Arguments> popularSearchTestWithMethod(){
        return Stream.of(
                Arguments.of(List.of("animals", "climate change", "space", "coronavirus", "oceans", "sharks",
                        "vikings", "dinosaurs", "birds", "history", "volcano", "panda", "earthquakes", "science",
                        "lions", "yellowstone", "deforestation"))
        );
    }

    @Tag("search")
    @MethodSource("popularSearchTestWithMethod")
    @ParameterizedTest
    void popularSearchTestWithMethod(List<String> expectedPopularSearches){
        header.clickOnSearchIcon();
        searchPage.checkPopularSerches(expectedPopularSearches);
    }
}
