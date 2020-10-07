package com.demo.model_practice.mvp.model;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public class MVPModel {

    public void getAccountData(String account,MVPModelCallback mvpModelCallback) throws InterruptedException {
        Thread.sleep(3000);
        if (account.equals("qubin")){
            mvpModelCallback.onSuccess("查询结果正确");
        }else {
            mvpModelCallback.onFailure("查不到结果");
        }
    }
}
