package com.testingacademy.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TC001 {

    @Test(groups = "Sanity")
    public void test1(){

        System.out.println("test1");
        Assert.assertTrue(false);
    }

    @Test(groups = "Sanity")
    public void test2(){

        System.out.println("test2");
        Assert.assertTrue(true);
    }
}
