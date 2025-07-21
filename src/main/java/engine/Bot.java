package engine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Bot {
    WebDriver driver;
    Wait<WebDriver> wait;

    public Bot() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        driver = new ChromeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(java.time.Duration.ofSeconds(10))
                .pollingEvery(java.time.Duration.ofMillis(500))
                .ignoring(Exception.class);
    }

    public void navigate(String url) {
        driver.navigate().to(url);
    }

    public boolean isDisplayed(By locator) {
        return wait.until(d ->
                driver.findElement(locator).isDisplayed());
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void quit() {
        driver.quit();
    }
}
