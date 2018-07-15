package com.example.day08_mvp_pulltorefresh.utils;


import android.os.AsyncTask;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {

    private static final HttpUtils ourInstance = new HttpUtils();

    public static HttpUtils getInstance() {
        return ourInstance;
    }

    private HttpUtils() {
    }

    //暴露接受网址的方法
    public void getURL(String url){

        new  DoMyTask().execute(url);
    }


    //封装请求资源的操作
    class DoMyTask extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            //GEt方法请求资源
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                if(connection.getResponseCode()==HttpURLConnection.HTTP_OK){

                    return inputStream2String(connection.getInputStream());

                }

            } catch (Exception e) {
                e.printStackTrace();
            }




            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if(s!=null){
               callBack.onSuccess(s);
            }else {
                callBack.onError("请求资源出错");
            }

        }
    }

    private String inputStream2String(InputStream inputStream) throws IOException {


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = -1;
        byte[] bytes = new byte[1024];

        while ((len=inputStream.read(bytes))!=-1){

            outputStream.write(bytes,0,len);
        }
        return new String(outputStream.toByteArray());
    }

    //设置回调函数

    private  NetCallBack callBack;

    public void setCallBack(NetCallBack callBack) {
        this.callBack = callBack;
    }

    public interface NetCallBack{

        void onSuccess(String s);
        void onError(String msg);

    }


}
