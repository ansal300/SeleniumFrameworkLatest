package com.framework.listner;

import com.framework.report.ExtentLogger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName() +" is failed");
    }
}
