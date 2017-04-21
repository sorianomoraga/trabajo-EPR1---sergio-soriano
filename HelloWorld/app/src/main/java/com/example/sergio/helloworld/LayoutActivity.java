package com.example.sergio.helloworld;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Sergio on 21-04-2017.
 */

public class LayoutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstance ){
        super.onCreate(savedInstance);
        setContentView(R.layout.linear_layout);
    }
}
