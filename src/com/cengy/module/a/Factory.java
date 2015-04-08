package com.cengy.module.a;

/**
 * Created by cengy on 2015/4/8.
 */
public abstract class Factory<T> implements ServiceProvider<T> {
    protected Factory() {
    }

    @Override
    public <T1 extends Service> T1 produceService(Class<T1> cls) {
        //if u need . u should overwrite this method.
        throw new UnsupportedOperationException();
    }
}
