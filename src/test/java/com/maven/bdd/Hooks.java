package com.maven.bdd;

import com.maven.bdd.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
     DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setup(){
        driverFactory.openBrowser();
        driverFactory.maxiBrowser();
        driverFactory.applyImplycitwait();

    }
    @After
     public void tearDown(){
        driverFactory.closeBrowser();
     }
}
