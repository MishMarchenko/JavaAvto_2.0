package PO;

import Base.BaseMethod;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethod {
    private final By history = By.xpath("//h3[@id='p-views-label']/following-sibling::div//li[3]");
    private final By search = By.xpath("//input[@name='search']");
    private final By result = By.xpath("//h1[@id='firstHeading']");
    private final By ubisoftOdesa = By.xpath("//div[@class='mw-search-result-heading']/a");
    private final By resultUbisoft = By.xpath("//span[@class='mw-page-title-main']");
    private final By ubisoft = By.xpath("//span[@class='searchmatch']");
    private final By ubisoftHistory = By.xpath("//span[@class='toctext']");
    private final By ubisoftHistoryTitle = By.xpath("//h2[@id='Історія']");

    public void clickOnHistoryTab(){
        click(history);
    }
    public void fillText(String text){
        send(search, text);
    }
    public void enterSearch(){
        clickEnter(search);
    }
    public void clickUbisoftOdesa(){
        click(ubisoftOdesa);
    }
    public String getTitle(){
        return getTextFromElement(resultUbisoft);
    }
    public void clickUbisoft(){
        click(ubisoft);
    }
    public void clickUbisoftHistory(){
        click(ubisoftHistory);
    }
    public String getTitleOfUbisoftHistory(){
        return getTextFromElement(ubisoftHistoryTitle);
    }
}
