package com.testingacademy.handlingWebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable2 {

    //Dynamic table (means columns are not the same for each row)
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }


    @Test (groups = "QA")
    @Description("To verify the elements or values in WebTables are present")
    public void test1(){

        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        
        //To print all data from table 
        for (int i = 0; i < rows.size() ; i++) {
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
           for (WebElement e : columns){
               System.out.println(e.getText());
           }
            
        }

        }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

