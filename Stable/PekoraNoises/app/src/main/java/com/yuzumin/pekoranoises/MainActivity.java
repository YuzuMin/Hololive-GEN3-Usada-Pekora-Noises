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
    boolean switch53;
    boolean switch54;
    boolean switch55;
    boolean switch56;
    boolean switch57;
    boolean switch58;
    boolean switch59;
    boolean switch60;
    boolean switch61;
    boolean switch62;
    boolean switch63;
    boolean switch64;
    boolean switch65;
    boolean switch66;
    boolean switch67;
    boolean switch68;
    boolean switch69;
    boolean switch70;
    boolean switch71;
    boolean switch72;
    boolean switch73;
    boolean switch74;
    boolean switch75;
    boolean switch76;
    boolean switch77;
    boolean switch78;
    boolean switch79;
    boolean switch80;
    boolean switch81;
    boolean switch82;
    boolean switch83;
    boolean switch84;
    boolean switch85;
    boolean switch86;
    boolean switch87;
    boolean switch88;
    boolean switch89;
    boolean switch90;
    boolean switch91;
    boolean switch92;
    boolean switch93;
    boolean switch94;
    boolean switch95;
    boolean switch96;
    boolean switch97;
    boolean switch98;
    boolean switch99;
    boolean switch100;
    boolean switch101;
    boolean switch102;



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
                    noise = MediaPlayer.create(this, R.raw.utonoise1);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "AAAAAAAAAAA!!", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 4:
                    noise = MediaPlayer.create(this, R.raw.utonoise2);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Oh?!", Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 5:
                    noise = MediaPlayer.create(this, R.raw.utonoise3);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Everyone my friend", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 6:
                    noise = MediaPlayer.create(this, R.raw.utonoise4);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "You are my little pogchamp", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 7:
                    noise = MediaPlayer.create(this, R.raw.utonoise5);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*blessed evil laugh*", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 8:
                    noise = MediaPlayer.create(this, R.raw.utonoise6);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "I am angry", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 9:
                    noise = MediaPlayer.create(this, R.raw.utonoise7);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Watashi Ikatteiru", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 10:
                    noise = MediaPlayer.create(this, R.raw.utonoise8);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Anata denwa yo", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 11:
                    noise = MediaPlayer.create(this, R.raw.utonoise9);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "MMMM!", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 12:
                    noise = MediaPlayer.create(this, R.raw.utonoise10);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Iyada x4", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 13:
                    noise = MediaPlayer.create(this, R.raw.utonoise11);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Tenshi Breathing", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 14:
                    noise = MediaPlayer.create(this, R.raw.utonoise12);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Yabai yabai", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 15:
                    noise = MediaPlayer.create(this, R.raw.utonoise13);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*giving headpats*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 16:
                    noise = MediaPlayer.create(this, R.raw.utonoise14);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Ollie Chan I love you!", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 17:
                    noise = MediaPlayer.create(this, R.raw.utonoise15);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Shinu", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 18:
                    noise = MediaPlayer.create(this, R.raw.utonoise16);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "10Q Arigatou", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 19:
                    noise = MediaPlayer.create(this, R.raw.utonoise17);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Nyaaa~~", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 20:
                    noise = MediaPlayer.create(this, R.raw.utonoise18);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Omedetou Hapi Basuday", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 21:
                    noise = MediaPlayer.create(this, R.raw.utonoise19);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Big yabe", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 22:
                    noise = MediaPlayer.create(this, R.raw.utonoise20);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Moe Moe Kyun", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 23:
                    noise = MediaPlayer.create(this, R.raw.utonoise21);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "NNNNNNNN!", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 24:
                    noise = MediaPlayer.create(this, R.raw.utonoise22);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Nico Nico Nii", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 25:
                    noise = MediaPlayer.create(this, R.raw.utonoise23);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Nice to Meet You", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 26:
                    noise = MediaPlayer.create(this, R.raw.utonoise24);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "NEEEEEEEEEEEE!!!", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 27:
                    noise = MediaPlayer.create(this, R.raw.utonoise25);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "omae wa mou shindeiru", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 28:
                    noise = MediaPlayer.create(this, R.raw.utonoise26);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "omae wa mou shindeiru ASMR", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 29:
                    noise = MediaPlayer.create(this, R.raw.utonoise27);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "LMAO", Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 30:
                    noise = MediaPlayer.create(this, R.raw.utonoise28);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Big Kusa", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 31:
                    noise = MediaPlayer.create(this, R.raw.utonoise29);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*tenshi giggle*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 32:
                    noise = MediaPlayer.create(this, R.raw.utonoise30);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*ABC song*", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 33:
                    noise = MediaPlayer.create(this, R.raw.utonoise31);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "HMPH", Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 34:
                    noise = MediaPlayer.create(this, R.raw.utonoise32);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Hey Moona", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 35:
                    noise = MediaPlayer.create(this, R.raw.utonoise33);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Almond Almond", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 36:
                    noise = MediaPlayer.create(this, R.raw.utonoise34);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*heavy breathing*", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 37:
                    noise = MediaPlayer.create(this, R.raw.utonoise35);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Arigato Minna", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 38:
                    noise = MediaPlayer.create(this, R.raw.utonoise36);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Everyone is my husband, Okay?", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 39:
                    noise = MediaPlayer.create(this, R.raw.utonoise37);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "BUN BUN CHA", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 40:
                    noise = MediaPlayer.create(this, R.raw.utonoise38);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Onii Chan", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 41:
                    noise = MediaPlayer.create(this, R.raw.utonoise39);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Papa", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 42:
                    noise = MediaPlayer.create(this, R.raw.utonoise40);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Ara Ara", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 43:
                    noise = MediaPlayer.create(this, R.raw.utonoise41);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Pop Pop Pop", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 44:
                    noise = MediaPlayer.create(this, R.raw.utonoise42);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Step Bro Nani o shimasu ka?", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 45:
                    noise = MediaPlayer.create(this, R.raw.utonoise43);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Yoshi Yoshi Good Boy", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 46:
                    noise = MediaPlayer.create(this, R.raw.utonoise44);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Yo Wazzup", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 47:
                    noise = MediaPlayer.create(this, R.raw.utonoise45);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "I Love Everyone", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 48:
                    noise = MediaPlayer.create(this, R.raw.utonoise46);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Bye Bye", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 49:
                    noise = MediaPlayer.create(this, R.raw.utonoise47);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "WAAAAAA!", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 50:
                    noise = MediaPlayer.create(this, R.raw.utonoise48);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Watafaq", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 51:
                    noise = MediaPlayer.create(this, R.raw.utonoise49);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Im Die Thank You 4ever", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 52:
                    noise = MediaPlayer.create(this, R.raw.utonoise50);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*tenshi noises*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 53:
                    noise = MediaPlayer.create(this, R.raw.utonoise51);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "My New PC", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 54:
                    noise = MediaPlayer.create(this, R.raw.utonoise52);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Yaaaaay", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 55:
                    noise = MediaPlayer.create(this, R.raw.utonoise53);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Sugoi Yo", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 56:
                    noise = MediaPlayer.create(this, R.raw.utonoise54);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Ureshii Nee", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 57:
                    noise = MediaPlayer.create(this, R.raw.utonoise55);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Very Strong Pc", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 58:
                    noise = MediaPlayer.create(this, R.raw.utonoise56);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Interesting", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 59:
                    noise = MediaPlayer.create(this, R.raw.utonoise57);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Pumpkin Pc", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 60:
                    noise = MediaPlayer.create(this, R.raw.utonoise58);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Eroge suki janai", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 61:
                    noise = MediaPlayer.create(this, R.raw.utonoise59);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "I am SIMP", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 62:
                    noise = MediaPlayer.create(this, R.raw.utonoise60);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*struggling noises*", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 63:
                    noise = MediaPlayer.create(this, R.raw.utonoise61);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*Pekora laugh*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 64:
                    noise = MediaPlayer.create(this, R.raw.utonoise62);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Don't cry", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 65:
                    noise = MediaPlayer.create(this, R.raw.utonoise63);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Oya Oya", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 66:
                    noise = MediaPlayer.create(this, R.raw.utonoise64);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Shuba Shuba", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 67:
                    noise = MediaPlayer.create(this, R.raw.utonoise65);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Subaru Desu", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 68:
                    noise = MediaPlayer.create(this, R.raw.utonoise66);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Haachama Chama", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 69:
                    noise = MediaPlayer.create(this, R.raw.utonoise67);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Rushia Desu", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 70:
                    noise = MediaPlayer.create(this, R.raw.utonoise68);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Holy coughs", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 71:
                    noise = MediaPlayer.create(this, R.raw.utonoise69);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "GG Men", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 72:
                    noise = MediaPlayer.create(this, R.raw.utonoise70);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Otsukaresama deshita", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 73:
                    noise = MediaPlayer.create(this, R.raw.utonoise71);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*tenshi cries*", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 74:
                    noise = MediaPlayer.create(this, R.raw.utonoise72);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Study gambare", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 75:
                    noise = MediaPlayer.create(this, R.raw.utonoise73);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Dinner,Bath or Superchat?", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 76:
                    noise = MediaPlayer.create(this, R.raw.utonoise74);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Ahoy", Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 77:
                    noise = MediaPlayer.create(this, R.raw.utonoise75);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Marine Desu", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 78:
                    noise = MediaPlayer.create(this, R.raw.utonoise76);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Minna", Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 79:
                    noise = MediaPlayer.create(this, R.raw.utonoise77);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*smug laugh*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 80:
                    noise = MediaPlayer.create(this, R.raw.utonoise78);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*satisfied noises*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 81:
                    noise = MediaPlayer.create(this, R.raw.utonoise79);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "PANIK", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 82:
                    noise = MediaPlayer.create(this, R.raw.utonoise80);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Pain", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 83:
                    noise = MediaPlayer.create(this, R.raw.utonoise81);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Onii Chan Asa Dayo", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 84:
                    noise = MediaPlayer.create(this, R.raw.utonoise82);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Oh My God!", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 85:
                    noise = MediaPlayer.create(this, R.raw.utonoise83);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Chu", Toast.LENGTH_SHORT).show();
                    }
                    anim1.start();
                    break;
                case 86:
                    noise = MediaPlayer.create(this, R.raw.utonoise84);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Nani", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 87:
                    noise = MediaPlayer.create(this, R.raw.utonoise85);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Doyukoto", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 88:
                    noise = MediaPlayer.create(this, R.raw.utonoise86);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Nande", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 89:
                    noise = MediaPlayer.create(this, R.raw.utonoise87);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Konpeko", Toast.LENGTH_SHORT).show();
                    }
                    set2.start();
                    break;
                case 90:
                    noise = MediaPlayer.create(this, R.raw.utonoise88);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "nab0i mama", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 91:
                    noise = MediaPlayer.create(this, R.raw.utonoise89);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "No Pettan", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 92:
                    noise = MediaPlayer.create(this, R.raw.utonoise90);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Normal Pettan", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 93:
                    noise = MediaPlayer.create(this, R.raw.utonoise91);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Pettan janai no desu", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 94:
                    noise = MediaPlayer.create(this, R.raw.utonoise92);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Normal Tenshi", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 95:
                    noise = MediaPlayer.create(this, R.raw.utonoise93);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "I wink everyday", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 96:
                    noise = MediaPlayer.create(this, R.raw.utonoise94);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*Uto's sister*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 97:
                    noise = MediaPlayer.create(this, R.raw.utonoise95);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Peko peko peko", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 98:
                    noise = MediaPlayer.create(this, R.raw.utonoise96);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Gambarimasu Onii Chan", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 99:
                    noise = MediaPlayer.create(this, R.raw.utonoise97);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "*confused angry noises*", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 100:
                    noise = MediaPlayer.create(this, R.raw.utonoise98);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Buruh", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 101:
                    noise = MediaPlayer.create(this, R.raw.utonoise99);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Oboeta", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
                    break;
                case 102:
                    noise = MediaPlayer.create(this, R.raw.utonoise100);
                    noise.setOnCompletionListener(listener);
                    noise.start();
                    if (switch1) {
                        Toast.makeText(this, "Poggars", Toast.LENGTH_SHORT).show();
                    }
                    set1.start();
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
        if(charavalue==0){
            image.setImageResource(R.drawable.pekora0);
        }else if (charavalue==1){
            image.setImageResource(R.drawable.pekora1);
        }else if (charavalue==2){
            image.setImageResource(R.drawable.pekora2);
        }else if (charavalue==3){
            image.setImageResource(R.drawable.pekora3);
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
        SavedSettings =getSharedPreferences("save53", MODE_PRIVATE);
        switch53= SavedSettings.getBoolean("value53",true);
        if (switch53) {
            listofsounds.add(53);
        }
        SavedSettings =getSharedPreferences("save54", MODE_PRIVATE);
        switch54= SavedSettings.getBoolean("value54",true);
        if (switch54) {
            listofsounds.add(54);
        }
        SavedSettings =getSharedPreferences("save55", MODE_PRIVATE);
        switch55= SavedSettings.getBoolean("value55",true);
        if (switch55) {
            listofsounds.add(55);
        }
        SavedSettings =getSharedPreferences("save56", MODE_PRIVATE);
        switch56= SavedSettings.getBoolean("value56",true);
        if (switch56) {
            listofsounds.add(56);
        }
        SavedSettings =getSharedPreferences("save57", MODE_PRIVATE);
        switch57= SavedSettings.getBoolean("value57",true);
        if (switch57) {
            listofsounds.add(57);
        }
        SavedSettings =getSharedPreferences("save58", MODE_PRIVATE);
        switch58= SavedSettings.getBoolean("value58",true);
        if (switch58) {
            listofsounds.add(58);
        }
        SavedSettings =getSharedPreferences("save59", MODE_PRIVATE);
        switch59= SavedSettings.getBoolean("value59",true);
        if (switch59) {
            listofsounds.add(59);
        }
        SavedSettings =getSharedPreferences("save60", MODE_PRIVATE);
        switch60= SavedSettings.getBoolean("value60",true);
        if (switch60) {
            listofsounds.add(60);
        }
        SavedSettings =getSharedPreferences("save61", MODE_PRIVATE);
        switch61= SavedSettings.getBoolean("value61",true);
        if (switch61) {
            listofsounds.add(61);
        }
        SavedSettings =getSharedPreferences("save62", MODE_PRIVATE);
        switch62= SavedSettings.getBoolean("value62",true);
        if (switch62) {
            listofsounds.add(62);
        }
        SavedSettings =getSharedPreferences("save63", MODE_PRIVATE);
        switch63= SavedSettings.getBoolean("value63",true);
        if (switch63) {
            listofsounds.add(63);
        }
        SavedSettings =getSharedPreferences("save64", MODE_PRIVATE);
        switch64= SavedSettings.getBoolean("value64",true);
        if (switch64) {
            listofsounds.add(64);
        }
        SavedSettings =getSharedPreferences("save65", MODE_PRIVATE);
        switch65= SavedSettings.getBoolean("value65",true);
        if (switch65) {
            listofsounds.add(65);
        }
        SavedSettings =getSharedPreferences("save66", MODE_PRIVATE);
        switch66= SavedSettings.getBoolean("value66",true);
        if (switch66) {
            listofsounds.add(66);
        }
        SavedSettings =getSharedPreferences("save67", MODE_PRIVATE);
        switch67= SavedSettings.getBoolean("value67",true);
        if (switch67) {
            listofsounds.add(67);
        }
        SavedSettings =getSharedPreferences("save68", MODE_PRIVATE);
        switch68= SavedSettings.getBoolean("value68",true);
        if (switch68) {
            listofsounds.add(68);
        }
        SavedSettings =getSharedPreferences("save69", MODE_PRIVATE);
        switch69= SavedSettings.getBoolean("value69",true);
        if (switch69) {
            listofsounds.add(69);
        }
        SavedSettings =getSharedPreferences("save70", MODE_PRIVATE);
        switch70= SavedSettings.getBoolean("value70",true);
        if (switch70) {
            listofsounds.add(70);
        }
        SavedSettings =getSharedPreferences("save71", MODE_PRIVATE);
        switch71= SavedSettings.getBoolean("value71",true);
        if (switch71) {
            listofsounds.add(71);
        }
        SavedSettings =getSharedPreferences("save72", MODE_PRIVATE);
        switch72= SavedSettings.getBoolean("value72",true);
        if (switch72) {
            listofsounds.add(72);
        }
        SavedSettings =getSharedPreferences("save73", MODE_PRIVATE);
        switch73= SavedSettings.getBoolean("value73",true);
        if (switch73) {
            listofsounds.add(73);
        }
        SavedSettings =getSharedPreferences("save74", MODE_PRIVATE);
        switch74= SavedSettings.getBoolean("value74",true);
        if (switch74) {
            listofsounds.add(74);
        }
        SavedSettings =getSharedPreferences("save75", MODE_PRIVATE);
        switch75= SavedSettings.getBoolean("value75",true);
        if (switch75) {
            listofsounds.add(75);
        }
        SavedSettings =getSharedPreferences("save76", MODE_PRIVATE);
        switch76= SavedSettings.getBoolean("value76",true);
        if (switch76) {
            listofsounds.add(76);
        }
        SavedSettings =getSharedPreferences("save77", MODE_PRIVATE);
        switch77= SavedSettings.getBoolean("value77",true);
        if (switch77) {
            listofsounds.add(77);
        }
        SavedSettings =getSharedPreferences("save78", MODE_PRIVATE);
        switch78= SavedSettings.getBoolean("value78",true);
        if (switch78) {
            listofsounds.add(78);
        }
        SavedSettings =getSharedPreferences("save79", MODE_PRIVATE);
        switch79= SavedSettings.getBoolean("value79",true);
        if (switch79) {
            listofsounds.add(79);
        }
        SavedSettings =getSharedPreferences("save80", MODE_PRIVATE);
        switch80= SavedSettings.getBoolean("value80",true);
        if (switch80) {
            listofsounds.add(80);
        }
        SavedSettings =getSharedPreferences("save81", MODE_PRIVATE);
        switch81= SavedSettings.getBoolean("value81",true);
        if (switch81) {
            listofsounds.add(81);
        }
        SavedSettings =getSharedPreferences("save82", MODE_PRIVATE);
        switch82= SavedSettings.getBoolean("value82",true);
        if (switch82) {
            listofsounds.add(82);
        }
        SavedSettings =getSharedPreferences("save83", MODE_PRIVATE);
        switch83= SavedSettings.getBoolean("value83",true);
        if (switch83) {
            listofsounds.add(83);
        }
        SavedSettings =getSharedPreferences("save84", MODE_PRIVATE);
        switch84= SavedSettings.getBoolean("value84",true);
        if (switch84) {
            listofsounds.add(84);
        }
        SavedSettings =getSharedPreferences("save85", MODE_PRIVATE);
        switch85= SavedSettings.getBoolean("value85",true);
        if (switch85) {
            listofsounds.add(85);
        }
        SavedSettings =getSharedPreferences("save86", MODE_PRIVATE);
        switch86= SavedSettings.getBoolean("value86",true);
        if (switch86) {
            listofsounds.add(86);
        }
        SavedSettings =getSharedPreferences("save87", MODE_PRIVATE);
        switch87= SavedSettings.getBoolean("value87",true);
        if (switch87) {
            listofsounds.add(87);
        }
        SavedSettings =getSharedPreferences("save88", MODE_PRIVATE);
        switch88= SavedSettings.getBoolean("value88",true);
        if (switch88) {
            listofsounds.add(88);
        }
        SavedSettings =getSharedPreferences("save89", MODE_PRIVATE);
        switch89= SavedSettings.getBoolean("value89",true);
        if (switch89) {
            listofsounds.add(89);
        }
        SavedSettings =getSharedPreferences("save90", MODE_PRIVATE);
        switch90= SavedSettings.getBoolean("value90",true);
        if (switch90) {
            listofsounds.add(90);
        }
        SavedSettings =getSharedPreferences("save91", MODE_PRIVATE);
        switch91= SavedSettings.getBoolean("value91",true);
        if (switch91) {
            listofsounds.add(91);
        }
        SavedSettings =getSharedPreferences("save92", MODE_PRIVATE);
        switch92= SavedSettings.getBoolean("value92",true);
        if (switch92) {
            listofsounds.add(92);
        }
        SavedSettings =getSharedPreferences("save93", MODE_PRIVATE);
        switch93= SavedSettings.getBoolean("value93",true);
        if (switch93) {
            listofsounds.add(93);
        }
        SavedSettings =getSharedPreferences("save94", MODE_PRIVATE);
        switch94= SavedSettings.getBoolean("value94",true);
        if (switch94) {
            listofsounds.add(94);
        }
        SavedSettings =getSharedPreferences("save95", MODE_PRIVATE);
        switch95= SavedSettings.getBoolean("value95",true);
        if (switch95) {
            listofsounds.add(95);
        }
        SavedSettings =getSharedPreferences("save96", MODE_PRIVATE);
        switch96= SavedSettings.getBoolean("value96",true);
        if (switch96) {
            listofsounds.add(96);
        }
        SavedSettings =getSharedPreferences("save97", MODE_PRIVATE);
        switch97= SavedSettings.getBoolean("value97",true);
        if (switch97) {
            listofsounds.add(97);
        }
        SavedSettings =getSharedPreferences("save98", MODE_PRIVATE);
        switch98= SavedSettings.getBoolean("value98",true);
        if (switch98) {
            listofsounds.add(98);
        }
        SavedSettings =getSharedPreferences("save99", MODE_PRIVATE);
        switch99= SavedSettings.getBoolean("value99",true);
        if (switch99) {
            listofsounds.add(99);
        }
        SavedSettings =getSharedPreferences("save100", MODE_PRIVATE);
        switch100= SavedSettings.getBoolean("value100",true);
        if (switch100) {
            listofsounds.add(100);
        }
        SavedSettings =getSharedPreferences("save101", MODE_PRIVATE);
        switch101= SavedSettings.getBoolean("value101",true);
        if (switch101) {
            listofsounds.add(101);
        }
        SavedSettings =getSharedPreferences("save102", MODE_PRIVATE);
        switch102= SavedSettings.getBoolean("value102",true);
        if (switch102) {
            listofsounds.add(102);
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