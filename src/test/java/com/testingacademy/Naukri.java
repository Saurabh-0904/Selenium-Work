package com.testingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;

public class Naukri {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.naukri.com/");

        WebElement login = driver.findElement(By.id("login_Layer"));
        login.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")));
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
                .sendKeys("Saurabh.bhalerao0904@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']"))
                .sendKeys("Saurankita@2715");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/mnjuser/profile'][1]")));
        driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[3]/div[2]/a")).click();
        Thread.sleep(5000);

        /*WebElement delete_resume = driver.findElement(By.xpath("//i[@data-title='delete-resume']"));
        delete_resume.click();
        driver.findElement(By.xpath("/html/body/div[6]/div[7]/div/div/button")).click();*/

        //WebElement upload_resume = driver.findElement(By.xpath("//input[@class='dummyUpload typ-14Bold']"));

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Update']")));
        WebElement upload_resume = driver.findElement(By.xpath("//span[@class='dummyUploadNewCTA']"));
        //upload_resume.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dummyUploadNewCTA']")));
        upload_resume.sendKeys("\"D:\\CV\\Saurabh ACME+PF\\NOVO_ACME+PF_TestEngineer\\Saurabh_Bhalerao_QA_Analyst_.pdf\"");

        //if (driver.findElement(By.))
        Thread.sleep(6000);

        //Resume has been successfully uploaded.




        //FileInputStream file = new FileInputStream(driver);




    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
