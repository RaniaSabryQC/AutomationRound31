package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class DragDrop {
    Bot bot;
    String Url = "https://jqueryui.com/resources/demos/droppable/default.html";
    By draggable = By.id("draggable");
    By droppable = By.id("droppable");
    By droppedSucceed = By.xpath("//div[@id='droppable']/p");

    public DragDrop(Bot bot) {
        this.bot = bot;
    }

    public void navigateToDragDropPage() {
        bot.navigate(Url);
    }

    public void dragAndDrop() {
        bot.isDisplayed(draggable);
        bot.isDisplayed(droppable);
        bot.dragAndDrop(draggable, droppable);
    }
    public String getDroppedText() {
        return bot.getText(droppedSucceed);
    }
}
