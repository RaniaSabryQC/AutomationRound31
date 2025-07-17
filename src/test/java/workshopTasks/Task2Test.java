package workshopTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Task2Test {

    @Test
    public void testTask2() {
//        Task 2:
//       - Open Google Chrome
//       - Navigate to [https://duckduckgo.com/]
//       - Assert that the DuckDuckGo logo is displayed
//       - Close Google Chrome

        ChromeOptions option = new ChromeOptions();
//      Map<String, String> mobileEmulation = new HashMap<>();
//      mobileEmulation.put("deviceName", "Pixel 5");
        option.addArguments("start-maximized");
 //       option.addArguments("incognito");
//      option.addArguments("use-mobile-user-agent");
//      option.addArguments("window-size=412,915");
//      option.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://duckduckgo.com/");
//        boolean isLogoDisplayed = driver.findElement(By.cssSelector("img[src*='logo']")).isDisplayed();
//        Assert.assertTrue(isLogoDisplayed, "DuckDuckGo logo is not displayed");
        driver.quit();
    }
}
