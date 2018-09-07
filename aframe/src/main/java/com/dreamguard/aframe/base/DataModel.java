package com.dreamguard.aframe.base;


import com.dreamguard.aframe.base.BaseModel;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class DataModel {

    public static BaseModel request(Class clz){
        BaseModel model = null;
        try {
            model = (BaseModel)clz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return model;
    }

}
