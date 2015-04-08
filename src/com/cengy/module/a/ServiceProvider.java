package com.cengy.module.a;

/**
 * Created by cengy on 2015/4/8.
 */
public interface ServiceProvider<T> {

    public <T extends Service> T produceService();

    public <T extends Service> T produceService(Class<T> cls);
}
