package com.maven.bdd.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static  WebDriver driver; //invoke the webdriver and make it accessible

    public DriverFactory(){//  creating constructor class to implement pageFactory
        PageFactory.initElements(driver,this);
    }

   public void openBrowser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.argos.co.uk/");
}
public void  maxiBrowser(){
       driver.manage().window().maximize();
}

public void applyImplycitwait(){
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
 public void closeBrowser(){
       driver.quit();
 }
}
