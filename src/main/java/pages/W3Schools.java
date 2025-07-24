package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class W3Schools {
    Bot bot;
    String Url = "https://www.w3schools.com/html/html_tables.asp";
    By companyNameLocator = By.xpath("//table[@id='customers']//td[contains(text(),'Ernst Handel')]/following-sibling::td[2]");

    public W3Schools(Bot bot) {
        this.bot= bot;
    }

    public void navigateToW3Schools() {
        bot.navigate(Url);
    }
    public String getCountryNameForCompany() {
        return bot.getText(companyNameLocator);
    }
}
