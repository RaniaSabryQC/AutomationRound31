package workshopTasks;

import Utils.JsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicHtml;
import pages.SearchResult;
public class SearchResultTest extends TestCase {

    @Test
    public void searchForSeleniumWebDrive() {
        // Task 3:
//        Open Google Chrome
//        Navigate to [https://duckduckgo.com/]
//        Search for [Selenium WebDriver]
//        Assert that the link of the first result is [https://www.selenium.dev/documentation/webdriver/]
//        Close Google Chrome

        String searchTerm = JsonReader.getSearchTerm();
        DynamicHtml dynamicHtml = new DynamicHtml(bot).navigateToDuckDuckGo().searchText(searchTerm);
        Assert.assertEquals(new SearchResult(bot).getFirstResultLink(), "https://www.selenium.dev/documentation/webdriver/");
    }

    @Test
    public void searchForTestng(){
//        Task4
//        Navigate to [https://duckduckgo.com/]
//        Search for [TestNG]
//        Assert that the text of the fourth result is [TestNG Tutorial]

        DynamicHtml dynamicHtml=new DynamicHtml(bot).navigateToDuckDuckGo().searchText("TestNG");
        Assert.assertEquals(new SearchResult(bot).getFourthResultText(), "TestNG Tutorial");
    }

    @Test(expectedExceptions = AssertionError.class)
    public void searchForCucumberIO(){
//        Open Google Chrome
//        Navigate to [https://duckduckgo.com/]
//        Search for [Cucumber IO]
//        Assert that the link of the second result contains [https://www.linkedin.com]
//        Close Google Chrome
        DynamicHtml dynamicHtml=new DynamicHtml(bot).navigateToDuckDuckGo().searchText("Cucumber IO");
        Assert.assertTrue(new SearchResult(bot).getSecondResultLink().contains("Cucumber"));
    }

}
