package com.testingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium004 {

    @Test
    public void testMethod(){

        //Some EdgeOption Methods

        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized"); // To miximized the window
        edgeOptions.addArguments("--window-size=800,600");

        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://sdet.live");
        driver.manage().window().maximize();

    }
}
