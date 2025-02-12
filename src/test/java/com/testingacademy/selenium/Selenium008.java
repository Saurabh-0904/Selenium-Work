package com.testingacademy.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium008 {

    /*
     * Project #1 TC-(Negative) - Invalid username, Password - Error message
     * 1. Open the URL app.vwo.com/#/login
     * 2. Find the email id input box and enter the email as admin@admin.com
     * id, className, name, CSS Selector, Xpath,
     * LinkText and Partial LinkText which are only for <a> (anchor tag)
     * 3. Find the password input box and enter the password as admin
     * 4. Find and click the Submit button
     * 5. Verify that the error message is shown "Your email, Password, IP address or location did not match"
     *
     */

    @Test (groups = "QA")
    @Description("Verify the current URL, title of VWO app")
    public void testVWOLogin(){
        WebDriver driver = new EdgeDriver();

        //1. Open the URL app.vwo.com/#/login
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        //2. Find the email id input box and enter the email as admin@admin.com
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        //3. Find the password input box and enter the password as admin
        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("admin");

        //4. Find and click the Submit button
        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //5. Verify that the error message is shown "Your email, Password, IP address or location did not match"
        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        String error_msgText = errorMessage.getText();
        String error_msgAttribute = errorMessage.getAttribute("data-Selenium_IMP_details");
        System.out.println(error_msgAttribute);

        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");
        driver.quit();

    }

}
