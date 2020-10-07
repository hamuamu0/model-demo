package com.demo.model_practice.mvp.view;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public interface IView {

    void showLoading();
    void dissLoading();
    void setSuccessData(String result);
    void setFailureData(String error);
}
