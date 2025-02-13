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

public class WebTable1 {

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

        driver.get("https://awesomeqa.com/webtable.html");

        //From Webtable print contact 'Helen Bennett' and her country
        //for this we will use the Xpath Axes
        //Full Xpath - //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling :: td
        //where, //table[@id="customers"]/tbody/tr[5]/td[2] this will give value 'Helen Benett'
        //and, /following-sibling :: td this will give value of country of Helen Benett

        //Problem Statement: -
        // Print all the data in the table and if name = Helen then print Country, she belongs to.

        //Logic:-
        // Xpath - //table[@id="customers"]/tbody/tr[5]/td[2]
        //Seperated Xpath in 3 parts as values of tr and td will be changed, we will take those as i and j

        String first_Part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_Part = "]/td[";
        String third_Part = "]";


        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td")).size();

        //row started from 2 so i=2 and column starts from 1 so j=1
        for (int i=2; i<row; i++){
            for (int j=1; j<column; j++){
                //combined Xpath again with i and j values
                String dynamic_Xpath = first_Part+i+second_Part+j+third_Part;
                String data = driver.findElement(By.xpath(dynamic_Xpath)).getText();
                System.out.println(data);

                if(data.contains("Helen Bennett")){
                    String country_path = dynamic_Xpath + "/following-sibling :: td";
                    String column_data = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("--------------------------");
                    System.out.println("Helen Benett is is -> " + column_data);
                    System.out.println("--------------------------");
                }


            }
        }


    }








    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
