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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.yuzumin.pekoranoises.activities.AlarmActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;

    ImageView MenuBTN;
    ImageView AlarmBTN;

    MediaPlayer noise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;

    SharedPreferences SavedSettings;

    boolean switch0; //IMPORTANT : For Bottom Bar
    boolean switch1; //IMPORTANT : TO DISABLE TOAST POPUP
    boolean switch2; //TO DISABLE CLICKER

    LinearLayout ButtonBar;

    CardView SoundBTN1;
    CardView SoundBTN2;
    CardView SoundBTN3;
    CardView SoundBTN4;
    CardView SoundBTN5;
    CardView SoundBTN6;
    CardView SoundBTN7;
    CardView SoundBTN8;
    CardView SoundBTN9;
    CardView SoundBTN10;
    CardView SoundBTN11;
    CardView SoundBTN12;
    CardView SoundBTN13;
    CardView SoundBTN14;
    CardView SoundBTN15;
    CardView SoundBTN16;
    CardView SoundBTN17;
    CardView SoundBTN18;
    CardView SoundBTN19;
    CardView SoundBTN20;
    CardView SoundBTN21;
    CardView SoundBTN22;
    CardView SoundBTN23;
    CardView SoundBTN24;
    CardView SoundBTN25;
    CardView SoundBTN26;
    CardView SoundBTN27;
    CardView SoundBTN28;
    CardView SoundBTN29;
    CardView SoundBTN30;
    CardView SoundBTN31;
    CardView SoundBTN32;
    CardView SoundBTN33;
    CardView SoundBTN34;
    CardView SoundBTN35;
    CardView SoundBTN36;
    CardView SoundBTN37;
    CardView SoundBTN38;
    CardView SoundBTN39;
    CardView SoundBTN40;
    CardView SoundBTN41;
    CardView SoundBTN42;
    CardView SoundBTN43;
    CardView SoundBTN44;
    CardView SoundBTN45;
    CardView SoundBTN46;
    CardView SoundBTN47;
    CardView SoundBTN48;
    CardView SoundBTN49;
    CardView SoundBTN50;

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

        // TO OPEN APP MENU
        MenuBTN=findViewById(R.id.menu_btn);
        MenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, AppMenu.class);
                startActivity(intent);
            }
        });

        // TO OPEN ALARM LIST ACTIVITY
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


        listener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                cleanupMediaPlayer();
            }
        };
        image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2){
                    count.increment();
                    startRandomSound();
                }else{
                    Toast.makeText(v.getContext(), "NOT ACTIVE", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ButtonBar=findViewById(R.id.buttonBar);
        ButtonBar.setVisibility(View.GONE);

        SoundBTN1=findViewById(R.id.sound1);
        SoundBTN1.setVisibility(View.GONE);
        SoundBTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(3);
            }
        });

        SoundBTN2=findViewById(R.id.sound2);
        SoundBTN2.setVisibility(View.GONE);
        SoundBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(4);
            }
        });

        SoundBTN3=findViewById(R.id.sound3);
        SoundBTN3.setVisibility(View.GONE);
        SoundBTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(5);
            }
        });

        SoundBTN4=findViewById(R.id.sound4);
        SoundBTN4.setVisibility(View.GONE);
        SoundBTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(6);
            }
        });

        SoundBTN5=findViewById(R.id.sound5);
        SoundBTN5.setVisibility(View.GONE);
        SoundBTN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(7);
            }
        });

        SoundBTN6=findViewById(R.id.sound6);
        SoundBTN6.setVisibility(View.GONE);
        SoundBTN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(8);
            }
        });

        SoundBTN7=findViewById(R.id.sound7);
        SoundBTN7.setVisibility(View.GONE);
        SoundBTN7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(9);
            }
        });

        SoundBTN8=findViewById(R.id.sound8);
        SoundBTN8.setVisibility(View.GONE);
        SoundBTN8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(10);
            }
        });

        SoundBTN9=findViewById(R.id.sound9);
        SoundBTN9.setVisibility(View.GONE);
        SoundBTN9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(11);
            }
        });

        SoundBTN10=findViewById(R.id.sound10);
        SoundBTN10.setVisibility(View.GONE);
        SoundBTN10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(12);
            }
        });

        SoundBTN11=findViewById(R.id.sound11);
        SoundBTN11.setVisibility(View.GONE);
        SoundBTN11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(13);
            }
        });

        SoundBTN12=findViewById(R.id.sound12);
        SoundBTN12.setVisibility(View.GONE);
        SoundBTN12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(14);
            }
        });

        SoundBTN13=findViewById(R.id.sound13);
        SoundBTN13.setVisibility(View.GONE);
        SoundBTN13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(15);
            }
        });

        SoundBTN14=findViewById(R.id.sound14);
        SoundBTN14.setVisibility(View.GONE);
        SoundBTN14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(16);
            }
        });

        SoundBTN15=findViewById(R.id.sound15);
        SoundBTN15.setVisibility(View.GONE);
        SoundBTN15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(17);
            }
        });

        SoundBTN16=findViewById(R.id.sound16);
        SoundBTN16.setVisibility(View.GONE);
        SoundBTN16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(18);
            }
        });

        SoundBTN17=findViewById(R.id.sound17);
        SoundBTN17.setVisibility(View.GONE);
        SoundBTN17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(19);
            }
        });

        SoundBTN18=findViewById(R.id.sound18);
        SoundBTN18.setVisibility(View.GONE);
        SoundBTN18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(20);
            }
        });

        SoundBTN19=findViewById(R.id.sound19);
        SoundBTN19.setVisibility(View.GONE);
        SoundBTN19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(21);
            }
        });

        SoundBTN20=findViewById(R.id.sound20);
        SoundBTN20.setVisibility(View.GONE);
        SoundBTN20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(22);
            }
        });

        SoundBTN21=findViewById(R.id.sound21);
        SoundBTN21.setVisibility(View.GONE);
        SoundBTN21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(23);
            }
        });

        SoundBTN22=findViewById(R.id.sound22);
        SoundBTN22.setVisibility(View.GONE);
        SoundBTN22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(24);
            }
        });

        SoundBTN23=findViewById(R.id.sound23);
        SoundBTN23.setVisibility(View.GONE);
        SoundBTN23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(25);
            }
        });

        SoundBTN24=findViewById(R.id.sound24);
        SoundBTN24.setVisibility(View.GONE);
        SoundBTN24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(26);
            }
        });

        SoundBTN25=findViewById(R.id.sound25);
        SoundBTN25.setVisibility(View.GONE);
        SoundBTN25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(27);
            }
        });

        SoundBTN26=findViewById(R.id.sound26);
        SoundBTN26.setVisibility(View.GONE);
        SoundBTN26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(28);
            }
        });

        SoundBTN27=findViewById(R.id.sound27);
        SoundBTN27.setVisibility(View.GONE);
        SoundBTN27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(29);
            }
        });

        SoundBTN28=findViewById(R.id.sound28);
        SoundBTN28.setVisibility(View.GONE);
        SoundBTN28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(30);
            }
        });

        SoundBTN29=findViewById(R.id.sound29);
        SoundBTN29.setVisibility(View.GONE);
        SoundBTN29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(31);
            }
        });

        SoundBTN30=findViewById(R.id.sound30);
        SoundBTN30.setVisibility(View.GONE);
        SoundBTN30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(32);
            }
        });

        SoundBTN31=findViewById(R.id.sound31);
        SoundBTN31.setVisibility(View.GONE);
        SoundBTN31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(33);
            }
        });

        SoundBTN32=findViewById(R.id.sound32);
        SoundBTN32.setVisibility(View.GONE);
        SoundBTN32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(34);
            }
        });

        SoundBTN33=findViewById(R.id.sound33);
        SoundBTN33.setVisibility(View.GONE);
        SoundBTN33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(35);
            }
        });

        SoundBTN34=findViewById(R.id.sound34);
        SoundBTN34.setVisibility(View.GONE);
        SoundBTN34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(36);
            }
        });

        SoundBTN35=findViewById(R.id.sound35);
        SoundBTN35.setVisibility(View.GONE);
        SoundBTN35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(37);
            }
        });

        SoundBTN36=findViewById(R.id.sound36);
        SoundBTN36.setVisibility(View.GONE);
        SoundBTN36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(38);
            }
        });

        SoundBTN37=findViewById(R.id.sound37);
        SoundBTN37.setVisibility(View.GONE);
        SoundBTN37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(39);
            }
        });

        SoundBTN38=findViewById(R.id.sound38);
        SoundBTN38.setVisibility(View.GONE);
        SoundBTN38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(40);
            }
        });

        SoundBTN39=findViewById(R.id.sound39);
        SoundBTN39.setVisibility(View.GONE);
        SoundBTN39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(41);
            }
        });

        SoundBTN40=findViewById(R.id.sound40);
        SoundBTN40.setVisibility(View.GONE);
        SoundBTN40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(42);
            }
        });

        SoundBTN41=findViewById(R.id.sound41);
        SoundBTN41.setVisibility(View.GONE);
        SoundBTN41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(43);
            }
        });

        SoundBTN42=findViewById(R.id.sound42);
        SoundBTN42.setVisibility(View.GONE);
        SoundBTN42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(44);
            }
        });

        SoundBTN43=findViewById(R.id.sound43);
        SoundBTN43.setVisibility(View.GONE);
        SoundBTN43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(45);
            }
        });

        SoundBTN44=findViewById(R.id.sound44);
        SoundBTN44.setVisibility(View.GONE);
        SoundBTN44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(46);
            }
        });

        SoundBTN45=findViewById(R.id.sound45);
        SoundBTN45.setVisibility(View.GONE);
        SoundBTN45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(47);
            }
        });

        SoundBTN46=findViewById(R.id.sound46);
        SoundBTN46.setVisibility(View.GONE);
        SoundBTN46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(48);
            }
        });

        SoundBTN47=findViewById(R.id.sound47);
        SoundBTN47.setVisibility(View.GONE);
        SoundBTN47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(49);
            }
        });

        SoundBTN48=findViewById(R.id.sound48);
        SoundBTN48.setVisibility(View.GONE);
        SoundBTN48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(50);
            }
        });

        SoundBTN49=findViewById(R.id.sound49);
        SoundBTN49.setVisibility(View.GONE);
        SoundBTN49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(51);
            }
        });

        SoundBTN50=findViewById(R.id.sound50);
        SoundBTN50.setVisibility(View.GONE);
        SoundBTN50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(52);
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
        retrievedata();
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
            Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();

        }else{
            int value=(int)(Math.random()*(listofsounds.size()));
            int num = listofsounds.get(value);
            playSound(num);
        }
    }

    private void playSound(int num){
        cleanupMediaPlayer();
        if(switch2){
            count.increment();
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
        }else{
            Toast.makeText(MainActivity.this, "NOT ACTIVE", Toast.LENGTH_SHORT).show();
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

        SavedSettings =getSharedPreferences("save0",MODE_PRIVATE);
        switch0= SavedSettings.getBoolean("value0",false);
        if (SavedSettings.getBoolean("value0",false)) {
            ButtonBar.setVisibility(View.VISIBLE);
        }else{
            ButtonBar.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1= SavedSettings.getBoolean("value1",true);

        SavedSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SavedSettings.getBoolean("value2",true);




        SavedSettings =getSharedPreferences("save3", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value3",true)) {
            listofsounds.add(3);
            SoundBTN1.setVisibility(View.VISIBLE);
        }else{
            SoundBTN1.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save4", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value4",true)) {
            listofsounds.add(4);
            SoundBTN2.setVisibility(View.VISIBLE);
        }else{
            SoundBTN2.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save5", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value5",true)) {
            listofsounds.add(5);
            SoundBTN3.setVisibility(View.VISIBLE);
        }else{
            SoundBTN3.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save6", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value6",true)) {
            listofsounds.add(6);
            SoundBTN4.setVisibility(View.VISIBLE);
        }else{
            SoundBTN4.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save7", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value7",true)) {
            listofsounds.add(7);
            SoundBTN5.setVisibility(View.VISIBLE);
        }else{
            SoundBTN5.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save8", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value8",true)) {
            listofsounds.add(8);
            SoundBTN6.setVisibility(View.VISIBLE);
        }else{
            SoundBTN6.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save9", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value9",true)) {
            listofsounds.add(9);
            SoundBTN7.setVisibility(View.VISIBLE);
        }else{
            SoundBTN7.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save10", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value10",true)) {
            listofsounds.add(10);
            SoundBTN8.setVisibility(View.VISIBLE);
        }else{
            SoundBTN8.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save11", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value11",true)) {
            listofsounds.add(11);
            SoundBTN9.setVisibility(View.VISIBLE);
        }else{
            SoundBTN9.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save12", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value12",true)) {
            listofsounds.add(12);
            SoundBTN10.setVisibility(View.VISIBLE);
        }else{
            SoundBTN10.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save13", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value13",true)) {
            listofsounds.add(13);
            SoundBTN11.setVisibility(View.VISIBLE);
        }else{
            SoundBTN11.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save14", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value14",true)) {
            listofsounds.add(14);
            SoundBTN12.setVisibility(View.VISIBLE);
        }else{
            SoundBTN12.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save15", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value15",true)) {
            listofsounds.add(15);
            SoundBTN13.setVisibility(View.VISIBLE);
        }else{
            SoundBTN13.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save16", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value16",true)) {
            listofsounds.add(16);
            SoundBTN14.setVisibility(View.VISIBLE);
        }else{
            SoundBTN14.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save17", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value17",true)) {
            listofsounds.add(17);
            SoundBTN15.setVisibility(View.VISIBLE);
        }else{
            SoundBTN15.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save18", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value18",true)) {
            listofsounds.add(18);
            SoundBTN16.setVisibility(View.VISIBLE);
        }else{
            SoundBTN16.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save19", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value19",true)) {
            listofsounds.add(19);
            SoundBTN17.setVisibility(View.VISIBLE);
        }else{
            SoundBTN17.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save20", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value20",true)) {
            listofsounds.add(20);
            SoundBTN18.setVisibility(View.VISIBLE);
        }else{
            SoundBTN18.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save21", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value21",true)) {
            listofsounds.add(21);
            SoundBTN19.setVisibility(View.VISIBLE);
        }else{
            SoundBTN19.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save22", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value22",true)) {
            listofsounds.add(22);
            SoundBTN20.setVisibility(View.VISIBLE);
        }else{
            SoundBTN20.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save23", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value23",true)) {
            listofsounds.add(23);
            SoundBTN21.setVisibility(View.VISIBLE);
        }else{
            SoundBTN21.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save24", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value24",true)) {
            listofsounds.add(24);
            SoundBTN22.setVisibility(View.VISIBLE);
        }else{
            SoundBTN22.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save25", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value25",true)) {
            listofsounds.add(25);
            SoundBTN23.setVisibility(View.VISIBLE);
        }else{
            SoundBTN23.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save26", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value26",true)) {
            listofsounds.add(26);
            SoundBTN24.setVisibility(View.VISIBLE);
        }else{
            SoundBTN24.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save27", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value27",true)) {
            listofsounds.add(27);
            SoundBTN25.setVisibility(View.VISIBLE);
        }else{
            SoundBTN25.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save28", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value28",true)) {
            listofsounds.add(28);
            SoundBTN26.setVisibility(View.VISIBLE);
        }else{
            SoundBTN26.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save29", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value29",true)) {
            listofsounds.add(29);
            SoundBTN27.setVisibility(View.VISIBLE);
        }else{
            SoundBTN27.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save30", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value30",true)) {
            listofsounds.add(30);
            SoundBTN28.setVisibility(View.VISIBLE);
        }else{
            SoundBTN28.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save31", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value31",true)) {
            listofsounds.add(31);
            SoundBTN29.setVisibility(View.VISIBLE);
        }else{
            SoundBTN29.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save32", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value32",true)) {
            listofsounds.add(32);
            SoundBTN30.setVisibility(View.VISIBLE);
        }else{
            SoundBTN30.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save33", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value33",true)) {
            listofsounds.add(33);
            SoundBTN31.setVisibility(View.VISIBLE);
        }else{
            SoundBTN31.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save34", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value34",true)) {
            listofsounds.add(34);
            SoundBTN32.setVisibility(View.VISIBLE);
        }else{
            SoundBTN32.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save35", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value35",true)) {
            listofsounds.add(35);
            SoundBTN33.setVisibility(View.VISIBLE);
        }else{
            SoundBTN33.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save36", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value36",true)) {
            listofsounds.add(36);
            SoundBTN34.setVisibility(View.VISIBLE);
        }else{
            SoundBTN34.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save37", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value37",true)) {
            listofsounds.add(37);
            SoundBTN35.setVisibility(View.VISIBLE);
        }else{
            SoundBTN35.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save38", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value38",true)) {
            listofsounds.add(38);
            SoundBTN36.setVisibility(View.VISIBLE);
        }else{
            SoundBTN36.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save39", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value39",true)) {
            listofsounds.add(39);
            SoundBTN37.setVisibility(View.VISIBLE);
        }else{
            SoundBTN37.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save40", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value40",true)) {
            listofsounds.add(40);
            SoundBTN38.setVisibility(View.VISIBLE);
        }else{
            SoundBTN38.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save41", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value41",true)) {
            listofsounds.add(41);
            SoundBTN39.setVisibility(View.VISIBLE);
        }else{
            SoundBTN39.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save42", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value42",true)) {
            listofsounds.add(42);
            SoundBTN40.setVisibility(View.VISIBLE);
        }else{
            SoundBTN40.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save43", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value43",true)) {
            listofsounds.add(43);
            SoundBTN41.setVisibility(View.VISIBLE);
        }else{
            SoundBTN41.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save44", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value44",true)) {
            listofsounds.add(44);
            SoundBTN42.setVisibility(View.VISIBLE);
        }else{
            SoundBTN42.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save45", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value45",true)) {
            listofsounds.add(45);
            SoundBTN43.setVisibility(View.VISIBLE);
        }else{
            SoundBTN43.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save46", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value46",true)) {
            listofsounds.add(46);
            SoundBTN44.setVisibility(View.VISIBLE);
        }else{
            SoundBTN44.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save47", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value47",true)) {
            listofsounds.add(47);
            SoundBTN45.setVisibility(View.VISIBLE);
        }else{
            SoundBTN45.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save48", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value48",true)) {
            listofsounds.add(48);
            SoundBTN46.setVisibility(View.VISIBLE);
        }else{
            SoundBTN46.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save49", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value49",true)) {
            listofsounds.add(49);
            SoundBTN47.setVisibility(View.VISIBLE);
        }else{
            SoundBTN47.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save50", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value50",true)) {
            listofsounds.add(50);
            SoundBTN48.setVisibility(View.VISIBLE);
        }else{
            SoundBTN48.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save51", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value51",true)) {
            listofsounds.add(51);
            SoundBTN49.setVisibility(View.VISIBLE);
        }else{
            SoundBTN49.setVisibility(View.GONE);
        }

        SavedSettings =getSharedPreferences("save52", MODE_PRIVATE);
        if (SavedSettings.getBoolean("value52",true)) {
            listofsounds.add(52);
            SoundBTN50.setVisibility(View.VISIBLE);
        }else{
            SoundBTN50.setVisibility(View.GONE);
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