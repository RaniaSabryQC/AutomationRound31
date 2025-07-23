package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class SearchResult {
    Bot bot;
    By firstResultLink = By.xpath("(//a[@data-testid='result-title-a'])[1]");
    By fourthResultText = By.xpath("(//a[@data-testid='result-title-a'])[3]");
    By secondResultLink = By.xpath("(//a[@data-testid='result-title-a'])[2]");
    public SearchResult(Bot bot) {
        this.bot = bot;
    }

    public String getFirstResultLink() {
        return bot.linkText(firstResultLink);
    }
    public String getFourthResultText() {
        return bot.getText(fourthResultText);
    }
    public String getSecondResultLink() {
        return bot.linkText(secondResultLink);
    }
}
