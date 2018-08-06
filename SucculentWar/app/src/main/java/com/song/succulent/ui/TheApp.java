package com.song.succulent.ui;

import android.app.Application;

/**
 * Created by song on 17-11-26.
 */

public class TheApp extends Application {

    private static TheApp instance;

    public static TheApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }
}
