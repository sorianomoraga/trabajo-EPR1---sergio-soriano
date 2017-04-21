package com.example.sergio.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

/**
 * Created by Sergio on 19-04-2017.
 */

public class secondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        String valorTest = getIntent().getStringExtra("valorTest");
        Log.d("Helloworld-sActivity",valorTest);

    }
}
