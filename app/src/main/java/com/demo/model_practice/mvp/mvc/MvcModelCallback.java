package com.demo.model_practice.mvp.mvc;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public interface MvcModelCallback {

    void onSuccess(String successMsg);
    void onError(String errorMsg);
}
