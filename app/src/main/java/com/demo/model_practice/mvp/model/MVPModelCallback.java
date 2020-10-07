package com.demo.model_practice.mvp.model;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public interface MVPModelCallback {

    void onSuccess(String resultMsg);

    void onFailure(String errorMsg);
}
