package com.cxz.okhttp.sample;

import com.cxz.okhttp.sample.neokhttp.CallbackListener;
import com.cxz.okhttp.sample.neokhttp.HttpTask;
import com.cxz.okhttp.sample.neokhttp.IHttpRequest;
import com.cxz.okhttp.sample.neokhttp.IJsonDataListener;
import com.cxz.okhttp.sample.neokhttp.JsonCallbackListener;
import com.cxz.okhttp.sample.neokhttp.JsonHttpRequest;
import com.cxz.okhttp.sample.neokhttp.ThreadPoolManager;

/**
 * @author chenxz
 * @date 2019/2/27
 * @desc
 */
public class OkHttpUtil {

    public static <T, M> void sendJsonRequest(T requestData, String url,
                                              Class<M> responseData, IJsonDataListener listener) {
        IHttpRequest httpRequest = new JsonHttpRequest();
        CallbackListener callbackListener = new JsonCallbackListener<>(responseData, listener);

        HttpTask httpTask = new HttpTask(requestData, url, httpRequest, callbackListener);
        ThreadPoolManager.getInstance().addTask(httpTask);
    }

}
