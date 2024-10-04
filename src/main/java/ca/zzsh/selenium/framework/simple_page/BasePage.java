package ca.zzsh.selenium.framework.simple_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import ca.zzsh.selenium.framework.simple_page.BaseElement.LOCATOR_TYPE;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    protected String getText(String locator_str, LOCATOR_TYPE locator_type){
        BaseElement element_obj = new BaseElement(locator_str, locator_type);
        By element = element_obj.getElement();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return this.driver.findElement(element).getText();
    }

    protected String getAttribute(String locator_str, LOCATOR_TYPE locator_type, String attribute_name, boolean enable_wait){
        BaseElement element_obj = new BaseElement(locator_str, locator_type);
        By element = element_obj.getElement();
        if (enable_wait){
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        }
        return this.driver.findElement(element).getAttribute(attribute_name);
    }

    protected void click(String locator_str, LOCATOR_TYPE locator_type){
        BaseElement element_obj = new BaseElement(locator_str, locator_type);
        By element = element_obj.getElement();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        this.driver.findElement(element).click();
    }

    protected void input(String locator_str, LOCATOR_TYPE locator_type, String value){
        BaseElement element_obj = new BaseElement(locator_str, locator_type);
        By element = element_obj.getElement();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        this.driver.findElement(element).sendKeys(value);
    }
}
