package com.example.day08_mvp_pulltorefresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.day08_mvp_pulltorefresh.bean.NewsBean;
import com.example.day08_mvp_pulltorefresh.presenter.MyPresenterImpl;
import com.example.day08_mvp_pulltorefresh.view.MainView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String TAG = MainActivity.class.getSimpleName();
    private PullToRefreshListView myListView;
    private MyPresenterImpl myPresenter;

    private String api = "https://www.zhaoapi.cn/product/getProducts?pscid=1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.pull_to_refresh_listView);

        //获取presenter的引用
        myPresenter = new MyPresenterImpl(this);
        //请求数据
        myPresenter.getURL(api);

        myListView.setMode(PullToRefreshBase.Mode.BOTH);

        myListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {

            }
        });

    }

    @Override
    public void getList(List<NewsBean.DataBean> list) {
        Log.i(TAG,"请求到的资源"+list);

    }
}
