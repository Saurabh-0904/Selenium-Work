package com.testingacademy.xPathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class P003 {

    //TODO - Yet Incomplete

    //Flipkart->Electronics->Powerbanks->List all the powerbanks

    ChromeDriver driver;
    @BeforeMethod
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testPowerbanks() throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        WebElement electronics = driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics).perform();
        //List<WebElement> allPowerbanks = driver.findElements(By.xpath("//div[@class='_16rZTH']/object/a"));
        WebElement powerbank = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
        actions.moveToElement(powerbank).perform();

        WebElement powerbankClick = driver.findElement(By.xpath(""));

        Thread.sleep(5000);



    }
}
