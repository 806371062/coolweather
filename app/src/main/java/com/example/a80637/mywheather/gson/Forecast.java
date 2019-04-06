package com.example.a80637.mywheather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 80637 on 2019/4/6.
 */

public class Forecast {

    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;
        public String min;
    }

}
