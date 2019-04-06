package com.example.a80637.mywheather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 80637 on 2019/4/5.
 */

public class HttpUtil {

    /*
    *OkHttp网页访问
    * */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request
                .Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }

}
