package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class UploadFile {
    Bot bot;
    String Url = "https://the-internet.herokuapp.com/upload";
    By fileInput = By.id("file-upload");
    By uploadButton = By.id("file-submit");
    By fileUploaded = By.xpath("//div[@class='example']/h3");

    public UploadFile(Bot bot) {
        this.bot = bot;
    }

    public UploadFile navigateToUploadPage() {
        bot.navigate(Url);
        return this;
    }

    public UploadFile uploadFileFromPC(String filePath) {
        bot.uploadFileBySendKey(fileInput, filePath);
        bot.click(uploadButton);
        return this;
    }

    public boolean isFileUploaded() {
        return bot.isDisplayed(fileUploaded) && bot.getText(fileUploaded).contains("File Uploaded!");
    }
}
