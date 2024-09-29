package ssc_finance.test_cases;

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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().fullscreen();
        driver.get("https://ssc.finance/");

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
