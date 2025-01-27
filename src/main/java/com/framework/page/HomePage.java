package com.framework.page;

import com.framework.driver.DriverManager;

public class HomePage {

    public String getTitle()
    {
        return DriverManager.getDRiver().getTitle();
    }
}
