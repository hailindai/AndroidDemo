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

public interface BaseCallback<T> {

    /**
     * 成功
     * @param data
     */
    public void onSuccess(T data);

    /**
     * 失败
     * @param message
     */
    public void onFailure(String message);

    /**
     * 完成
     */
    public void onComplete();

}
