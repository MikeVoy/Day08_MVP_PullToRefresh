package com.example.day08_mvp_pulltorefresh.presenter;

import android.widget.Toast;

import com.example.day08_mvp_pulltorefresh.MainActivity;
import com.example.day08_mvp_pulltorefresh.bean.NewsBean;
import com.example.day08_mvp_pulltorefresh.modle.DataModle;
import com.example.day08_mvp_pulltorefresh.modle.DataModleImpl;
import com.example.day08_mvp_pulltorefresh.view.MainView;

import java.util.List;

public class MyPresenterImpl implements MyPresenter, DataModle.dataListener {

    private MainView mainView;
    private DataModle dataModle;

    public MyPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        this.dataModle = new DataModleImpl();
    }


    @Override
    public void getURL(String path) {
         dataModle.getPath(path,this);
    }



    @Override
    public void sendData(List<NewsBean.DataBean> data) {
         //因为实现了modle接口的监听接口,所以拥有数据,调用view的方法,将值放入
            mainView.getList(data);
    }
}
