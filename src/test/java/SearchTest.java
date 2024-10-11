import PO.SearchPage;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SearchTest extends BaseTest{
    @Test
    void shouldBeVisibleResultSearch(){
        new SearchPage()
                .clickOnHistoryTab()
                .fillText("Odesa")
                .enterSearch()
                .clickUbisoftOdesa();
//        assertThat(search.getTitle())
//                .as("The result of test is appeared")
//                .isEqualTo("Ubisoft Odesa");
        SoftAssertions softly = new SoftAssertions();
//        softly.assertThat(search.getTitle())
//                .as("The result of test is appeared")
//                .isEqualTo("Ubisoft Odesa11");
        softly.assertThat(new SearchPage().getTitle())
                .as("The result of test is appeared")
                .isEqualTo("Ubisoft Odesa");
//        softly.assertThat(search.getTitle())
//                .as("The result of test is appeared")
//                .isEqualTo("Ubisoft Odesa22");
        softly.assertAll();
        }
    @Test
    void shouldBeVisibleResultSearchUbisoft(){
        new SearchPage()
            .fillText("Ubisoft")
            .enterSearch()
            .clickUbisoft()
            .clickUbisoftHistory();
        assertEquals("Історія", new SearchPage().getTitleOfUbisoftHistory());
    }
}
