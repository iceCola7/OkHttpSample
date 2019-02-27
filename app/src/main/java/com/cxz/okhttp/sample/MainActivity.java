package com.cxz.okhttp.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cxz.okhttp.sample.neokhttp.IJsonDataListener;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    private String url = "http://www.wanandroid.com/banner/json1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpUtil.sendJsonRequest(null, url, ResponseBean.class, new IJsonDataListener<ResponseBean>() {

            @Override
            public void success(ResponseBean responseBean) {
                Log.e(TAG, "--------->>" + responseBean.toString());
            }

            @Override
            public void fail() {

            }
        });

    }
}
