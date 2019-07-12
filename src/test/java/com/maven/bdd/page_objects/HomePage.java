package com.maven.bdd.page_objects;

import com.maven.bdd.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

 @FindBy(css="._1Rz0y")
private WebElement searchTextBox;

@FindBy(css="._1gqeQ")
private WebElement clickButton;

    public void  doSearch(String product){
        searchTextBox.sendKeys(product);
        clickButton.click();
    }
    public static String getCurrentUrl(){
        return driver.getCurrentUrl();

    }

    public String getProductHeader()    {
        return  driver.findElement(By.cssSelector(".search-title__term")).getText();

    }
}

