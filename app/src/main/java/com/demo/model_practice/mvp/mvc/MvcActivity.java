package com.demo.model_practice.mvp.mvc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.demo.model_practice.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 类或接口的描述信息
 *
 * @Author:qubin
 * @Theme:
 * @Data:2020-10-07
 * @Describe:
 */
public class MvcActivity extends AppCompatActivity {

    private EditText editText;
    private TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvcview);
        editText = (EditText)findViewById(R.id.edt_input);
        txtResult = (TextView)findViewById(R.id.txt_result);

    }

    public void searchData(View view) {
        MvcModel.getData(editText.getText().toString(), new MvcModelCallback() {
            @Override
            public void onSuccess(String successMsg) {
                txtResult.setText(successMsg);
            }

            @Override
            public void onError(String errorMsg) {
                txtResult.setText(errorMsg);
            }
        });
    }
}
