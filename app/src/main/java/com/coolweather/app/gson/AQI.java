package com.coolweather.app.gson;

/**
 * Created by Admin on 2017/1/23 0023.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
