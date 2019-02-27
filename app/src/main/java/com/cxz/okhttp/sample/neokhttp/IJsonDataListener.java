package com.cxz.okhttp.sample.neokhttp;

/**
 * @author chenxz
 * @date 2019/2/27
 * @desc
 */
public interface IJsonDataListener<T> {

    void success(T t);

    void fail();

}
