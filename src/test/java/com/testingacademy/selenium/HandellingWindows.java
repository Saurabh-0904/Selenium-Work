package com.testingacademy.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class HandellingWindows {

    ChromeDriver driver;
    @Test
    public void test1() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        String s = driver.getWindowHandle();
        //System.out.println(s);
        driver.switchTo().window(s);
        String title = driver.getTitle();
        System.out.println(title);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des = new File("D:\\test1.png");
        FileHandler.copy(src,des);

        driver.quit();





    }
}
