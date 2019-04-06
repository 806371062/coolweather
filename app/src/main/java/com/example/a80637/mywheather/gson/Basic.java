package com.example.a80637.mywheather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 80637 on 2019/4/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
