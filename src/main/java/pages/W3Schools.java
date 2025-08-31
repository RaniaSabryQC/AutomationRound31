package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class W3Schools {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(W3Schools.class);
    Bot bot;
    String Url = "https://www.w3schools.com/html/html_tables.asp";
    By companyNameLocator = By.xpath("//table[@id='customers']//td[contains(text(),'Ernst Handel')]/following-sibling::td[2]");

    public W3Schools(Bot bot) {
        this.bot= bot;
    }

    public W3Schools navigateToW3Schools() {
        bot.navigate(Url);
        return this;
    }
    public String getCountryNameForCompany() {
        String companyName = bot.getText(companyNameLocator);
        log.info("Country name for Ernst Handel: {}", companyName);
        return companyName;

    }
}
