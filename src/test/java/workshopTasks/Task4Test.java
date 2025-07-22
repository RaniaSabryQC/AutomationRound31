package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicHtml;
import pages.SearchResult;

public class Task4Test extends TestCase{

    @Test
    public void searchForTestng(){
//        Task4
//        Open Mozilla Firefox
//        Navigate to [https://duckduckgo.com/]
//        Search for [TestNG]
//        Assert that the text of the fourth result is [TestNG Tutorial]
//        Close Mozilla Firefox

        DynamicHtml dynamicHtml=new DynamicHtml(bot);
        SearchResult searchResult = new SearchResult(bot);
        dynamicHtml.navigateToDuckDuckGo();
        dynamicHtml.sendKeysToSearchBox("TestNg");
        dynamicHtml.clickSearchButton();
        Assert.assertEquals(searchResult.getFourthResultText(), "TestNG Tutorial");
    }

}
