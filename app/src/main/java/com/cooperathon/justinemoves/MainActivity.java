package com.cooperathon.justinemoves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.cooperathon.justinemoves.MESSAGE";

    public static boolean color = false;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.cooperathon.justinemoves.R.layout.activity_main);
        Intent intent = new Intent(this,HapticService.class);

        //stopService(intent);
        startService(intent);
    }
}
