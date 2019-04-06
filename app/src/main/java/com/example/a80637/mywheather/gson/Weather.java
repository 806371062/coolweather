package com.example.a80637.mywheather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 80637 on 2019/4/6.
 */

public class Weather {

    public String status;
    public Basic basic;
    public Aqi aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
