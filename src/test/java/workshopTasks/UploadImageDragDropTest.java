package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragDrop;

public class UploadImageDragDropTest extends TestCase{

    @Test
    public void uploadImageDragDrop() {
        // Task9
//        Open Google Chrome
//        Navigate to [https://jqueryui.com/resources/demos/droppable/default.html]
//        Drag [Drag me to my target] and drop it on [Drop here]
//        Assert that the text has been changed to [Dropped!]
//        Close Google Chrome

        DragDrop dragDrop= new DragDrop(bot).navigateToDragDropPage().dragAndDrop();
        Assert.assertEquals(dragDrop.getDroppedText(), "Dropped!", "Text after drag and drop is not as expected");
    }
}
