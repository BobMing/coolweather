package com.coolweather.app.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Admin on 2017/1/15 0015.
 */

public class HttpUtil {
    public static void sendHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
