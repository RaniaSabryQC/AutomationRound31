package workshopTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test {
    @Test
    public void navigateToDuckduckgoAndCheckPageTitle() {
//        Task 1: Open Google Chrome, navigate to [https://duckduckgo.com/], assert that the page title is [Google], and close Google Chrome.
//        Steps:
//       - Open Google Chrome
//       - Navigate to [https://duckduckgo.com/]
//        -Assert that the page title is [Google]
//        -Close Google Chrome

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(),"DuckDuckGo - Protection. Privacy. Peace of mind.");
        driver.quit();


    }

}
