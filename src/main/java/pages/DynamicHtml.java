package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class DynamicHtml {
    Bot bot;
    String url = "https://duckduckgo.com/";
    By logoLocator = By.xpath("//div[contains(@class,'Desktop')]//img");
    By searchBoxInput = By.xpath("//input[@aria-autocomplete='both']");
    By searchButton = By.xpath("//button[@type='submit' and @aria-label='Search']");


    public DynamicHtml(Bot bot) {
        this.bot = bot;
    }

    public void navigateToDuckDuckGo() {
        bot.navigate(url);
    }
    public String getTitleDuckDuckGo() {
      return   bot.getTitle();
    }
    public boolean isLogoDisplayed() {
        return bot.isDisplayed(logoLocator);
    }
    public void sendKeysToSearchBox(String keys) {
        bot.sendKeys(searchBoxInput, keys);
    }
    public void clickSearchButton() {
        bot.click(searchButton);
    }
}
