package com.framework.page;

import com.framework.report.ExtentLogger;
import com.framework.report.ExtentManager;
import com.framework.utils.WebElementUtils;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TEXTBOX_USERNAME=By.name("username");
    private static final By TEXTBOX_PASSWORD=By.name("password");
    private static final By TEXTBOX_BUTTON=By.className("oxd-button");
    private static final By TEXT_ERROR=By.className("oxd-alert-content-text");

    public void setUsername(String userName)
    {
        WebElementUtils.sendKeys(TEXTBOX_USERNAME,userName);
        ExtentLogger.pass("Username is entered");
    }

    public void setPassword(String password)
    {
        WebElementUtils.sendKeys(TEXTBOX_PASSWORD,password);
        ExtentLogger.pass("Password is entered");
    }

    public void clickLoginButton()
    {
        WebElementUtils.click(TEXTBOX_BUTTON);
        ExtentLogger.pass("login button is clicked");
    }

    public void performLogin(String userName,String password)
    {
        setUsername(userName);
        setPassword(password);
        clickLoginButton();
    }

    public String getErrorMessage()
    {
        String error=WebElementUtils.getText(TEXT_ERROR);
        return error;
    }
}
