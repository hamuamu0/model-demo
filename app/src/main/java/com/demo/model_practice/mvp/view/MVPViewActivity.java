package com.demo.model_practice.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.demo.model_practice.R;
import com.demo.model_practice.mvp.presenter.MVPPresenter;

public class MVPViewActivity extends AppCompatActivity implements IView {

    private ProgressDialog mProgress;
    private TextView textView;
    private MVPPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpview);
        mvpPresenter = new MVPPresenter(this);
        mProgress = new ProgressDialog(this);
        mProgress.setMessage("正在加载中...");
        textView = (TextView)findViewById(R.id.txt_data);
    }

    public void getDate(View view) throws InterruptedException {
        mvpPresenter.getData("qubin11");
    }

    @Override
    public void showLoading() {
        if (!mProgress.isShowing()){
            mProgress.show();
        }

    }

    @Override
    public void dissLoading() {
        if (mProgress.isShowing()){
            mProgress.dismiss();
        }
    }

    @Override
    public void setSuccessData(String result) {
        textView.setText(result);
    }

    @Override
    public void setFailureData(String error) {
        textView.setText(error);
    }


}
