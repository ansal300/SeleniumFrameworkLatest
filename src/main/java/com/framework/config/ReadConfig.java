package com.framework.config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:./src/test/resources/Config.properties")
public interface ReadConfig extends Config{
    String Browser();
    long Timeout();
    String Url();
}
