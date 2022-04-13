package com.jobforandroid.cooltimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView time;
    Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seek_bar_taimer);
        time = findViewById(R.id.tvResult);
        btn_start = findViewById(R.id.btn_start);

        seekBar.setMax(500);
        seekBar.setProgress(50);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                int minutes = progress/60;
                int seconds = progress- (minutes * 60);

                String minutesString = "";
                String secondsString = "";

                if (minutes < 10) {
                    minutesString = "0" + minutes;
                } else {
                    minutesString = String.valueOf(minutes);
                }

                if (seconds < 10) {
                    secondsString = "0" + seconds;
                }else {
                    secondsString = String.valueOf(seconds);
                }

                time.setText(minutesString + ":" + secondsString);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }



}