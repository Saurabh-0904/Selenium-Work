package com.testingacademy.basicPrograms;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC002 {

    @Test
    @Description("Verify the title of the TheTestingAcademy website")
    public void vwoLogin() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://thetestingacademy.com/");
        System.out.println(driver.getTitle());


    }
}
