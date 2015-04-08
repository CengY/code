package com.cengy.module.a;

/**
 * Created by cengy on 2015/4/8.
 */
public class ServiceProviderFactory<S> {

    static public <S extends Service, F extends Factory<S>> S getService(F f) {
        return f.produceService();
    }
}
