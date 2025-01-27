package com.framework.utils;

import com.framework.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    public static String getScreenshot()
    {
        return ((TakesScreenshot) DriverManager.getDRiver()).getScreenshotAs(OutputType.BASE64);
    }
}
