package com.example.a80637.mywheather.util;

import android.util.Log;

/**
 * Created by 80637 on 2019/4/6.
 */

public class LogUtil {

    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;
    private static final int level = VERBOSE;

    public static void v(String TAG, String message){
        if (level <= VERBOSE){
            Log.v(TAG, message);
        }
    }

    public static void d(String TAG, String message){
        if (level <= DEBUG){
            Log.d(TAG, message);
        }
    }

    public static void i(String TAG, String message){
        if (level <= INFO){
            Log.i(TAG, message);
        }
    }

    public static void w(String TAG, String message){
        if (level <= WARN){
            Log.w(TAG, message);
        }
    }

    public static void e(String TAG, String message){
        if (level <= ERROR){
            Log.e(TAG, message);
        }
    }

}
