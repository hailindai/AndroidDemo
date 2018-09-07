package com.dreamguard.aframe.api;

import com.dreamguard.aframe.bean.All3DParam;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
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

public interface ParamServiceApi {
    @POST("filmcmb")
    @FormUrlEncoded
    Observable<All3DParam> filmCmb(@Field("data") String data);
}
