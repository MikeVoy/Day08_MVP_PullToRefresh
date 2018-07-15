package com.example.okhttp_mvp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.okhttp_mvp.R;
import com.example.okhttp_mvp.bean.NewsBean;

import java.util.List;

public class MyHomeAdapter extends RecyclerView.Adapter<MyHomeAdapter.CustomViewHolder> {

    private static final String TAG = MyHomeAdapter.class.getSimpleName();
    private Context context;
    private List<NewsBean.StoriesBean> beanList;

    public MyHomeAdapter(Context context, List<NewsBean.StoriesBean> beanList) {
        this.context = context;
        this.beanList = beanList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //用来获取子布局   将子布局返回到holder里面
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerview_item_layout,null,false);

        return new CustomViewHolder(view,context);
    }

    //将数据在 Holder进行绑定
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        String ga_prefix =beanList.get(position).getGa_prefix();
        String imagePath = beanList.get(position).getImages().get(0);
        String title = beanList.get(position).getTitle();

        Log.i(TAG,"========"+ga_prefix+imagePath+title);
        holder.bindContext(ga_prefix,imagePath,title);
    }



    @Override
    public int getItemCount() {
        return beanList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_title;
        private ImageView iv_icon;
        private TextView tv_id;
        private Context context;

        public CustomViewHolder(View itemView,Context context) {
            super(itemView);
            this.context = context;
           //获取条目控件对象
            tv_title = itemView.findViewById(R.id.tv_title);
            iv_icon = itemView.findViewById(R.id.iv_icon);
            tv_id = itemView.findViewById(R.id.tv_id);

        }

        //将获取的数据加载进 VIEW
        public void bindContext(String ga_prefix, String imagePath, String title){

           tv_title.setText(title);
           tv_id.setText(ga_prefix);

            Glide.with(context).load(imagePath).into(iv_icon);
        }


    }
}
