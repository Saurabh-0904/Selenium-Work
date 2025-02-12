package com.testingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium003 {

    @Test
    public void testMethod(){
        // I want to add an Extension to the Edge Browser
        // whenever I played a YouTube video - I always get an add
        // So I wanted to add an Add blocker extension

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("/Users/saura/Downloads/Adblock.crx"));
        //The above file is first need to download, and then we need to give the path of that file
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        driver.manage().window().maximize();
    }
}
