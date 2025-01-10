package com.testingacademy.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium002 {

    @Test
    public void testMethod(){
        //Important Concept of OOPs

        //WebDriver driver = new EdgeDriver();

        // Interface interfacereference = new Class();
        //1. Inheritance
        //2. Upcasting -> Dynamic Dispatch





/*      WebDriver driver = new EdgeDriver();
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new InternetExplorerDriver();
        WebDriver driver4 = new SafariDriver();*/

        //Opera browser is removed from Selenium 4!

        //WE can also write like :-

        SearchContext driver = new ChromeDriver(); // This concept called Dynamic Dispatch
        //Grandfather, Father, can ref to child objects - OOPs
        //But SearchContext have 2 functions only findElements and findElement so we can use this






    }
}
