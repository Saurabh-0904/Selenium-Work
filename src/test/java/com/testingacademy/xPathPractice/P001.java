package com.testingacademy.xPathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P001 {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(@class,'_1TOQfO')]"));
        loginButton.click();
        Thread.sleep(5000);

    }



}
