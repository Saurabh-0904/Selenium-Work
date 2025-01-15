package com.testingacademy.basicPrograms;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {

    @Test
    @Description("Verify the title of the TheTestingAcademy website")
    public void vwoLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        //driver.quit();


    }
}
