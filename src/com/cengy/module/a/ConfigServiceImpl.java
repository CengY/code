package com.cengy.module.a;

/**
 * Created by cengy on 2015/4/8.
 */
public class ConfigServiceImpl implements ConfigService {

    static public class ConfigServiceFactory extends Factory<ConfigService> {
        @Override
        public ConfigService produceService() {
            return new ConfigServiceImpl();
        }
    }
}
