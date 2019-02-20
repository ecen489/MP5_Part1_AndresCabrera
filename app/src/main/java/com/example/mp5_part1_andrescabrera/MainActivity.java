package com.example.mp5_part1_andrescabrera;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    MediaPlayer mp;

    // Radio Button calls
    public void RadioPlay(View view) {

        if (view.getId() == R.id.radioButton){
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(MainActivity.this, R.raw.going_bad);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageView2);
            myImage.setImageResource(R.drawable.meekmill);
        }
        else if (view.getId() == R.id.radioButton2){
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(MainActivity.this, R.raw.something_new);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageView2);
            myImage.setImageResource(R.drawable.getter);
        }
        else if (view.getId() == R.id.radioButton3){
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(MainActivity.this, R.raw.mayor_que_yo_3);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageView2);
            myImage.setImageResource(R.drawable.mayorqueyo);
        }

    }


    // Called when the user taps the Stop button
    public void mediaStop(View view) {
        if (mp.isPlaying())
            mp.pause();
    }

    // Called when the user taps the Play button
    public void mediaPlay(View view) {
        mp.start();
    }

}

