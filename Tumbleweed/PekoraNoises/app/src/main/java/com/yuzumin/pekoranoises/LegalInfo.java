package com.yuzumin.pekoranoises;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LegalInfo extends AppCompatActivity {


    ImageView back_btn;
    LinearLayout InstructionManual;
    LinearLayout AppLicense;
    LinearLayout ReleaseNotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_info);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        //Press to open Reader activity to read stuff
        InstructionManual =findViewById(R.id.instruction_manual);
        InstructionManual.setOnClickListener(click_IM);
        InstructionManual.setOnTouchListener(touch_IM);

        AppLicense =findViewById(R.id.app_license);
        AppLicense.setOnClickListener(click_LC);
        AppLicense.setOnTouchListener(touch_LC);

        ReleaseNotes=findViewById(R.id.release_notes);
        ReleaseNotes.setOnClickListener(click_RN);
        ReleaseNotes.setOnTouchListener(touch_RN);

    }

    private final View.OnClickListener click_IM =new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",0); //sends a 1 to reader activity to show user agreement
            startActivity(intent);
        }
    };
    private final View.OnTouchListener touch_IM = new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                InstructionManual.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                InstructionManual.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };


    private final View.OnClickListener click_LC=new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",1); //sends a 3 to reader activity to show click license
            startActivity(intent);
        }
    };
    private final View.OnTouchListener touch_LC= new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                AppLicense.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                AppLicense.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };


    private final View.OnClickListener click_RN=new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",2); //sends a 3 to reader activity to show click license
            startActivity(intent);
        }
    };
    private final View.OnTouchListener touch_RN= new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                ReleaseNotes.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                ReleaseNotes.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };

}