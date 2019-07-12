package com.maven.bdd.page_objects;


import com.maven.bdd.Hooks;
import com.maven.bdd.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends Hooks {
   // WebDriver driver;//check with peers???

    public void selectARating(String selected) {

        List<WebElement> ratingWebelemennts = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__label--rating"));
        for (WebElement ratinngWebElemnet : ratingWebelemennts) {
            if (ratinngWebElemnet.getText().equalsIgnoreCase(selected))
                ratinngWebElemnet.click();
            break;
        }
    }


    public List<Double> getCustomerRatingOnAllProducts() {
        List<Double> collectedRatings=new ArrayList<Double>();
        List<WebElement> ratingWebelements = driver.findElements(By.cssSelector(".ac-star-rating"));
        for (WebElement ratingWebElement : ratingWebelements) {
            String stringValue = ratingWebElement.getAttribute("data-star-rating");
            double valueInDouble = Double.parseDouble(stringValue);
            collectedRatings.add(valueInDouble);
        }

        return collectedRatings;

    }
}