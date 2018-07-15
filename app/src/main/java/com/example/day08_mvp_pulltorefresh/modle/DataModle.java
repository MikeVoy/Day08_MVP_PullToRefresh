package com.example.day08_mvp_pulltorefresh.modle;

import com.example.day08_mvp_pulltorefresh.bean.NewsBean;

import java.util.List;

public interface DataModle {


     interface dataListener{
         //传回数据
         void sendData(List<NewsBean.DataBean> data);
     }

    //接受网址
    void getPath(String path,dataListener listener);


}
