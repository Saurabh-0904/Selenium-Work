package com.testingacademy.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium006 {

    @Test
    public void testMethod() throws MalformedURLException, InterruptedException {

        //Navigate commands

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://bing.com");
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.navigate().to("https://google.com");
        //Thread.sleep(3000);
        driver.navigate().to(new URL("https://app.vwo.com"));
        //Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
