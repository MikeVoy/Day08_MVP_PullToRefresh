package com.example.okhttp_mvp.model;

import com.example.okhttp_mvp.bean.NewsBean;

public interface Imodel {


    interface dataListener{
        void onRequestSuccess(NewsBean bean);
        void onRequestError(String errorMsg);
    }

    void requestData(dataListener dataListener);
    void onPull();
    void onLoad();
}
