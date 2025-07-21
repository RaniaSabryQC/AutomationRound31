package workshopTasks;

import engine.Bot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestCase {
    Bot bot;

    @BeforeMethod
    public void setUp() {
        bot = new Bot();
    }

    @AfterMethod
    public void tearDown() {
        bot.quit();
    }
}
