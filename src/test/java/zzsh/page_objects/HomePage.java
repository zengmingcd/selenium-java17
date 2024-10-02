package zzsh.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private static final String PRE_PATH = "/html/body/main/div/div[1]";

    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    private By title_in_head = By.xpath("/html/head/title");
    public String getTitleInHead(){
        return this.driver.findElement(title_in_head).getAttribute("textContent");
    }

    private By share_exp_btn = By.xpath(PRE_PATH + "/div[1]/a");
    public String getShareExpBtnText(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.share_exp_btn));
        return this.driver.findElement(this.share_exp_btn).getText();
    }

    public void clickShareExpBtn(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.share_exp_btn));
        this.driver.findElement(this.share_exp_btn).click();
    }

    private By search_area_title = By.xpath(PRE_PATH + "/h2");
    public String getSearchAreaTitle(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.search_area_title));
        return this.driver.findElement(this.search_area_title).getText();
    }



}
