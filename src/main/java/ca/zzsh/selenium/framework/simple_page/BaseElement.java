package ca.zzsh.selenium.framework.simple_page;

import org.openqa.selenium.By;

public class BaseElement {
    public enum LOCATOR_TYPE {
        ID, XPATH, CLASS_NAME, CSS_SELECTOR, LINK_TEXT, NAME, TAG_NAME
    }

    private String locator_str;
    private LOCATOR_TYPE locator_type;

    public BaseElement(String locator_str, LOCATOR_TYPE locator_type){
        this.locator_str = locator_str;
        this.locator_type = locator_type;
    }

    public By getElement(){
        switch (this.locator_type){
            case ID -> {
                return By.id(locator_str);
            }
            case NAME -> {
                return By.name(locator_str);
            }
            case XPATH -> {
                return By.xpath(locator_str);
            }
            case TAG_NAME -> {
                return By.tagName(locator_str);
            }
            case LINK_TEXT -> {
                return By.linkText(locator_str);
            }
            case CLASS_NAME -> {
                return By.className(locator_str);
            }
            case CSS_SELECTOR -> {
                return By.cssSelector(locator_str);
            }
            default -> {
                return null;
            }
        }
    }

}
