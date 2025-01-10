package com.testingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium003 {

    @Test
    public void testMethod(){
        // I want to add Extension to the Edge Browser
        // whenever I played a youtube video - I always get a add
        // So i wanted to add a Add blocker extension

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("/Users/saura/Downloads/Adblock.crx"));
        //Above file is first need to download then we need to give the path of that file
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        driver.manage().window().maximize();
    }
}
