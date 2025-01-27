package com.framework.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.framework.config.ReadConfig;
import com.framework.driver.Driver;
import com.framework.report.ExtentReport;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {


    @BeforeSuite
    public void beforeSuite() {
        ExtentReport.initReport();
    }

    @BeforeMethod
    public void setUp(Method method) {
        Driver.initDriver();
        ExtentReport.createTest(method.getName());
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }


    @AfterSuite
    public void afterSuite() {
        ExtentReport.flushReport();
    }
}
