package tests;

import components.Footer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FooterTests extends TestBase {
    private Footer footer = new Footer();

    @Tag("footer")
    @Test
    void checkFooterInfoVisibility(){
          footer.checkLegalColumn()
                .checkOurSitesColumn()
                .checkJoinUsColumn()
                .checkFollowUsColumn();
    }

}
