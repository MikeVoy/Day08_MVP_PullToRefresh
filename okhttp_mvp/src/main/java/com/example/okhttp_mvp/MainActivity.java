package com.example.okhttp_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.okhttp_mvp.adapter.MyHomeAdapter;
import com.example.okhttp_mvp.bean.NewsBean;
import com.example.okhttp_mvp.presenter.NewsPresenterImpl;
import com.example.okhttp_mvp.view.ImainVIew;
import com.example.okhttp_mvp.view.MySearchView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ImainVIew {

    private static final String TAG = MainActivity.class.getSimpleName();

    private PullToRefreshScrollView pull_to_refresh_sv;
    private RecyclerView rv_view;
    private MyHomeAdapter myHomeAdapter;
    private NewsPresenterImpl presenter;
    private List<NewsBean.StoriesBean> stories;
    private MySearchView search_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //控件初始化
        init();


    }
    //初始化控件
    private void init() {
        //获取presenter层的引用
        presenter = new NewsPresenterImpl(this);
        presenter.requestData();

        pull_to_refresh_sv = findViewById(R.id.pull_to_refresh_sv);
        rv_view = findViewById(R.id.rv_view);
        search_view = findViewById(R.id.search_view);
        //pullToRefresh的初始属性操作
        pull_to_refresh_sv.setMode(PullToRefreshBase.Mode.BOTH);
        rv_view.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        

        pull_to_refresh_sv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {


                 presenter.requestData();
              //   presenter.onPullData();
                 pull_to_refresh_sv.onRefreshComplete();

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {

                presenter.requestData();
              //  presenter.onLoadData();
                pull_to_refresh_sv.onRefreshComplete();
            }
        });

        search_view.onBackListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    public void onSuccess(final NewsBean bean) {
     //在UI线程中完成数据的放入
      Log.i(TAG,bean.getStories()+"");
        stories = bean.getStories();
        runOnUiThread(new Runnable() {
          @Override
          public void run() {
              //初始化适配器
              myHomeAdapter = new MyHomeAdapter(MainActivity.this, stories);
              rv_view.setAdapter(myHomeAdapter);
              pull_to_refresh_sv.onRefreshComplete();
              //
          }

      });
    }

    @Override
    public void onError(String error) {

    }


}
