package com.testingacademy.xPathPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class P002 {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("saurabh.bhalerao0904@gmail.com");
        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("abcd@1234");
        driver.findElement(By.className("form-control")).sendKeys("PF Technologies");
        driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number'][1]")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[contains(@value,'Submit')]")).click();
        driver.findElement(By.id("inp_val")).sendKeys("NoOne");
        /*WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'First Enter name')]"));
        System.out.println(ele.isEnabled());
        Assert.assertTrue(ele.isEnabled());//It will fail coz that element is disabled*/

        WebElement dropDown1 = driver.findElement(By.id("cars"));

        Select select = new Select(dropDown1);
        select.selectByVisibleText("Audi");

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File des = new File("D:\\Practice\\Screenshots\\HomePage.png");

        try {
            FileHandler.copy(src,des);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Thread.sleep(3000);

        driver.quit();
        
    }



}
