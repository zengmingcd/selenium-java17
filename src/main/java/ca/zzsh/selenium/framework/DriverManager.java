package ca.zzsh.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private String url;
    private WebDriver driver;

    public DriverManager(String url){
        this.url = url;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        this.driver = new ChromeDriver(options);
        driver.manage().window().fullscreen();
        driver.get(this.url);

    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
