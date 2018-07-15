package com.example.day08_mvp_pulltorefresh.view;

import com.example.day08_mvp_pulltorefresh.bean.NewsBean;

import java.util.List;

public interface MainView {

    //获取数据,在此实现方法中进行adapter的配置
  void getList(List<NewsBean.DataBean>list);

}
