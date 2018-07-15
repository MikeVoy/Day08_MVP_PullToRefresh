package com.example.day08_mvp_pulltorefresh.modle;

import com.example.day08_mvp_pulltorefresh.bean.NewsBean;
import com.example.day08_mvp_pulltorefresh.utils.HttpUtils;
import com.google.gson.Gson;

import java.util.List;

public class DataModleImpl implements DataModle {


    @Override
    public void getPath(String path, final DataModle.dataListener listener) {
         //获取httpUtils
        HttpUtils httpUtils = HttpUtils.getInstance();
        httpUtils.getURL(path);
        httpUtils.setCallBack(new HttpUtils.NetCallBack() {
            @Override
            public void onSuccess(String s) {
                //解析网络资源
                Gson gson = new Gson();
                NewsBean newsBean = gson.fromJson(s, NewsBean.class);
                List<NewsBean.DataBean> data = newsBean.getData();

                //将数据放入,(presenter实现了这个接口的监听,可以获取里面的数据)
                listener.sendData(data);

            }

            @Override
            public void onError(String msg) {
            }
        });

    }

}
