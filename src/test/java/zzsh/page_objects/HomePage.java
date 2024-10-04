package zzsh.page_objects;

import ca.zzsh.selenium.framework.simple_page.BasePage;
import org.openqa.selenium.WebDriver;

import ca.zzsh.selenium.framework.simple_page.BaseElement.LOCATOR_TYPE;

public class HomePage extends BasePage {
    private static final String PRE_PATH = "/html/body/main/div/div[1]";

    public HomePage(WebDriver driver){
        super(driver);
    }

    private String title_in_head = "/html/head/title";
    public String getTitleInHead(){
        return getAttribute(this.title_in_head, LOCATOR_TYPE.XPATH, "textContent", false);
    }

    private String share_exp_btn = PRE_PATH + "/div[1]/a";
    public String getShareExpBtnText(){
        return getText(this.share_exp_btn, LOCATOR_TYPE.XPATH);
    }
    public void clickShareExpBtn(){
        click(this.share_exp_btn, LOCATOR_TYPE.XPATH);
    }

    private String search_area_title = PRE_PATH + "/h2";
    public String getSearchAreaTitle(){
        return getText(this.search_area_title, LOCATOR_TYPE.XPATH);
    }
}
