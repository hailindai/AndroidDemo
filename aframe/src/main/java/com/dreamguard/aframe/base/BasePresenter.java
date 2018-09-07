package com.dreamguard.aframe.base;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class BasePresenter<V extends BaseView> {
    private V view;

    public void attachView(V view){
        this.view = view;
    }

    public void detachView(){
        this.view = null;
    }

    public boolean isViewAttached(){
        return this.view != null;
    }

    public V getView(){
        return this.view;
    }
}
