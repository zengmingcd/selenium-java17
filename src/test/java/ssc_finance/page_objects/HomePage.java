package ssc_finance.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    private static final String PRE_PATH = "//*[@id=\"root\"]/div/div/div[2]";

    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    // locators for the element in the page
    private By title_in_head = By.xpath("/html/head/title");

    private By search_area_span1 = By.xpath(PRE_PATH + "/div[1]/div/p[1]/span[1]");
    private By search_area_span2 = By.xpath(PRE_PATH + "/div[1]/div/p[1]/span[2]");
    private By search_area_span3 = By.xpath(PRE_PATH + "/div[1]/div/p[2]/span");
    private By search_area_search_input = By.xpath(PRE_PATH + "/div[1]/div/div/div/input");
    private By search_area_search_btn = By.xpath(PRE_PATH + "/div[1]/div/div/button");
    private By search_area_search_btn_span = By.xpath(PRE_PATH + "/div[1]/div/div/button/span");

    public String getTitleInHead(){
        return this.driver.findElement(title_in_head).getAttribute("textContent");
    }
    public String getSearchAreaSpan1(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(search_area_span1));
        return this.driver.findElement(search_area_span1).getText();
    }
    public String getSearchAreaSpan2(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(search_area_span2));
        return this.driver.findElement(search_area_span2).getText();
    }
    public String getSearchAreaSpan3(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(search_area_span3));
        return this.driver.findElement(search_area_span3).getText();
    }
    public String getSearchInputPlaceHolderContent(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(search_area_search_input));
        return this.driver.findElement(search_area_search_input).getAttribute("placeholder");
    }
    public String getSearchBtnContent(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(search_area_search_btn));
        return this.driver.findElement(search_area_search_btn_span).getText();
    }


}
