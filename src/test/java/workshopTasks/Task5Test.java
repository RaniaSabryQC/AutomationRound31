package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicHtml;
import pages.SearchResult;

public class Task5Test extends TestCase{

    @Test
    public void searchForCucumberIO(){
//        Open Google Chrome
//        Navigate to [https://duckduckgo.com/]
//        Search for [Cucumber IO]
//        Assert that the link of the second result contains [https://www.linkedin.com]
//        Close Google Chrome
        DynamicHtml dynamicHtml=new DynamicHtml(bot);
        dynamicHtml.navigateToDuckDuckGo();
        dynamicHtml.sendKeysToSearchBox("Cucumber IO");
        dynamicHtml.clickSearchButton();
        SearchResult searchResult=new SearchResult(bot);
        Assert.assertTrue(searchResult.getSecondResultLink().contains("https://mvnrepository.com/artifact/io.cucumber"));
    }
}
