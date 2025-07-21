package workshopTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
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
       option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.navigate().to("https://duckduckgo.com/");
        By logoLocator = By.xpath("//div[contains(@class,'Desktop')]//img");
        Assert.assertTrue(driver.findElement(logoLocator).isDisplayed(), "DuckDuckGo logo is not displayed");
        driver.quit();
    }
}
