package com.framework.driver;

import com.framework.config.ConfigUtil;
import com.framework.config.ReadConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //public static WebDriver driver;


    public static void initDriver() {
        WebDriver driver;
        String browser = ConfigUtil.getConfig().Browser();
        driver=DriverFactory.getDriver(browser);
        DriverManager.setDriver(driver);

        DriverManager.getDRiver().manage().window().maximize();
        DriverManager.getDRiver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigUtil.getConfig().Timeout()));
        DriverManager.getDRiver().get(ConfigUtil.getConfig().Url());
    }

    public static void quitDriver() {
        DriverManager.getDRiver().quit();
    }
}
