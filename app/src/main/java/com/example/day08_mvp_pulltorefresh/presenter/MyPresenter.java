package com.example.day08_mvp_pulltorefresh.presenter;

import com.example.day08_mvp_pulltorefresh.bean.NewsBean;

import java.util.List;

public interface MyPresenter {

    //获取路径
    void getURL(String path);

    //发送数据
    void sendData(List<NewsBean.DataBean> data);

   //接受List数据

}
