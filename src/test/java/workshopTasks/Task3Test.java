package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicHtml;
import pages.SearchResult;

public class Task3Test extends TestCase{

    @Test
    public void searchForSeleniumWebDrive() {
        // Task 3:
//        Open Google Chrome
//        Navigate to [https://duckduckgo.com/]
//        Search for [Selenium WebDriver]
//        Assert that the link of the first result is [https://www.selenium.dev/documentation/webdriver/]
//        Close Google Chrome

        DynamicHtml dynamicHtml=new DynamicHtml(bot);
        SearchResult searchResult = new SearchResult(bot);
        dynamicHtml.navigateToDuckDuckGo();
        dynamicHtml.sendKeysToSearchBox("Selenium WebDriver");
        dynamicHtml.clickSearchButton();
        Assert.assertEquals(searchResult.getFirstResultLink(),"https://www.selenium.dev/documentation/webdriver/");
   }

}
