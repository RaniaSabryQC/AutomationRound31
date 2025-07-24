package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.W3Schools;

public class Task7Test extends TestCase{

    @Test
    public void checkCountryNameOfCompany(){
        //Task7
//        Open Google Chrome
//        Navigate to [https://www.w3schools.com/html/html_tables.asp]
//        Assert that the Country for the Company [Ernst Handel] is [Austria]
//        Close Google Chrome

        W3Schools w3SchoolsPage = new W3Schools(bot);
        w3SchoolsPage.navigateToW3Schools();
        Assert.assertEquals(w3SchoolsPage.getCountryNameForCompany(), "Austria", "Country name for Ernst Handel should be Austria");
    }
}
