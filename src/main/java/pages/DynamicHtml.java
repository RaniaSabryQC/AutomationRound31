package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class DynamicHtml {
    Bot bot;
    String url = "https://duckduckgo.com/";
    By logoLocator = By.xpath("//div[contains(@class,'Desktop')]//img");
    By searchBoxInput = By.xpath("//input[@aria-autocomplete='both']");


    public DynamicHtml(Bot bot) {
        this.bot = bot;
    }

    public DynamicHtml navigateToDuckDuckGo() {
        bot.navigate(url);
        return this;
    }

    public String getTitleDuckDuckGo() {
        return bot.getTitle();
    }

    public boolean isLogoDisplayed() {
        return bot.isDisplayed(logoLocator);
    }


    public DynamicHtml searchText(String keys) {
        bot.sendKeys(searchBoxInput, keys);
        return this;
    }


}
