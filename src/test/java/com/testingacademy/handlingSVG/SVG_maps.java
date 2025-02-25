package com.testingacademy.handlingSVG;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SVG_maps {

    //This is not worked, not able to click on Tripura state
    EdgeDriver driver;

    @BeforeMethod
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);


    }


    @Test
    @Description("Verify that State is present")
    public void testPositive(){

        String url = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(url);
        driver.manage().window().maximize();

        //*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path'] -- path for all states
        //Click on Tripura

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for (WebElement state : states){

            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("area-label").equalsIgnoreCase("Tripura  ")){
                state.click();
            }
        }







    }
}
