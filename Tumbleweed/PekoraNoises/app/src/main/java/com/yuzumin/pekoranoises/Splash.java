package com.yuzumin.pekoranoises;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Splash extends AppCompatActivity {

    boolean isLaunched;
    ConstraintLayout Layout;
    VideoView Splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Layout=findViewById(R.id.layout);
        Splash=findViewById(R.id.SplashVideo);
        isLaunched=false;


        Uri video= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.splashscreen);
        Splash.setVideoURI(video);

        Splash.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(!isLaunched){
                    isLaunched=true;
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
            }
        });

        Layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(!isLaunched){
                    isLaunched=true;
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
                return false;
            }
        });


        Splash.start();

    }
}