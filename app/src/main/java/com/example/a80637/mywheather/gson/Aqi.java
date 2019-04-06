package com.example.a80637.mywheather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 80637 on 2019/4/6.
 */

public class Aqi {

    @SerializedName("city")
    public AqiCity aqiCity;

    public class AqiCity{
        public String aqi;
        public String pm25;
    }

}
