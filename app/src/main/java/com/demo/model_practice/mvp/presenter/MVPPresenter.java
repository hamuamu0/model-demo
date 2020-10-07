package com.demo.model_practice.mvp.presenter;

import com.demo.model_practice.mvp.model.MVPModel;
import com.demo.model_practice.mvp.model.MVPModelCallback;
import com.demo.model_practice.mvp.view.IView;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public class MVPPresenter {

    private IView iView;
    private MVPModel mvpModel;

    public MVPPresenter(IView iView){
        this.iView = iView;
        mvpModel = new MVPModel();
    }

    public void getData(String accountData) throws InterruptedException {
        iView.showLoading();
        mvpModel.getAccountData(accountData, new MVPModelCallback() {
            @Override
            public void onSuccess(String resultMsg) {
                iView.setSuccessData(resultMsg);
                iView.dissLoading();
            }

            @Override
            public void onFailure(String errorMsg) {
                iView.setFailureData(errorMsg);
                iView.dissLoading();
            }
        });
    }
}
