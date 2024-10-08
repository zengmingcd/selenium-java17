package ssc_finance.test_cases;

import ca.zzsh.selenium.framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import ssc_finance.page_objects.HomePage;

import static java.lang.Thread.sleep;

public class HomePageTest {
    @Test (description = "Test Home Page",
            enabled = true,
            groups = {"P0"})
    public void testHomePage() {
        DriverManager myDM = new DriverManager("https://ssc.finance/");
        WebDriver driver = myDM.getDriver();
//        driver.manage().window().fullscreen();

        HomePage home_page = new HomePage(driver);
        Assert.assertEquals(home_page.getTitleInHead(), "Smart Solutions Capital", "Title incorrect");

        Assert.assertEquals(home_page.getSearchAreaSpan1(), "SMART SOLUTION CAPITAL", "Content incorrect in Search Area Span1");
        Assert.assertEquals(home_page.getSearchAreaSpan2(), "has a mortgage just for you", "Content incorrect in Search Area Span2");
        Assert.assertEquals(home_page.getSearchAreaSpan3(), "Check your application status", "Content incorrect in Search Area Span3");
        Assert.assertEquals(home_page.getSearchInputPlaceHolderContent(), "Enter Application Number Or User Email", "Content incorrect in Search Input Placeholder");
        Assert.assertEquals(home_page.getSearchBtnContent(), "Search", "Content incorrect in Search Button");

        driver.quit();

    }

}
