package com.testingacademy.handlingDropdownSelectClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium017 {

    // To handle 'DropDowns' we have a 'Select' Class
    // for this we have 3 methods
    // selectByIndex(1); // here 1 is a index value
    // selectByVisibleText("Option 1"); here option 1 is a value or text
    // selectByValue("2"); here 2 is a value

    EdgeDriver driver; //Class variable declared
    
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }


    @Test (groups = "QA")
    @Description("Test case #1")
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdownList1 = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownList1);

        //select.selectByIndex(0); // Disabled in DOM
        //select.selectByIndex(1);  // Method 1
        //select.selectByVisibleText("Option 1"); // Method 2
        select.selectByValue("2"); // Method 3


        Thread.sleep(3000);
    }


        @AfterTest
        public void closeBrowser(){
            driver.quit();
        }
}
