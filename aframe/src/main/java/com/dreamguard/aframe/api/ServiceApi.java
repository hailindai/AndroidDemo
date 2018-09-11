package com.dreamguard.aframe.api;

import com.dreamguard.aframe.bean.All3DParam;
import com.google.gson.JsonObject;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public interface ServiceApi {
    @POST("filmcmb")
    @FormUrlEncoded
    Observable<All3DParam> filmCmb(@Field("data") String data);

//    http://192.168.2.10/user/regcode

    @GET("https://api2.bmob.cn/1/classes/test")
    Observable<JsonObject> getTest();
}
