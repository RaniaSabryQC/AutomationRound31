package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class CheckBox {
    Bot bot;
    String url = "http://the-internet.herokuapp.com/checkboxes";
    By checkbox1Locator = By.xpath("//input[@type='checkbox'][1]");
    By checkbox2Locator = By.xpath("//input[@type='checkbox'][2]");

    public CheckBox(Bot bot){
        this.bot = bot;
    }
    public CheckBox navigateToCheckboxesWebSite() {
        bot.navigate(url);
        return this;
    }
    public CheckBox checkCheckbox1() {
        bot.click(checkbox1Locator);
        return this;
    }
    public boolean isCheckbox1Checked() {
       return bot.isSelected(checkbox1Locator);
    }
    public boolean isCheckbox2Checked() {
        return bot.isSelected(checkbox2Locator);
    }
}
