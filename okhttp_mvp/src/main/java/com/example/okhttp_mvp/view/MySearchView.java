package com.example.okhttp_mvp.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.okhttp_mvp.MainActivity;
import com.example.okhttp_mvp.R;
import com.example.okhttp_mvp.SearchActivity;

public class MySearchView extends LinearLayout implements View.OnClickListener {

    private EditText et_content;
    private Button btn_search;
    private Button btn_back;
    private  Context context;

    public MySearchView(Context context) {
        super(context);
        init(context);
    }

    public MySearchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MySearchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
          this.context = context;
        LayoutInflater.from(context).inflate(R.layout.search_view, this, true);
        et_content = findViewById(R.id.et_content);
        btn_search = findViewById(R.id.btn_search);
        btn_back = findViewById(R.id.btn_back);
        btn_search.setOnClickListener(this);
        btn_back.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_back:

                break;
            case R.id.btn_search:

                Intent intent = new Intent(getContext(), SearchActivity.class);
                getContext().startActivity(intent);
                break;


        }
    }

    public  void  onBackListener (OnClickListener  clickListener){

        btn_back.setOnClickListener(clickListener);

    }


}
