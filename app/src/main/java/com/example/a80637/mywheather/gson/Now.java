package com.example.a80637.mywheather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 80637 on 2019/4/6.
 */

public class Now{

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
