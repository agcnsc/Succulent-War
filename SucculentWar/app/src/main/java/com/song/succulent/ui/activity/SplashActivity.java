package com.song.succulent.ui.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by song on 17-11-26.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new View(this);
        view.setBackgroundColor(Color.WHITE);
        setContentView(view);

        Resources resources = this.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (this) {
                    try {
                        this.wait(1000);
                    } catch (InterruptedException e) {
                        //ignore
                    }
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        gotoNext();
                    }
                });
            }
        }).start();
    }

    private void gotoNext() {
        Intent intent = new Intent(this, TopActivity.class);
        startActivity(intent);

        this.finish();
    }
}
