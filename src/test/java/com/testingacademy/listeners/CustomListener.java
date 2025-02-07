package com.testingacademy.listeners;

import org.testng.IExecutionListener;

public class CustomListener implements IExecutionListener {

    @Override
    public void onExecutionStart() {
        //Excel file read, JSON file, Allure Report start, Reporting, Logs Starting

        long startTime =System.currentTimeMillis();
        System.out.println("****  *** Started Execution at- "+ startTime +"****  ***");

    }

    @Override
    public void onExecutionFinish() {
        long endTime =System.currentTimeMillis();
        System.out.println("****  *** Finished Execution at- "+ endTime +"****  ***");
    }
}
