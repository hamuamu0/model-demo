package com.demo.model_practice.mvp.mvc;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public class MvcModel {

    public static void getData(String account,MvcModelCallback modelCallback){
        try {
            Thread.sleep(3000);
            if (account.equals("qubin")){
                modelCallback.onSuccess("查询到了数据");
            }else {
                modelCallback.onError("没有找到数据");
            }



        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
