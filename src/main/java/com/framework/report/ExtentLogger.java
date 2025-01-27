package com.framework.report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.framework.utils.ScreenshotUtils;

public class ExtentLogger {

    public static void pass(String message) {
        ExtentManager.getTest().pass
                (message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void fail(String message) {
        ExtentManager.getTest().fail
                (message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void info(String message) {
        ExtentManager.getTest().info
                (message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
}
