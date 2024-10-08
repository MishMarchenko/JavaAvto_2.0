import PO.SearchPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SearchTest extends BaseTest{


    SearchPage search = new SearchPage();

    @Test
    void shouldBeVisibleResultSearch(){
        search.clickOnHistoryTab();
        search.fillText("Odesa");
        search.enterSearch();
        search.clickUbisoftOdesa();
        assertEquals("Ubisoft Odesa", search.getTitle());
        }
    @Test
    void shouldBeVisibleResultSearchUbisoft(){
        search.fillText("Ubisoft");
        search.enterSearch();
        search.clickUbisoft();
        search.clickUbisoftHistory();
        assertEquals("Історія", search.getTitleOfUbisoftHistory());

    }
}
