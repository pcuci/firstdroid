package com.cooperathon.justinemoves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity{
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    public static boolean color = false;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.cooperation.justinemoves.R.layout.activity_main);
        view = findViewById(com.cooperation.justinemoves.R.id.textView);
        view.setBackgroundColor(Color.GREEN);

        //TODO: 1. Call the service

        Intent intent = new Intent(this,HapticService.class);
//        stopService(intent);
        startService(intent);

        //TODO: 2. Copy the functional code into the service


        //TODO: 3. Have the service update the UI / make the haptics operate when the phone is OFF

    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {

//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
    }


    @Override
    protected void onResume() {
        super.onResume();
        // register this class as a listener for the orientation and
        // accelerometer sensors
//        sensorManager.registerListener(this,
//                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
//                SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        // unregister listener
        super.onPause();
//        sensorManager.unregisterListener(this);
    }
}
