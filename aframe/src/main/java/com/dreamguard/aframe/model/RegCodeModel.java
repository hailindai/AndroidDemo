package com.dreamguard.aframe.model;

import android.os.Build;

import com.dreamguard.aframe.base.BaseCallback;
import com.dreamguard.aframe.base.BaseModel;
import com.dreamguard.aframe.bean.All3DParam;
import com.dreamguard.aframe.helper.RetrofitManager;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/10
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class RegCodeModel extends BaseModel<String> {
    @Override
    public void execute(final BaseCallback<String> callback) {

        RetrofitManager.builder()
                .getService()
                .getTest()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JsonObject>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(JsonObject value) {
                        callback.onSuccess(value.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        callback.onComplete();
                    }
                });
    }
}
