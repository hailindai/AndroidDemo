package com.dreamguard.aframe.presenter;


import com.dreamguard.aframe.base.BaseCallback;
import com.dreamguard.aframe.base.BasePresenter;
import com.dreamguard.aframe.helper.DiskCacheManager;
import com.dreamguard.aframe.base.DataModel;
import com.dreamguard.aframe.model.ParamModel;
import com.dreamguard.aframe.model.RegCodeModel;
import com.dreamguard.aframe.view.ParamView;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/09/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class ParamPresenter extends BasePresenter<ParamView> {
    public void getData(){
        if(!isViewAttached()){
            return;
        }
        getView().showLoading();

        DataModel.request(RegCodeModel.class)
                .execute(new BaseCallback<String>() {
                    @Override
                    public void onSuccess(String data) {
                        if(isViewAttached()){
                            getView().showData(data);
                        }
                    }

                    @Override
                    public void onFailure(String message) {
                        if(isViewAttached()){
                            getView().showError(message);
                            getView().hideLoading();
                        }
                    }

                    @Override
                    public void onComplete() {
                        if(isViewAttached()){
                            getView().hideLoading();
                        }
                    }
                });
    }
}
