package engine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Bot {
    WebDriver driver;
    Wait<WebDriver> wait;

    public Bot() {
        // ChromeOptions option = new ChromeOptions();
        //  option.addArguments("start-maximized");
        driver = initializeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(java.time.Duration.ofSeconds(10))
                .pollingEvery(java.time.Duration.ofMillis(500))
                .ignoring(Exception.class);
    }

    private WebDriver initializeDriver() {
        WebDriver driver;

        String driverName = System.getProperty("browser", "chrome").toLowerCase();
        switch (driverName) {
            case "safari" -> driver = new SafariDriver();
            case "firefox" -> driver = new FirefoxDriver();
            default -> driver = new ChromeDriver();
        }
        return driver;
    }

    public void navigate(String url) {
        driver.navigate().to(url);
        System.out.println("Navigating to: " + url);
    }

    public boolean isDisplayed(By locator) {
        return wait.until(d ->
                driver.findElement(locator).isDisplayed());
    }

    public void sendKeys(By locator, String keys) {
        wait.until(d -> driver.findElement(locator)).sendKeys(keys);
        System.out.println("Sending keys: " + keys + " to element: " + locator);
    }

    public void click(By locator) {
        wait.until(d -> driver.findElement(locator)).click();
        System.out.println("Clicking on element: " + locator);
    }

    public String linkText(By locator) {
        return wait.until(d -> driver.findElement(locator)).getAttribute("href");
    }

    public String getText(By locator) {
        return wait.until(d ->
                driver.findElement(locator)).getText();
    }

    public String getTitle() {
        return driver.getTitle();
    }
    public boolean isSelected(By locator) {
       return wait.until(d -> driver.findElement(locator)).isSelected();
    }

    public void quit() {
        driver.quit();
    }
}
