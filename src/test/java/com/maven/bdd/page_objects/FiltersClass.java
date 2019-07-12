package com.maven.bdd.page_objects;

import com.maven.bdd.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FiltersClass extends Hooks {
    WebDriver driver;

    public void getallcategoryfilters(String selectedcategory) {
        List<WebElement> category = driver.findElements(By.cssSelector(".ac-facet__filters--category .ac-facet__label--category "));
        for (WebElement categorys : category) {
            if (categorys.getText().equalsIgnoreCase(selectedcategory)) {
                categorys.click();
                break;
            }


        }
    }
}