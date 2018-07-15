package com.example.okhttp_mvp.presenter;


import com.example.okhttp_mvp.bean.NewsBean;
import com.example.okhttp_mvp.model.Imodel;
import com.example.okhttp_mvp.model.NewsModelImpl;
import com.example.okhttp_mvp.view.ImainVIew;

public class NewsPresenterImpl implements InewsPesenter {

    private ImainVIew imainVIew;
    private NewsModelImpl model;

    public NewsPresenterImpl(ImainVIew imainVIew) {
        this.imainVIew = imainVIew;
       this.model = new NewsModelImpl();
    }

    @Override
    public void requestData() {

        model.requestData(new Imodel.dataListener() {
            @Override
            public void onRequestSuccess(NewsBean bean) {
                imainVIew.onSuccess(bean);
            }

            @Override
            public void onRequestError(String errorMsg) {
                   imainVIew.onError(errorMsg);
            }
        });

    }

    @Override
    public void onPullData() {
        model.onPull();

    }

    @Override
    public void onLoadData() {
      model.onPull();
    }


}
