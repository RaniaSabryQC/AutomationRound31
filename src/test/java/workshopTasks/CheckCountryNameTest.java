package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.W3Schools;


public class CheckCountryNameTest extends TestCase{

    @Test
    public void checkCountryNameOfCompany(){
        //Task7
//        Open Google Chrome
//        Navigate to [https://www.w3schools.com/html/html_tables.asp]
//        Assert that the Country for the Company [Ernst Handel] is [Austria]
//        Close Google Chrome

        String ActualResult = new W3Schools(bot).navigateToW3Schools().getCountryNameForCompany();
        Assert.assertEquals(ActualResult, "Austria", "Country name for Ernst Handel should be Austria");
    }
}
