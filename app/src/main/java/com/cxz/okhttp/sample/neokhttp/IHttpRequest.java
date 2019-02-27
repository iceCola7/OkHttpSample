package com.cxz.okhttp.sample.neokhttp;

/**
 * @author chenxz
 * @date 2019/2/27
 * @desc
 */
public interface IHttpRequest {

    void setUrl(String url);

    void setData(byte[] data);

    void setListener(CallbackListener listener);

    // StringRequest JsonRequest
    void execute();
}
