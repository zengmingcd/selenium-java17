package zzsh.test_cases;

import ca.zzsh.selenium.framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import zzsh.page_objects.HomePage;

public class HomePageTest {
    @Test(description = "Test Home Page",
            enabled = true,
            groups = {"P0"}
    )
    public void testHomePage(){
        DriverManager myDM = new DriverManager("https://zzsuitablehome.ca/");
        WebDriver driver = myDM.getDriver();

        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getTitleInHead(), "Homepage", "Content incorrect in Title in Head.");
        Assert.assertEquals(homePage.getShareExpBtnText(), "Share My Experiences!", "Content incorrect in Share Exp Button.");
        Assert.assertEquals(homePage.getSearchAreaTitle(), "Get To Know Your Home", "Content incorrect in Search Area Title.");

    }
}
