package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadFile;

public class Task8Test extends TestCase {

    String filePath = System.getProperty("user.dir") + "/src/test/resources/images/smallImage.jpg"; // Example file path

    @Test
    public void uploadSmallImage() {
        // Task8
//        Open Google Chrome
//        Navigate to [http://the-internet.herokuapp.com/upload]
//        Upload a small image file
//        Assert that the file was uploaded successfully
//        Close Google Chrome

        UploadFile uploadFile = new UploadFile(bot);
        uploadFile.navigateToUploadPage();
        uploadFile.uploadFileFromPC(filePath);
        Assert.assertTrue(uploadFile.isFileUploaded());
    }
}