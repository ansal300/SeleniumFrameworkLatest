package com.framework.testdata;

import io.github.sskorol.data.Column;
import org.apache.poi.ss.formula.functions.Index;

public class TestData {

    @Column(name = "TestName")
    public String testName;
    @Column(name = "UserName")
    public String username;
    @Column(name = "Password")
    public String password;
}
