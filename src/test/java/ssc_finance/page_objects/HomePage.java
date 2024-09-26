package ssc_finance.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final String PRE_PATH = "//*[@id=\"root\"]/div/div/div[2]";

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // locators for the element in the page
    By title_in_head = By.xpath("/html/head/title");

    By search_area_span1 = By.xpath(PRE_PATH + "/div[1]/div/p[1]/span[1]");
    By search_area_span2 = By.xpath(PRE_PATH + "/div[1]/div/p[1]/span[2]");
    By search_area_span3 = By.xpath(PRE_PATH + "/div[1]/div/p[2]/span");
    By search_area_search_input = By.xpath(PRE_PATH + "/div[1]/div/div/div/input");
    By search_area_search_btn = By.xpath(PRE_PATH + "/div[1]/div/div/button");
    By search_area_search_btn_span = By.xpath(PRE_PATH + "/div[1]/div/div/button/span");

    public String getTitleInHead(){
        return this.driver.findElement(title_in_head).getAttribute("textContent");
    }
    public String getSearchAreaSpan1(){
        return this.driver.findElement(search_area_span1).getText();
    }
    public String getSearchAreaSpan2(){
        return this.driver.findElement(search_area_span2).getText();
    }
    public String getSearchAreaSpan3(){
        return this.driver.findElement(search_area_span3).getText();
    }
    public String getSearchInputPlaceHolderContent(){
        return this.driver.findElement(search_area_search_input).getAttribute("placeholder");
    }
    public String getSearchBtnContent(){
        return this.driver.findElement(search_area_search_btn_span).getText();
    }


}
