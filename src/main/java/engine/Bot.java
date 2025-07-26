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
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Bot.class);

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
        log.info("Navigating to: {}", url);
        driver.navigate().to(url);
    }

    public boolean isDisplayed(By locator) {
        return wait.until(d ->
                driver.findElement(locator).isDisplayed());
    }

    public void sendKeys(By locator, String keys) {
        log.info("Sending keys '{}' to element: {}", keys, locator);
        wait.until(d ->
                driver.findElement(locator)).sendKeys(keys);

    }

    public void click(By locator) {
        log.info("Clicking on element: {}", locator);
        wait.until(d -> driver.findElement(locator)).click();
    }

    public String linkText(By locator) {
        log.info("Getting link text from element: {}", locator);
        return wait.until(d -> driver.findElement(locator)).getAttribute("href");
    }

    public String getText(By locator) {
        log.info("Getting text from element: {}", locator);
        return wait.until(d ->
                driver.findElement(locator)).getText();
    }

    public String getTitle() {
        log.info("Getting page title");
        return driver.getTitle();
    }

    public boolean isSelected(By locator) {
        log.info("Checking if element is selected: {}", locator);
        return wait.until(d -> driver.findElement(locator)).isSelected();
    }
    public void dragAndDrop(By source, By target) {
        log.info("Dragging element '{}' and dropping it on '{}'", source, target);
        var sourceElement = wait.until(d -> driver.findElement(source));
        var targetElement = wait.until(d -> driver.findElement(target));
        var actions = new org.openqa.selenium.interactions.Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).perform();
    }

    public void quit() {
        log.info("Closing the browser");
        driver.quit();
    }
}
