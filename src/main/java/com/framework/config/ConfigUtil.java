package com.framework.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigUtil {

    public static ReadConfig getConfig()
    {
        return ConfigFactory.create(ReadConfig.class);
    }
}
