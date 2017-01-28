package com.coolweather.app.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2017/1/23 0023.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
