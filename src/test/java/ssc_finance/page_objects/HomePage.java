package ssc_finance.page_objects;

import ca.zzsh.selenium.framework.simple_page.BaseElement.LOCATOR_TYPE;
import ca.zzsh.selenium.framework.simple_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends BasePage {
    private static final String PRE_PATH = "//*[@id=\"root\"]/div/div/div[2]";

    public HomePage(WebDriver driver){
        super(driver);
    }

    // locators for the element in the page
    private String title_in_head = "/html/head/title";
    public String getTitleInHead(){
        return getAttribute(this.title_in_head, LOCATOR_TYPE.XPATH,"textContent", false);
    }

    private String search_area_span1 = PRE_PATH + "/div[1]/div/p[1]/span[1]";
    public String getSearchAreaSpan1(){
        return getText(this.search_area_span1, LOCATOR_TYPE.XPATH);
    }

    private String search_area_span2 = PRE_PATH + "/div[1]/div/p[1]/span[2]";
    public String getSearchAreaSpan2(){
        return getText(this.search_area_span2, LOCATOR_TYPE.XPATH);
    }

    private String search_area_span3 = PRE_PATH + "/div[1]/div/p[2]/span";
    public String getSearchAreaSpan3(){
        return getText(this.search_area_span3, LOCATOR_TYPE.XPATH);
    }

    private String search_area_search_input = PRE_PATH + "/div[1]/div/div/div/input";
    public String getSearchInputPlaceHolderContent(){
        return getAttribute(this.search_area_search_input, LOCATOR_TYPE.XPATH, "placeholder", true);
    }
    private String search_area_search_btn = PRE_PATH + "/div[1]/div/div/button";

    private String search_area_search_btn_span = PRE_PATH + "/div[1]/div/div/button/span";
    public String getSearchBtnContent(){
        return getText(this.search_area_search_btn_span, LOCATOR_TYPE.XPATH);
    }

}
