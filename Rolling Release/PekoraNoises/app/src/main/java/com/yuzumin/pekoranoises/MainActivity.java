package com.yuzumin.pekoranoises;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.yuzumin.pekoranoises.activities.AlarmActivity;

import java.util.ArrayList;
import java.util.List;

import com.yuzumin.pekoranoises.R;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;
    TextView AppName;

    ImageView MenuBTN;
    ImageView AlarmBTN;

    MediaPlayer noise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;

    SharedPreferences SavedSettings;

    boolean switch1; //IMPORTANT : TO DISABLE TOAST POPUP
    boolean switch2;
    boolean switch3;
    boolean switch4;
    boolean switch5;
    boolean switch6;
    boolean switch7;
    boolean switch8;
    boolean switch9;
    boolean switch10;
    boolean switch11;
    boolean switch12;
    boolean switch13;
    boolean switch14;
    boolean switch15;
    boolean switch16;
    boolean switch17;
    boolean switch18;
    boolean switch19;
    boolean switch20;
    boolean switch21;
    boolean switch22;
    boolean switch23;
    boolean switch24;
    boolean switch25;
    boolean switch26;
    boolean switch27;
    boolean switch28;
    boolean switch29;
    boolean switch30;
    boolean switch31;
    boolean switch32;
    boolean switch33;
    boolean switch34;
    boolean switch35;
    boolean switch36;
    boolean switch37;
    boolean switch38;
    boolean switch39;
    boolean switch40;
    boolean switch41;
    boolean switch42;
    boolean switch43;
    boolean switch44;
    boolean switch45;
    boolean switch46;
    boolean switch47;
    boolean switch48;
    boolean switch49;
    boolean switch50;
    boolean switch51;
    boolean switch52;




    List<Integer> listofsounds;
    int charavalue;

    Integer DevCount=1;
    
    Count count;
    SharedPreferences sp;

    @Override
    public void OnUpdated(int count) {
        sp.edit().putInt("count", count).apply();
        textCount.setText(String.format("Count: %d", count));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        AppName=findViewById(R.id.AppName);

        MenuBTN=findViewById(R.id.menu_btn);
        MenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, AppMenu.class);
                startActivity(intent);
            }
        });

        AlarmBTN=findViewById(R.id.alarm_btn);
        AlarmBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DevCount==7){
                    Intent intent;
                    intent = new Intent(MainActivity.this, AlarmActivity.class);
                    startActivity(intent);
                }
            }
        });


        SavedSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SavedSettings.getBoolean("value2",true);

        listener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                cleanupMediaPlayer();
            }
        };

        image = findViewById(R.id.image);
        retrievedata();
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(switch2){
                    count.increment();
                    startRandomSound();
                }
                else{
                    Toast.makeText(v.getContext(), "NOT ACTIVE", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textCount = findViewById(R.id.count);


        anim1 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, 0);
        anim1.setDuration(600);
        set1 = new AnimatorSet();
        ArrayList<Animator> setArray = new ArrayList<>();


        anim2 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, -50f, 50f, -50f, 50f,0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        anim2 = ObjectAnimator.ofFloat(image,"translationX", 0f,-70f, 70f, -70f, 70f, 0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        set1.playTogether(setArray);
        set1.setDuration(2000);
        anim2 = null;


        set2 = new AnimatorSet();
        setArray = new ArrayList<>();
        anim3 = ObjectAnimator.ofFloat(image, "rotation", 0f, -90f, 0f, 90f, 180f, 270f, 360f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleX", 1f,0.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleY", 1f,.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        set2.playTogether(setArray);
        set2.setDuration(2000);
        anim3 = null;
        count = new Count();
        count.setListener(this);

        sp = this.getSharedPreferences("count", MODE_PRIVATE);
        count.setCount(sp.getInt("count", 0));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case(R.id.Alarm):
                Intent intent;
                intent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent);
                break;
            case(R.id.menu_btn):
                Intent settingmenu;
                settingmenu = new Intent(MainActivity.this, AppMenu.class);
                startActivity(settingmenu);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void stopAnimations(){
        if (anim1.isRunning())
            anim1.end();
        if (set1.isRunning())
            set1.end();
        if (set2.isRunning())
            set2.end();
    }

    private void cleanupMediaPlayer(){
        stopAnimations();
        if(noise!=null) {
            if(noise.isPlaying())
                noise.stop();
            noise.release();
            noise = null;
        }
    }

    private void startRandomSound() {

        if(listofsounds.isEmpty()){
            cleanupMediaPlayer();
            Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();

        }else{
            int value=(int)(Math.random()*(listofsounds.size()));
            int num = listofsounds.get(value);
            cleanupMediaPlayer();


            switch (num) {
                case 3:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise1);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise1_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 4:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise2);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise2_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 5:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise3);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise3_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 6:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise4);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise4_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 7:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise5);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise5_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 8:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise6);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise6_text), Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 9:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise7);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise7_text), Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 10:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise8);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise8_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 11:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise9);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise9_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 12:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise10);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise10_text), Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 13:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise11);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise11_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 14:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise12);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise12_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 15:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise13);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise13_text), Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 16:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise14);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise14_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 17:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise15);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise15_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 18:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise16);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise16_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 19:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise17);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise17_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 20:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise18);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise18_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 21:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise19);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise19_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 22:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise20);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise20_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 23:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise21);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise21_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 24:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise22);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise22_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 25:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise23);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise23_text), Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 26:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise24);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise24_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 27:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise25);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise25_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 28:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise26);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise26_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 29:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise27);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise27_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 30:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise28);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise28_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 31:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise29);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise29_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 32:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise30);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise30_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 33:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise31);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise31_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 34:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise32);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise32_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 35:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise33);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise33_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 36:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise34);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise34_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 37:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise35);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise35_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 38:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise36);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise36_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 39:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise37);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise37_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 40:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise38);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise38_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 41:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise39);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise39_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 42:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise40);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise40_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 43:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise41);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise41_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 44:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise42);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise42_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 45:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise43);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise43_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 46:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise44);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise44_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 47:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise45);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise45_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 48:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise46);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise46_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 49:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise47);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise47_text), Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 50:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise48);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise48_text), Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 51:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise49);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise49_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 52:
                    noise = MediaPlayer.create(this, R.raw.pekoranoise50);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, getString(R.string.noise50_text), Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                default:
                    Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }


    private void retrievedata(){

        SavedSettings =getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue= SavedSettings.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                image.setImageResource(R.drawable.pekora0);
                break;
            case 1:
                image.setImageResource(R.drawable.pekora1);
                break;
            case 2:
                image.setImageResource(R.drawable.pekora2);
                break;
            default:
                image.setImageResource(R.drawable.pekora3);
                break;
        }

        SavedSettings =getSharedPreferences("DevMode",MODE_PRIVATE);
        DevCount= SavedSettings.getInt("DevCount",0);
        if(DevCount==7){
            AlarmBTN.setVisibility(View.VISIBLE);
        }else {
            AlarmBTN.setVisibility(View.INVISIBLE);
        }


        listofsounds= new ArrayList<Integer>();

        SavedSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1= SavedSettings.getBoolean("value1",true);

        SavedSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SavedSettings.getBoolean("value2",true);




        SavedSettings =getSharedPreferences("save3", MODE_PRIVATE);
        switch3= SavedSettings.getBoolean("value3",true);
        if (switch3) {
            listofsounds.add(3);
        }
        SavedSettings =getSharedPreferences("save4", MODE_PRIVATE);
        switch4= SavedSettings.getBoolean("value4",true);
        if (switch4) {
            listofsounds.add(4);
        }
        SavedSettings =getSharedPreferences("save5", MODE_PRIVATE);
        switch5= SavedSettings.getBoolean("value5",true);
        if (switch5) {
            listofsounds.add(5);
        }
        SavedSettings =getSharedPreferences("save6", MODE_PRIVATE);
        switch6= SavedSettings.getBoolean("value6",true);
        if (switch6) {
            listofsounds.add(6);
        }
        SavedSettings =getSharedPreferences("save7", MODE_PRIVATE);
        switch7= SavedSettings.getBoolean("value7",true);
        if (switch7) {
            listofsounds.add(7);
        }
        SavedSettings =getSharedPreferences("save8", MODE_PRIVATE);
        switch8= SavedSettings.getBoolean("value8",true);
        if (switch8) {
            listofsounds.add(8);
        }
        SavedSettings =getSharedPreferences("save9", MODE_PRIVATE);
        switch9= SavedSettings.getBoolean("value9",true);
        if (switch9) {
            listofsounds.add(9);
        }
        SavedSettings =getSharedPreferences("save10", MODE_PRIVATE);
        switch10= SavedSettings.getBoolean("value10",true);
        if (switch10) {
            listofsounds.add(10);
        }
        SavedSettings =getSharedPreferences("save11", MODE_PRIVATE);
        switch11= SavedSettings.getBoolean("value11",true);
        if (switch11) {
            listofsounds.add(11);
        }
        SavedSettings =getSharedPreferences("save12", MODE_PRIVATE);
        switch12= SavedSettings.getBoolean("value12",true);
        if (switch12) {
            listofsounds.add(12);
        }
        SavedSettings =getSharedPreferences("save13", MODE_PRIVATE);
        switch13= SavedSettings.getBoolean("value13",true);
        if (switch13) {
            listofsounds.add(13);
        }
        SavedSettings =getSharedPreferences("save14", MODE_PRIVATE);
        switch14= SavedSettings.getBoolean("value14",true);
        if (switch14) {
            listofsounds.add(14);
        }
        SavedSettings =getSharedPreferences("save15", MODE_PRIVATE);
        switch15= SavedSettings.getBoolean("value15",true);
        if (switch15) {
            listofsounds.add(15);
        }
        SavedSettings =getSharedPreferences("save16", MODE_PRIVATE);
        switch16= SavedSettings.getBoolean("value16",true);
        if (switch16) {
            listofsounds.add(16);
        }
        SavedSettings =getSharedPreferences("save17", MODE_PRIVATE);
        switch17= SavedSettings.getBoolean("value17",true);
        if (switch17) {
            listofsounds.add(17);
        }
        SavedSettings =getSharedPreferences("save18", MODE_PRIVATE);
        switch18= SavedSettings.getBoolean("value18",true);
        if (switch18) {
            listofsounds.add(18);
        }
        SavedSettings =getSharedPreferences("save19", MODE_PRIVATE);
        switch19= SavedSettings.getBoolean("value19",true);
        if (switch19) {
            listofsounds.add(19);
        }
        SavedSettings =getSharedPreferences("save20", MODE_PRIVATE);
        switch20= SavedSettings.getBoolean("value20",true);
        if (switch20) {
            listofsounds.add(20);
        }
        SavedSettings =getSharedPreferences("save21", MODE_PRIVATE);
        switch21= SavedSettings.getBoolean("value21",true);
        if (switch21) {
            listofsounds.add(21);
        }
        SavedSettings =getSharedPreferences("save22", MODE_PRIVATE);
        switch22= SavedSettings.getBoolean("value22",true);
        if (switch22) {
            listofsounds.add(22);
        }
        SavedSettings =getSharedPreferences("save23", MODE_PRIVATE);
        switch23= SavedSettings.getBoolean("value23",true);
        if (switch23) {
            listofsounds.add(23);
        }
        SavedSettings =getSharedPreferences("save24", MODE_PRIVATE);
        switch24= SavedSettings.getBoolean("value24",true);
        if (switch24) {
            listofsounds.add(24);
        }
        SavedSettings =getSharedPreferences("save25", MODE_PRIVATE);
        switch25= SavedSettings.getBoolean("value25",true);
        if (switch25) {
            listofsounds.add(25);
        }
        SavedSettings =getSharedPreferences("save26", MODE_PRIVATE);
        switch26= SavedSettings.getBoolean("value26",true);
        if (switch26) {
            listofsounds.add(26);
        }
        SavedSettings =getSharedPreferences("save27", MODE_PRIVATE);
        switch27= SavedSettings.getBoolean("value27",true);
        if (switch27) {
            listofsounds.add(27);
        }
        SavedSettings =getSharedPreferences("save28", MODE_PRIVATE);
        switch28= SavedSettings.getBoolean("value28",true);
        if (switch28) {
            listofsounds.add(28);
        }
        SavedSettings =getSharedPreferences("save29", MODE_PRIVATE);
        switch29= SavedSettings.getBoolean("value29",true);
        if (switch29) {
            listofsounds.add(29);
        }
        SavedSettings =getSharedPreferences("save30", MODE_PRIVATE);
        switch30= SavedSettings.getBoolean("value30",true);
        if (switch30) {
            listofsounds.add(30);
        }
        SavedSettings =getSharedPreferences("save31", MODE_PRIVATE);
        switch31= SavedSettings.getBoolean("value31",true);
        if (switch31) {
            listofsounds.add(31);
        }
        SavedSettings =getSharedPreferences("save32", MODE_PRIVATE);
        switch32= SavedSettings.getBoolean("value32",true);
        if (switch32) {
            listofsounds.add(32);
        }
        SavedSettings =getSharedPreferences("save33", MODE_PRIVATE);
        switch33= SavedSettings.getBoolean("value33",true);
        if (switch33) {
            listofsounds.add(33);
        }
        SavedSettings =getSharedPreferences("save34", MODE_PRIVATE);
        switch34= SavedSettings.getBoolean("value34",true);
        if (switch34) {
            listofsounds.add(34);
        }
        SavedSettings =getSharedPreferences("save35", MODE_PRIVATE);
        switch35= SavedSettings.getBoolean("value35",true);
        if (switch35) {
            listofsounds.add(35);
        }
        SavedSettings =getSharedPreferences("save36", MODE_PRIVATE);
        switch36= SavedSettings.getBoolean("value36",true);
        if (switch36) {
            listofsounds.add(36);
        }
        SavedSettings =getSharedPreferences("save37", MODE_PRIVATE);
        switch37= SavedSettings.getBoolean("value37",true);
        if (switch37) {
            listofsounds.add(37);
        }
        SavedSettings =getSharedPreferences("save38", MODE_PRIVATE);
        switch38= SavedSettings.getBoolean("value38",true);
        if (switch38) {
            listofsounds.add(38);
        }
        SavedSettings =getSharedPreferences("save39", MODE_PRIVATE);
        switch39= SavedSettings.getBoolean("value39",true);
        if (switch39) {
            listofsounds.add(39);
        }
        SavedSettings =getSharedPreferences("save40", MODE_PRIVATE);
        switch40= SavedSettings.getBoolean("value40",true);
        if (switch40) {
            listofsounds.add(40);
        }
        SavedSettings =getSharedPreferences("save41", MODE_PRIVATE);
        switch41= SavedSettings.getBoolean("value41",true);
        if (switch41) {
            listofsounds.add(41);
        }
        SavedSettings =getSharedPreferences("save42", MODE_PRIVATE);
        switch42= SavedSettings.getBoolean("value42",true);
        if (switch42) {
            listofsounds.add(42);
        }
        SavedSettings =getSharedPreferences("save43", MODE_PRIVATE);
        switch43= SavedSettings.getBoolean("value43",true);
        if (switch43) {
            listofsounds.add(43);
        }
        SavedSettings =getSharedPreferences("save44", MODE_PRIVATE);
        switch44= SavedSettings.getBoolean("value44",true);
        if (switch44) {
            listofsounds.add(44);
        }
        SavedSettings =getSharedPreferences("save45", MODE_PRIVATE);
        switch45= SavedSettings.getBoolean("value45",true);
        if (switch45) {
            listofsounds.add(45);
        }
        SavedSettings =getSharedPreferences("save46", MODE_PRIVATE);
        switch46= SavedSettings.getBoolean("value46",true);
        if (switch46) {
            listofsounds.add(46);
        }
        SavedSettings =getSharedPreferences("save47", MODE_PRIVATE);
        switch47= SavedSettings.getBoolean("value47",true);
        if (switch47) {
            listofsounds.add(47);
        }
        SavedSettings =getSharedPreferences("save48", MODE_PRIVATE);
        switch48= SavedSettings.getBoolean("value48",true);
        if (switch48) {
            listofsounds.add(48);
        }
        SavedSettings =getSharedPreferences("save49", MODE_PRIVATE);
        switch49= SavedSettings.getBoolean("value49",true);
        if (switch49) {
            listofsounds.add(49);
        }
        SavedSettings =getSharedPreferences("save50", MODE_PRIVATE);
        switch50= SavedSettings.getBoolean("value50",true);
        if (switch50) {
            listofsounds.add(50);
        }
        SavedSettings =getSharedPreferences("save51", MODE_PRIVATE);
        switch51= SavedSettings.getBoolean("value51",true);
        if (switch51) {
            listofsounds.add(51);
        }
        SavedSettings =getSharedPreferences("save52", MODE_PRIVATE);
        switch52= SavedSettings.getBoolean("value52",true);
        if (switch52) {
            listofsounds.add(52);
        }

    }

    @Override
    protected void onDestroy() {
        cleanupMediaPlayer();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        cleanupMediaPlayer();
        super.onStop();
    }

    @Override
    protected void onResume() {
        retrievedata();
        super.onResume();
    }

}