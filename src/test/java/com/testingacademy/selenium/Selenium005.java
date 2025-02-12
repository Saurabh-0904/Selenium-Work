package com.testingacademy.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium005 {

    @Test
    public void testMethod(){

        //Page load Strategy

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //above, we can use
        //NONE -> It will not wait to load all elements
        //EAGER -> It also will not wait to load all elements until given condition/ expected output not found
        //NORMAL -> It will wait to load all elements

        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://sdet.live");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
