package com.cxz.okhttp.sample.neokhttp;

import java.io.InputStream;

/**
 * @author chenxz
 * @date 2019/2/27
 * @desc
 */
public interface CallbackListener {

    void success(InputStream inputStream);

    void fail();
}
