package com.testingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium001 {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.manage().window().maximize();

        /*Selenium Flow
        1. Create a session, ID - q89764sdafad5485
        2. Session -> Run the Command - GET -> GET method W3C Protocol
        3. EdgeDriver (Server) -> Tell the Edge browser
        4. Open a fresh copy of the Edge Browser and open the URL -> "https://sdet.live"
        5. driver.quite Command (POST) Request - Shutdown the browser
        */

    }
}
