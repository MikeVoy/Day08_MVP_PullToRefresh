package com.example.okhttp_mvp.model;

import android.util.Log;

import com.example.okhttp_mvp.bean.NewsBean;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsModelImpl implements Imodel {

    private static final String TAG = NewsModelImpl.class.getSimpleName();
    private String api = "http://news-at.zhihu.com/api/4/news/latest";
    private OkHttpClient client;


    @Override
    public void requestData(final dataListener dataListener) {
        //使用OKHttp请求资源
        client = new OkHttpClient();

        //新建reuqest辅助类   默认get请求
        Request request = new Request.Builder()
                .url(api)
                .build();

        Call call = client.newCall(request);
        //异步请求
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){

                    String string = response.body().string();
                  //解析
                    Gson gson = new Gson();
                    NewsBean newsBean = gson.fromJson(string, NewsBean.class);
                    //回调
                    dataListener.onRequestSuccess(newsBean);
                    List<NewsBean.StoriesBean> stories = newsBean.getStories();
                   for(NewsBean.StoriesBean  item :stories ){
                      // Log.i(TAG,"解析到的"+item);
                   }


                }else {
                    dataListener.onRequestError("请求资源失败");
                }
            }
        });
    }

    @Override
    public void onPull() {
        api = "http://news-at.zhihu.com/api/3/news/latest";
    }

    @Override
    public void onLoad() {
        api = "http://news-at.zhihu.com/api/4/news/latest";
    }
}
