package com.dreamguard.aframe.model;

import android.os.Build;

import com.dreamguard.aframe.base.BaseCallback;
import com.dreamguard.aframe.base.BaseModel;
import com.dreamguard.aframe.bean.All3DParam;
import com.dreamguard.aframe.helper.RetrofitManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class ParamModel extends BaseModel<String> {

    @Override
    public void post(String url, Map params, final BaseCallback<String> callback) {
        super.post(url, params, callback);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("errorCode", 0);
            jsonObject.put("buType", 1);
            jsonObject.put("seq", 0);

            JSONObject data = new JSONObject();
            data.put("model", Build.MODEL);
            data.put("man", Build.MANUFACTURER);

            jsonObject.put("data", data);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        RetrofitManager.builder()
                .getService()
                .filmCmb(jsonObject.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<All3DParam>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(All3DParam all3DParam) {
                        callback.onSuccess(all3DParam.toString());
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
