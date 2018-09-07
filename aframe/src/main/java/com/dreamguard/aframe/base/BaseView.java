package com.dreamguard.aframe.base;

import android.content.Context;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public interface BaseView {

    public void showLoading();

    public void hideLoading();

    public void showToast(String message);

    public void showError(String message);

    public Context getContext();
}
