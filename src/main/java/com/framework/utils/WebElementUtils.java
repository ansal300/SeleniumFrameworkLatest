package com.framework.utils;

import com.framework.config.ConfigUtil;
import com.framework.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementUtils {

    public static void click(By by) {
        waitUntiElementIsVisible(by);
        DriverManager.getDRiver().findElement(by).click();
    }

    public static void sendKeys(By by, String text) {
        waitUntiElementIsVisible(by);
        DriverManager.getDRiver().findElement(by).sendKeys(text);
    }

    public static String getText(By by) {
        waitUntiElementIsVisible(by);
        return DriverManager.getDRiver().findElement(by).getText();
    }

    public static void waitUntiElementIsVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDRiver(), Duration.ofSeconds(ConfigUtil.getConfig().Timeout()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
