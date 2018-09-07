package com.dreamguard.aframe.base;

import java.util.Map;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class BaseModel<T> {
    protected String[] mParams;

    public BaseModel params(String... args){
        mParams = args;
        return this;
    }

    public void execute(BaseCallback<T> callback){

    }

    public void get(String url,BaseCallback<T> callback){

    }

    public void post(String url,Map params,BaseCallback<T> callback){

    }
}
