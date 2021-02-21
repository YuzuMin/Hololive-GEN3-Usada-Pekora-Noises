package com.yuzumin.pekoranoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ClickerSettings extends AppCompatActivity {

    ImageView back_btn;

    TableRow UtoIMGRow;
    TableRow UtoIMG1Row;
    TableRow UtoIMG2Row;

    CardView toggle_btn;

    Integer charavalue;

    RadioButton UtoIMG;
    RadioButton UtoIMG1;
    RadioButton UtoIMG2;

    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    Switch switch11;
    Switch switch12;
    Switch switch13;
    Switch switch14;
    Switch switch15;
    Switch switch16;
    Switch switch17;
    Switch switch18;
    Switch switch19;
    Switch switch20;
    Switch switch21;
    Switch switch22;
    Switch switch23;
    Switch switch24;
    Switch switch25;
    Switch switch26;
    Switch switch27;
    Switch switch28;
    Switch switch29;
    Switch switch30;
    Switch switch31;
    Switch switch32;
    Switch switch33;
    Switch switch34;
    Switch switch35;
    Switch switch36;
    Switch switch37;
    Switch switch38;
    Switch switch39;
    Switch switch40;
    Switch switch41;
    Switch switch42;
    Switch switch43;
    Switch switch44;
    Switch switch45;
    Switch switch46;
    Switch switch47;
    Switch switch48;
    Switch switch49;
    Switch switch50;
    Switch switch51;
    Switch switch52;
    Switch switch53;
    Switch switch54;
    Switch switch55;
    Switch switch56;
    Switch switch57;
    Switch switch58;
    Switch switch59;
    Switch switch60;
    Switch switch61;
    Switch switch62;
    Switch switch63;
    Switch switch64;
    Switch switch65;
    Switch switch66;
    Switch switch67;
    Switch switch68;
    Switch switch69;
    Switch switch70;
    Switch switch71;
    Switch switch72;
    Switch switch73;
    Switch switch74;
    Switch switch75;
    Switch switch76;
    Switch switch77;
    Switch switch78;
    Switch switch79;
    Switch switch80;
    Switch switch81;
    Switch switch82;
    Switch switch83;
    Switch switch84;
    Switch switch85;
    Switch switch86;
    Switch switch87;
    Switch switch88;
    Switch switch89;
    Switch switch90;
    Switch switch91;
    Switch switch92;
    Switch switch93;
    Switch switch94;
    Switch switch95;
    Switch switch96;
    Switch switch97;
    Switch switch98;
    Switch switch99;
    Switch switch100;
    Switch switch101;
    Switch switch102;


    SharedPreferences SoundSettings;
    SharedPreferences.Editor SoundSettingsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_settings);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        UtoIMG=findViewById(R.id.uto_img);
        UtoIMGRow =findViewById(R.id.uto_img_row);
        UtoIMG1 =findViewById(R.id.uto1_img);
        UtoIMG1Row =findViewById(R.id.uto1_img_row);
        UtoIMG2 =findViewById(R.id.uto2_img);
        UtoIMG2Row =findViewById(R.id.uto2_img_row);
        retrievedata();

        UtoIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG.setChecked(true);
                UtoIMG1.setChecked(false);
                UtoIMG2.setChecked(false);

            }
        });
        UtoIMGRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG.setChecked(true);
                UtoIMG1.setChecked(false);
                UtoIMG2.setChecked(false);
            }
        });
        UtoIMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG.setChecked(false);
                UtoIMG1.setChecked(true);
                UtoIMG2.setChecked(false);
            }
        });
        UtoIMG1Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG.setChecked(false);
                UtoIMG1.setChecked(true);
                UtoIMG2.setChecked(false);
            }
        });
        UtoIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG.setChecked(false);
                UtoIMG1.setChecked(false);
                UtoIMG2.setChecked(true);
            }
        });
        UtoIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG.setChecked(false);
                UtoIMG1.setChecked(false);
                UtoIMG2.setChecked(true);

            }
        });







        toggle_btn=findViewById(R.id.toggle_btn);
        toggle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()&&switch4.isChecked()){

                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",false);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",false);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",false);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",false);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",false);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",false);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",false);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",false);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",false);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",false);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",false);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",false);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",false);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",false);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",false);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",false);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",false);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",false);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",false);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",false);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",false);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",false);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",false);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",false);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",false);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",false);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",false);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",false);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",false);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",false);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",false);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",false);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",false);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",false);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",false);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",false);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",false);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",false);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",false);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",false);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",false);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",false);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",false);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",false);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",false);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value48",false);
                    SoundSettingsEditor.apply();
                    switch48.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value49",false);
                    SoundSettingsEditor.apply();
                    switch49.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value50",false);
                    SoundSettingsEditor.apply();
                    switch50.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value51",false);
                    SoundSettingsEditor.apply();
                    switch51.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value52",false);
                    SoundSettingsEditor.apply();
                    switch52.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value53",false);
                    SoundSettingsEditor.apply();
                    switch53.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value54",false);
                    SoundSettingsEditor.apply();
                    switch54.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value55",false);
                    SoundSettingsEditor.apply();
                    switch55.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value56",false);
                    SoundSettingsEditor.apply();
                    switch56.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value57",false);
                    SoundSettingsEditor.apply();
                    switch57.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value58",false);
                    SoundSettingsEditor.apply();
                    switch58.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value59",false);
                    SoundSettingsEditor.apply();
                    switch59.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value60",false);
                    SoundSettingsEditor.apply();
                    switch60.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value61",false);
                    SoundSettingsEditor.apply();
                    switch61.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value62",false);
                    SoundSettingsEditor.apply();
                    switch62.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value63",false);
                    SoundSettingsEditor.apply();
                    switch63.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value64",false);
                    SoundSettingsEditor.apply();
                    switch64.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value65",false);
                    SoundSettingsEditor.apply();
                    switch65.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value66",false);
                    SoundSettingsEditor.apply();
                    switch66.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value67",false);
                    SoundSettingsEditor.apply();
                    switch67.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value68",false);
                    SoundSettingsEditor.apply();
                    switch68.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value69",false);
                    SoundSettingsEditor.apply();
                    switch69.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value70",false);
                    SoundSettingsEditor.apply();
                    switch70.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value71",false);
                    SoundSettingsEditor.apply();
                    switch71.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value72",false);
                    SoundSettingsEditor.apply();
                    switch72.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value73",false);
                    SoundSettingsEditor.apply();
                    switch73.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value74",false);
                    SoundSettingsEditor.apply();
                    switch74.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value75",false);
                    SoundSettingsEditor.apply();
                    switch75.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value76",false);
                    SoundSettingsEditor.apply();
                    switch76.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value77",false);
                    SoundSettingsEditor.apply();
                    switch77.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value78",false);
                    SoundSettingsEditor.apply();
                    switch78.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value79",false);
                    SoundSettingsEditor.apply();
                    switch79.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value80",false);
                    SoundSettingsEditor.apply();
                    switch80.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value81",false);
                    SoundSettingsEditor.apply();
                    switch81.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value82",false);
                    SoundSettingsEditor.apply();
                    switch82.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value83",false);
                    SoundSettingsEditor.apply();
                    switch83.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value84",false);
                    SoundSettingsEditor.apply();
                    switch84.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value85",false);
                    SoundSettingsEditor.apply();
                    switch85.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value86",false);
                    SoundSettingsEditor.apply();
                    switch86.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value87",false);
                    SoundSettingsEditor.apply();
                    switch87.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value88",false);
                    SoundSettingsEditor.apply();
                    switch88.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value89",false);
                    SoundSettingsEditor.apply();
                    switch89.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value90",false);
                    SoundSettingsEditor.apply();
                    switch90.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value91",false);
                    SoundSettingsEditor.apply();
                    switch91.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value92",false);
                    SoundSettingsEditor.apply();
                    switch92.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value93",false);
                    SoundSettingsEditor.apply();
                    switch93.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value94",false);
                    SoundSettingsEditor.apply();
                    switch94.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value95",false);
                    SoundSettingsEditor.apply();
                    switch95.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value96",false);
                    SoundSettingsEditor.apply();
                    switch96.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value97",false);
                    SoundSettingsEditor.apply();
                    switch97.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value98",false);
                    SoundSettingsEditor.apply();
                    switch98.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value99",false);
                    SoundSettingsEditor.apply();
                    switch99.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value100",false);
                    SoundSettingsEditor.apply();
                    switch100.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value101",false);
                    SoundSettingsEditor.apply();
                    switch101.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value102",false);
                    SoundSettingsEditor.apply();
                    switch102.setChecked(false);


                }else{

                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",true);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",true);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",true);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",true);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",true);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",true);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",true);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",true);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",true);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",true);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",true);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",true);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",true);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",true);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",true);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",true);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",true);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",true);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",true);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",true);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",true);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",true);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",true);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",true);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",true);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",true);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",true);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",true);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",true);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",true);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",true);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",true);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",true);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",true);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",true);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",true);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",true);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",true);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",true);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",true);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",true);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",true);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",true);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",true);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",true);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value48",true);
                    SoundSettingsEditor.apply();
                    switch48.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value49",true);
                    SoundSettingsEditor.apply();
                    switch49.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value50",true);
                    SoundSettingsEditor.apply();
                    switch50.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value51",true);
                    SoundSettingsEditor.apply();
                    switch51.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value52",true);
                    SoundSettingsEditor.apply();
                    switch52.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value53",true);
                    SoundSettingsEditor.apply();
                    switch53.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value54",true);
                    SoundSettingsEditor.apply();
                    switch54.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value55",true);
                    SoundSettingsEditor.apply();
                    switch55.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value56",true);
                    SoundSettingsEditor.apply();
                    switch56.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value57",true);
                    SoundSettingsEditor.apply();
                    switch57.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value58",true);
                    SoundSettingsEditor.apply();
                    switch58.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value59",true);
                    SoundSettingsEditor.apply();
                    switch59.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value60",true);
                    SoundSettingsEditor.apply();
                    switch60.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value61",true);
                    SoundSettingsEditor.apply();
                    switch61.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value62",true);
                    SoundSettingsEditor.apply();
                    switch62.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value63",true);
                    SoundSettingsEditor.apply();
                    switch63.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value64",true);
                    SoundSettingsEditor.apply();
                    switch64.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value65",true);
                    SoundSettingsEditor.apply();
                    switch65.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value66",true);
                    SoundSettingsEditor.apply();
                    switch66.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value67",true);
                    SoundSettingsEditor.apply();
                    switch67.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value68",true);
                    SoundSettingsEditor.apply();
                    switch68.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value69",true);
                    SoundSettingsEditor.apply();
                    switch69.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value70",true);
                    SoundSettingsEditor.apply();
                    switch70.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value71",true);
                    SoundSettingsEditor.apply();
                    switch71.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value72",true);
                    SoundSettingsEditor.apply();
                    switch72.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value73",true);
                    SoundSettingsEditor.apply();
                    switch73.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value74",true);
                    SoundSettingsEditor.apply();
                    switch74.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value75",true);
                    SoundSettingsEditor.apply();
                    switch75.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value76",true);
                    SoundSettingsEditor.apply();
                    switch76.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value77",true);
                    SoundSettingsEditor.apply();
                    switch77.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value78",true);
                    SoundSettingsEditor.apply();
                    switch78.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value79",true);
                    SoundSettingsEditor.apply();
                    switch79.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value80",true);
                    SoundSettingsEditor.apply();
                    switch80.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value81",true);
                    SoundSettingsEditor.apply();
                    switch81.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value82",true);
                    SoundSettingsEditor.apply();
                    switch82.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value83",true);
                    SoundSettingsEditor.apply();
                    switch83.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value84",true);
                    SoundSettingsEditor.apply();
                    switch84.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value85",true);
                    SoundSettingsEditor.apply();
                    switch85.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value86",true);
                    SoundSettingsEditor.apply();
                    switch86.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value87",true);
                    SoundSettingsEditor.apply();
                    switch87.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value88",true);
                    SoundSettingsEditor.apply();
                    switch88.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value89",true);
                    SoundSettingsEditor.apply();
                    switch89.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value90",true);
                    SoundSettingsEditor.apply();
                    switch90.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value91",true);
                    SoundSettingsEditor.apply();
                    switch91.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value92",true);
                    SoundSettingsEditor.apply();
                    switch92.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value93",true);
                    SoundSettingsEditor.apply();
                    switch93.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value94",true);
                    SoundSettingsEditor.apply();
                    switch94.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value95",true);
                    SoundSettingsEditor.apply();
                    switch95.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value96",true);
                    SoundSettingsEditor.apply();
                    switch96.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value97",true);
                    SoundSettingsEditor.apply();
                    switch97.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value98",true);
                    SoundSettingsEditor.apply();
                    switch98.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value99",true);
                    SoundSettingsEditor.apply();
                    switch99.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value100",true);
                    SoundSettingsEditor.apply();
                    switch100.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value101",true);
                    SoundSettingsEditor.apply();
                    switch101.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value102",true);
                    SoundSettingsEditor.apply();
                    switch102.setChecked(true);

                }
            }
        });
        toggle_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    toggle_btn.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    toggle_btn.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });











        // for switch 1 to activate
        switch1=findViewById(R.id.switch1);
        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1.setChecked(SoundSettings.getBoolean("value1",true));
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",true);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",false);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(false);
                }
            }
        });

        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(SoundSettings.getBoolean("value2",true));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",true);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",false);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(false);
                }
            }
        });

        // for switch 3 to activate
        switch3=findViewById(R.id.switch3);
        SoundSettings =getSharedPreferences("save3",MODE_PRIVATE);
        switch3.setChecked(SoundSettings.getBoolean("value3",true));
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",true);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",false);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(false);
                }
            }
        });

// for switch 4 to activate
        switch4=findViewById(R.id.switch4);
        SoundSettings =getSharedPreferences("save4",MODE_PRIVATE);
        switch4.setChecked(SoundSettings.getBoolean("value4",true));
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch4.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",true);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",false);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(false);
                }
            }
        });

// for switch 5 to activate
        switch5=findViewById(R.id.switch5);
        SoundSettings =getSharedPreferences("save5",MODE_PRIVATE);
        switch5.setChecked(SoundSettings.getBoolean("value5",true));
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch5.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",true);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",false);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(false);
                }
            }
        });

// for switch 6 to activate
        switch6=findViewById(R.id.switch6);
        SoundSettings =getSharedPreferences("save6",MODE_PRIVATE);
        switch6.setChecked(SoundSettings.getBoolean("value6",true));
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch6.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",true);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",false);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(false);
                }
            }
        });

// for switch 7 to activate
        switch7=findViewById(R.id.switch7);
        SoundSettings =getSharedPreferences("save7",MODE_PRIVATE);
        switch7.setChecked(SoundSettings.getBoolean("value7",true));
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch7.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",true);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",false);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(false);
                }
            }
        });

// for switch 8 to activate
        switch8=findViewById(R.id.switch8);
        SoundSettings =getSharedPreferences("save8",MODE_PRIVATE);
        switch8.setChecked(SoundSettings.getBoolean("value8",true));
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch8.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",true);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",false);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(false);
                }
            }
        });

// for switch 9 to activate
        switch9=findViewById(R.id.switch9);
        SoundSettings =getSharedPreferences("save9",MODE_PRIVATE);
        switch9.setChecked(SoundSettings.getBoolean("value9",true));
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch9.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",true);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",false);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(false);
                }
            }
        });

// for switch 10 to activate
        switch10=findViewById(R.id.switch10);
        SoundSettings =getSharedPreferences("save10",MODE_PRIVATE);
        switch10.setChecked(SoundSettings.getBoolean("value10",true));
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch10.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",true);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",false);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(false);
                }
            }
        });

// for switch 11 to activate
        switch11=findViewById(R.id.switch11);
        SoundSettings =getSharedPreferences("save11",MODE_PRIVATE);
        switch11.setChecked(SoundSettings.getBoolean("value11",true));
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch11.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",true);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",false);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(false);
                }
            }
        });

// for switch 12 to activate
        switch12=findViewById(R.id.switch12);
        SoundSettings =getSharedPreferences("save12",MODE_PRIVATE);
        switch12.setChecked(SoundSettings.getBoolean("value12",true));
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch12.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",true);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",false);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(false);
                }
            }
        });

// for switch 13 to activate
        switch13=findViewById(R.id.switch13);
        SoundSettings =getSharedPreferences("save13",MODE_PRIVATE);
        switch13.setChecked(SoundSettings.getBoolean("value13",true));
        switch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch13.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",true);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",false);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(false);
                }
            }
        });

// for switch 14 to activate
        switch14=findViewById(R.id.switch14);
        SoundSettings =getSharedPreferences("save14",MODE_PRIVATE);
        switch14.setChecked(SoundSettings.getBoolean("value14",true));
        switch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch14.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",true);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",false);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(false);
                }
            }
        });

// for switch 15 to activate
        switch15=findViewById(R.id.switch15);
        SoundSettings =getSharedPreferences("save15",MODE_PRIVATE);
        switch15.setChecked(SoundSettings.getBoolean("value15",true));
        switch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch15.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",true);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",false);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(false);
                }
            }
        });

// for switch 16 to activate
        switch16=findViewById(R.id.switch16);
        SoundSettings =getSharedPreferences("save16",MODE_PRIVATE);
        switch16.setChecked(SoundSettings.getBoolean("value16",true));
        switch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch16.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",true);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",false);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(false);
                }
            }
        });

// for switch 17 to activate
        switch17=findViewById(R.id.switch17);
        SoundSettings =getSharedPreferences("save17",MODE_PRIVATE);
        switch17.setChecked(SoundSettings.getBoolean("value17",true));
        switch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch17.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",true);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",false);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(false);
                }
            }
        });

// for switch 18 to activate
        switch18=findViewById(R.id.switch18);
        SoundSettings =getSharedPreferences("save18",MODE_PRIVATE);
        switch18.setChecked(SoundSettings.getBoolean("value18",true));
        switch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch18.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",true);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",false);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(false);
                }
            }
        });

// for switch 19 to activate
        switch19=findViewById(R.id.switch19);
        SoundSettings =getSharedPreferences("save19",MODE_PRIVATE);
        switch19.setChecked(SoundSettings.getBoolean("value19",true));
        switch19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch19.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",true);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",false);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(false);
                }
            }
        });

// for switch 20 to activate
        switch20=findViewById(R.id.switch20);
        SoundSettings =getSharedPreferences("save20",MODE_PRIVATE);
        switch20.setChecked(SoundSettings.getBoolean("value20",true));
        switch20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch20.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",true);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",false);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(false);
                }
            }
        });

// for switch 21 to activate
        switch21=findViewById(R.id.switch21);
        SoundSettings =getSharedPreferences("save21",MODE_PRIVATE);
        switch21.setChecked(SoundSettings.getBoolean("value21",true));
        switch21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch21.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",true);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",false);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(false);
                }
            }
        });

// for switch 22 to activate
        switch22=findViewById(R.id.switch22);
        SoundSettings =getSharedPreferences("save22",MODE_PRIVATE);
        switch22.setChecked(SoundSettings.getBoolean("value22",true));
        switch22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch22.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",true);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",false);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(false);
                }
            }
        });

// for switch 23 to activate
        switch23=findViewById(R.id.switch23);
        SoundSettings =getSharedPreferences("save23",MODE_PRIVATE);
        switch23.setChecked(SoundSettings.getBoolean("value23",true));
        switch23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch23.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",true);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",false);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(false);
                }
            }
        });

// for switch 24 to activate
        switch24=findViewById(R.id.switch24);
        SoundSettings =getSharedPreferences("save24",MODE_PRIVATE);
        switch24.setChecked(SoundSettings.getBoolean("value24",true));
        switch24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch24.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",true);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",false);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(false);
                }
            }
        });

// for switch 25 to activate
        switch25=findViewById(R.id.switch25);
        SoundSettings =getSharedPreferences("save25",MODE_PRIVATE);
        switch25.setChecked(SoundSettings.getBoolean("value25",true));
        switch25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch25.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",true);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",false);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(false);
                }
            }
        });

// for switch 26 to activate
        switch26=findViewById(R.id.switch26);
        SoundSettings =getSharedPreferences("save26",MODE_PRIVATE);
        switch26.setChecked(SoundSettings.getBoolean("value26",true));
        switch26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch26.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",true);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",false);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(false);
                }
            }
        });

// for switch 27 to activate
        switch27=findViewById(R.id.switch27);
        SoundSettings =getSharedPreferences("save27",MODE_PRIVATE);
        switch27.setChecked(SoundSettings.getBoolean("value27",true));
        switch27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch27.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",true);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",false);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(false);
                }
            }
        });

// for switch 28 to activate
        switch28=findViewById(R.id.switch28);
        SoundSettings =getSharedPreferences("save28",MODE_PRIVATE);
        switch28.setChecked(SoundSettings.getBoolean("value28",true));
        switch28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch28.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",true);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",false);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(false);
                }
            }
        });

// for switch 29 to activate
        switch29=findViewById(R.id.switch29);
        SoundSettings =getSharedPreferences("save29",MODE_PRIVATE);
        switch29.setChecked(SoundSettings.getBoolean("value29",true));
        switch29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch29.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",true);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",false);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(false);
                }
            }
        });

// for switch 30 to activate
        switch30=findViewById(R.id.switch30);
        SoundSettings =getSharedPreferences("save30",MODE_PRIVATE);
        switch30.setChecked(SoundSettings.getBoolean("value30",true));
        switch30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch30.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",true);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",false);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(false);
                }
            }
        });

// for switch 31 to activate
        switch31=findViewById(R.id.switch31);
        SoundSettings =getSharedPreferences("save31",MODE_PRIVATE);
        switch31.setChecked(SoundSettings.getBoolean("value31",true));
        switch31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch31.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",true);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",false);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(false);
                }
            }
        });

// for switch 32 to activate
        switch32=findViewById(R.id.switch32);
        SoundSettings =getSharedPreferences("save32",MODE_PRIVATE);
        switch32.setChecked(SoundSettings.getBoolean("value32",true));
        switch32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch32.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",true);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",false);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(false);
                }
            }
        });

// for switch 33 to activate
        switch33=findViewById(R.id.switch33);
        SoundSettings =getSharedPreferences("save33",MODE_PRIVATE);
        switch33.setChecked(SoundSettings.getBoolean("value33",true));
        switch33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch33.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",true);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",false);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(false);
                }
            }
        });

// for switch 34 to activate
        switch34=findViewById(R.id.switch34);
        SoundSettings =getSharedPreferences("save34",MODE_PRIVATE);
        switch34.setChecked(SoundSettings.getBoolean("value34",true));
        switch34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch34.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",true);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",false);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(false);
                }
            }
        });

// for switch 35 to activate
        switch35=findViewById(R.id.switch35);
        SoundSettings =getSharedPreferences("save35",MODE_PRIVATE);
        switch35.setChecked(SoundSettings.getBoolean("value35",true));
        switch35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch35.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",true);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",false);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(false);
                }
            }
        });

// for switch 36 to activate
        switch36=findViewById(R.id.switch36);
        SoundSettings =getSharedPreferences("save36",MODE_PRIVATE);
        switch36.setChecked(SoundSettings.getBoolean("value36",true));
        switch36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch36.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",true);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",false);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(false);
                }
            }
        });

// for switch 37 to activate
        switch37=findViewById(R.id.switch37);
        SoundSettings =getSharedPreferences("save37",MODE_PRIVATE);
        switch37.setChecked(SoundSettings.getBoolean("value37",true));
        switch37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch37.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",true);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",false);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(false);
                }
            }
        });

// for switch 38 to activate
        switch38=findViewById(R.id.switch38);
        SoundSettings =getSharedPreferences("save38",MODE_PRIVATE);
        switch38.setChecked(SoundSettings.getBoolean("value38",true));
        switch38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch38.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",true);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",false);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(false);
                }
            }
        });

// for switch 39 to activate
        switch39=findViewById(R.id.switch39);
        SoundSettings =getSharedPreferences("save39",MODE_PRIVATE);
        switch39.setChecked(SoundSettings.getBoolean("value39",true));
        switch39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch39.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",true);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",false);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(false);
                }
            }
        });

// for switch 40 to activate
        switch40=findViewById(R.id.switch40);
        SoundSettings =getSharedPreferences("save40",MODE_PRIVATE);
        switch40.setChecked(SoundSettings.getBoolean("value40",true));
        switch40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch40.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",true);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",false);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(false);
                }
            }
        });

// for switch 41 to activate
        switch41=findViewById(R.id.switch41);
        SoundSettings =getSharedPreferences("save41",MODE_PRIVATE);
        switch41.setChecked(SoundSettings.getBoolean("value41",true));
        switch41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch41.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",true);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",false);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(false);
                }
            }
        });

// for switch 42 to activate
        switch42=findViewById(R.id.switch42);
        SoundSettings =getSharedPreferences("save42",MODE_PRIVATE);
        switch42.setChecked(SoundSettings.getBoolean("value42",true));
        switch42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch42.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",true);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",false);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(false);
                }
            }
        });

// for switch 43 to activate
        switch43=findViewById(R.id.switch43);
        SoundSettings =getSharedPreferences("save43",MODE_PRIVATE);
        switch43.setChecked(SoundSettings.getBoolean("value43",true));
        switch43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch43.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",true);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",false);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(false);
                }
            }
        });

// for switch 44 to activate
        switch44=findViewById(R.id.switch44);
        SoundSettings =getSharedPreferences("save44",MODE_PRIVATE);
        switch44.setChecked(SoundSettings.getBoolean("value44",true));
        switch44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch44.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",true);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",false);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(false);
                }
            }
        });

// for switch 45 to activate
        switch45=findViewById(R.id.switch45);
        SoundSettings =getSharedPreferences("save45",MODE_PRIVATE);
        switch45.setChecked(SoundSettings.getBoolean("value45",true));
        switch45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch45.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",true);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",false);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(false);
                }
            }
        });

// for switch 46 to activate
        switch46=findViewById(R.id.switch46);
        SoundSettings =getSharedPreferences("save46",MODE_PRIVATE);
        switch46.setChecked(SoundSettings.getBoolean("value46",true));
        switch46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch46.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",true);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",false);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(false);
                }
            }
        });

// for switch 47 to activate
        switch47=findViewById(R.id.switch47);
        SoundSettings =getSharedPreferences("save47",MODE_PRIVATE);
        switch47.setChecked(SoundSettings.getBoolean("value47",true));
        switch47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch47.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",true);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",false);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(false);
                }
            }
        });

// for switch 48 to activate
        switch48=findViewById(R.id.switch48);
        SoundSettings =getSharedPreferences("save48",MODE_PRIVATE);
        switch48.setChecked(SoundSettings.getBoolean("value48",true));
        switch48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch48.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value48",true);
                    SoundSettingsEditor.apply();
                    switch48.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value48",false);
                    SoundSettingsEditor.apply();
                    switch48.setChecked(false);
                }
            }
        });

// for switch 49 to activate
        switch49=findViewById(R.id.switch49);
        SoundSettings =getSharedPreferences("save49",MODE_PRIVATE);
        switch49.setChecked(SoundSettings.getBoolean("value49",true));
        switch49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch49.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value49",true);
                    SoundSettingsEditor.apply();
                    switch49.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value49",false);
                    SoundSettingsEditor.apply();
                    switch49.setChecked(false);
                }
            }
        });

// for switch 50 to activate
        switch50=findViewById(R.id.switch50);
        SoundSettings =getSharedPreferences("save50",MODE_PRIVATE);
        switch50.setChecked(SoundSettings.getBoolean("value50",true));
        switch50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch50.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value50",true);
                    SoundSettingsEditor.apply();
                    switch50.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value50",false);
                    SoundSettingsEditor.apply();
                    switch50.setChecked(false);
                }
            }
        });

// for switch 51 to activate
        switch51=findViewById(R.id.switch51);
        SoundSettings =getSharedPreferences("save51",MODE_PRIVATE);
        switch51.setChecked(SoundSettings.getBoolean("value51",true));
        switch51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch51.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value51",true);
                    SoundSettingsEditor.apply();
                    switch51.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value51",false);
                    SoundSettingsEditor.apply();
                    switch51.setChecked(false);
                }
            }
        });

// for switch 52 to activate
        switch52=findViewById(R.id.switch52);
        SoundSettings =getSharedPreferences("save52",MODE_PRIVATE);
        switch52.setChecked(SoundSettings.getBoolean("value52",true));
        switch52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch52.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value52",true);
                    SoundSettingsEditor.apply();
                    switch52.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value52",false);
                    SoundSettingsEditor.apply();
                    switch52.setChecked(false);
                }
            }
        });

// for switch 53 to activate
        switch53=findViewById(R.id.switch53);
        SoundSettings =getSharedPreferences("save53",MODE_PRIVATE);
        switch53.setChecked(SoundSettings.getBoolean("value53",true));
        switch53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch53.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value53",true);
                    SoundSettingsEditor.apply();
                    switch53.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value53",false);
                    SoundSettingsEditor.apply();
                    switch53.setChecked(false);
                }
            }
        });

// for switch 54 to activate
        switch54=findViewById(R.id.switch54);
        SoundSettings =getSharedPreferences("save54",MODE_PRIVATE);
        switch54.setChecked(SoundSettings.getBoolean("value54",true));
        switch54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch54.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value54",true);
                    SoundSettingsEditor.apply();
                    switch54.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value54",false);
                    SoundSettingsEditor.apply();
                    switch54.setChecked(false);
                }
            }
        });

// for switch 55 to activate
        switch55=findViewById(R.id.switch55);
        SoundSettings =getSharedPreferences("save55",MODE_PRIVATE);
        switch55.setChecked(SoundSettings.getBoolean("value55",true));
        switch55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch55.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value55",true);
                    SoundSettingsEditor.apply();
                    switch55.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value55",false);
                    SoundSettingsEditor.apply();
                    switch55.setChecked(false);
                }
            }
        });

// for switch 56 to activate
        switch56=findViewById(R.id.switch56);
        SoundSettings =getSharedPreferences("save56",MODE_PRIVATE);
        switch56.setChecked(SoundSettings.getBoolean("value56",true));
        switch56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch56.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value56",true);
                    SoundSettingsEditor.apply();
                    switch56.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value56",false);
                    SoundSettingsEditor.apply();
                    switch56.setChecked(false);
                }
            }
        });

// for switch 57 to activate
        switch57=findViewById(R.id.switch57);
        SoundSettings =getSharedPreferences("save57",MODE_PRIVATE);
        switch57.setChecked(SoundSettings.getBoolean("value57",true));
        switch57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch57.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value57",true);
                    SoundSettingsEditor.apply();
                    switch57.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value57",false);
                    SoundSettingsEditor.apply();
                    switch57.setChecked(false);
                }
            }
        });

// for switch 58 to activate
        switch58=findViewById(R.id.switch58);
        SoundSettings =getSharedPreferences("save58",MODE_PRIVATE);
        switch58.setChecked(SoundSettings.getBoolean("value58",true));
        switch58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch58.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value58",true);
                    SoundSettingsEditor.apply();
                    switch58.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value58",false);
                    SoundSettingsEditor.apply();
                    switch58.setChecked(false);
                }
            }
        });

// for switch 59 to activate
        switch59=findViewById(R.id.switch59);
        SoundSettings =getSharedPreferences("save59",MODE_PRIVATE);
        switch59.setChecked(SoundSettings.getBoolean("value59",true));
        switch59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch59.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value59",true);
                    SoundSettingsEditor.apply();
                    switch59.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value59",false);
                    SoundSettingsEditor.apply();
                    switch59.setChecked(false);
                }
            }
        });

// for switch 60 to activate
        switch60=findViewById(R.id.switch60);
        SoundSettings =getSharedPreferences("save60",MODE_PRIVATE);
        switch60.setChecked(SoundSettings.getBoolean("value60",true));
        switch60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch60.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value60",true);
                    SoundSettingsEditor.apply();
                    switch60.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value60",false);
                    SoundSettingsEditor.apply();
                    switch60.setChecked(false);
                }
            }
        });

// for switch 61 to activate
        switch61=findViewById(R.id.switch61);
        SoundSettings =getSharedPreferences("save61",MODE_PRIVATE);
        switch61.setChecked(SoundSettings.getBoolean("value61",true));
        switch61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch61.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value61",true);
                    SoundSettingsEditor.apply();
                    switch61.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value61",false);
                    SoundSettingsEditor.apply();
                    switch61.setChecked(false);
                }
            }
        });

// for switch 62 to activate
        switch62=findViewById(R.id.switch62);
        SoundSettings =getSharedPreferences("save62",MODE_PRIVATE);
        switch62.setChecked(SoundSettings.getBoolean("value62",true));
        switch62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch62.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value62",true);
                    SoundSettingsEditor.apply();
                    switch62.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value62",false);
                    SoundSettingsEditor.apply();
                    switch62.setChecked(false);
                }
            }
        });

// for switch 63 to activate
        switch63=findViewById(R.id.switch63);
        SoundSettings =getSharedPreferences("save63",MODE_PRIVATE);
        switch63.setChecked(SoundSettings.getBoolean("value63",true));
        switch63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch63.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value63",true);
                    SoundSettingsEditor.apply();
                    switch63.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value63",false);
                    SoundSettingsEditor.apply();
                    switch63.setChecked(false);
                }
            }
        });

// for switch 64 to activate
        switch64=findViewById(R.id.switch64);
        SoundSettings =getSharedPreferences("save64",MODE_PRIVATE);
        switch64.setChecked(SoundSettings.getBoolean("value64",true));
        switch64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch64.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value64",true);
                    SoundSettingsEditor.apply();
                    switch64.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value64",false);
                    SoundSettingsEditor.apply();
                    switch64.setChecked(false);
                }
            }
        });

// for switch 65 to activate
        switch65=findViewById(R.id.switch65);
        SoundSettings =getSharedPreferences("save65",MODE_PRIVATE);
        switch65.setChecked(SoundSettings.getBoolean("value65",true));
        switch65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch65.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value65",true);
                    SoundSettingsEditor.apply();
                    switch65.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value65",false);
                    SoundSettingsEditor.apply();
                    switch65.setChecked(false);
                }
            }
        });

// for switch 66 to activate
        switch66=findViewById(R.id.switch66);
        SoundSettings =getSharedPreferences("save66",MODE_PRIVATE);
        switch66.setChecked(SoundSettings.getBoolean("value66",true));
        switch66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch66.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value66",true);
                    SoundSettingsEditor.apply();
                    switch66.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value66",false);
                    SoundSettingsEditor.apply();
                    switch66.setChecked(false);
                }
            }
        });

// for switch 67 to activate
        switch67=findViewById(R.id.switch67);
        SoundSettings =getSharedPreferences("save67",MODE_PRIVATE);
        switch67.setChecked(SoundSettings.getBoolean("value67",true));
        switch67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch67.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value67",true);
                    SoundSettingsEditor.apply();
                    switch67.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value67",false);
                    SoundSettingsEditor.apply();
                    switch67.setChecked(false);
                }
            }
        });

// for switch 68 to activate
        switch68=findViewById(R.id.switch68);
        SoundSettings =getSharedPreferences("save68",MODE_PRIVATE);
        switch68.setChecked(SoundSettings.getBoolean("value68",true));
        switch68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch68.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value68",true);
                    SoundSettingsEditor.apply();
                    switch68.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value68",false);
                    SoundSettingsEditor.apply();
                    switch68.setChecked(false);
                }
            }
        });

// for switch 69 to activate
        switch69=findViewById(R.id.switch69);
        SoundSettings =getSharedPreferences("save69",MODE_PRIVATE);
        switch69.setChecked(SoundSettings.getBoolean("value69",true));
        switch69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch69.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value69",true);
                    SoundSettingsEditor.apply();
                    switch69.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value69",false);
                    SoundSettingsEditor.apply();
                    switch69.setChecked(false);
                }
            }
        });

// for switch 70 to activate
        switch70=findViewById(R.id.switch70);
        SoundSettings =getSharedPreferences("save70",MODE_PRIVATE);
        switch70.setChecked(SoundSettings.getBoolean("value70",true));
        switch70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch70.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value70",true);
                    SoundSettingsEditor.apply();
                    switch70.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value70",false);
                    SoundSettingsEditor.apply();
                    switch70.setChecked(false);
                }
            }
        });

// for switch 71 to activate
        switch71=findViewById(R.id.switch71);
        SoundSettings =getSharedPreferences("save71",MODE_PRIVATE);
        switch71.setChecked(SoundSettings.getBoolean("value71",true));
        switch71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch71.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value71",true);
                    SoundSettingsEditor.apply();
                    switch71.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value71",false);
                    SoundSettingsEditor.apply();
                    switch71.setChecked(false);
                }
            }
        });

// for switch 72 to activate
        switch72=findViewById(R.id.switch72);
        SoundSettings =getSharedPreferences("save72",MODE_PRIVATE);
        switch72.setChecked(SoundSettings.getBoolean("value72",true));
        switch72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch72.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value72",true);
                    SoundSettingsEditor.apply();
                    switch72.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value72",false);
                    SoundSettingsEditor.apply();
                    switch72.setChecked(false);
                }
            }
        });

// for switch 73 to activate
        switch73=findViewById(R.id.switch73);
        SoundSettings =getSharedPreferences("save73",MODE_PRIVATE);
        switch73.setChecked(SoundSettings.getBoolean("value73",true));
        switch73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch73.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value73",true);
                    SoundSettingsEditor.apply();
                    switch73.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value73",false);
                    SoundSettingsEditor.apply();
                    switch73.setChecked(false);
                }
            }
        });

// for switch 74 to activate
        switch74=findViewById(R.id.switch74);
        SoundSettings =getSharedPreferences("save74",MODE_PRIVATE);
        switch74.setChecked(SoundSettings.getBoolean("value74",true));
        switch74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch74.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value74",true);
                    SoundSettingsEditor.apply();
                    switch74.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value74",false);
                    SoundSettingsEditor.apply();
                    switch74.setChecked(false);
                }
            }
        });

// for switch 75 to activate
        switch75=findViewById(R.id.switch75);
        SoundSettings =getSharedPreferences("save75",MODE_PRIVATE);
        switch75.setChecked(SoundSettings.getBoolean("value75",true));
        switch75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch75.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value75",true);
                    SoundSettingsEditor.apply();
                    switch75.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value75",false);
                    SoundSettingsEditor.apply();
                    switch75.setChecked(false);
                }
            }
        });

// for switch 76 to activate
        switch76=findViewById(R.id.switch76);
        SoundSettings =getSharedPreferences("save76",MODE_PRIVATE);
        switch76.setChecked(SoundSettings.getBoolean("value76",true));
        switch76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch76.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value76",true);
                    SoundSettingsEditor.apply();
                    switch76.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value76",false);
                    SoundSettingsEditor.apply();
                    switch76.setChecked(false);
                }
            }
        });

// for switch 77 to activate
        switch77=findViewById(R.id.switch77);
        SoundSettings =getSharedPreferences("save77",MODE_PRIVATE);
        switch77.setChecked(SoundSettings.getBoolean("value77",true));
        switch77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch77.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value77",true);
                    SoundSettingsEditor.apply();
                    switch77.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value77",false);
                    SoundSettingsEditor.apply();
                    switch77.setChecked(false);
                }
            }
        });

// for switch 78 to activate
        switch78=findViewById(R.id.switch78);
        SoundSettings =getSharedPreferences("save78",MODE_PRIVATE);
        switch78.setChecked(SoundSettings.getBoolean("value78",true));
        switch78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch78.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value78",true);
                    SoundSettingsEditor.apply();
                    switch78.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value78",false);
                    SoundSettingsEditor.apply();
                    switch78.setChecked(false);
                }
            }
        });

// for switch 79 to activate
        switch79=findViewById(R.id.switch79);
        SoundSettings =getSharedPreferences("save79",MODE_PRIVATE);
        switch79.setChecked(SoundSettings.getBoolean("value79",true));
        switch79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch79.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value79",true);
                    SoundSettingsEditor.apply();
                    switch79.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value79",false);
                    SoundSettingsEditor.apply();
                    switch79.setChecked(false);
                }
            }
        });

// for switch 80 to activate
        switch80=findViewById(R.id.switch80);
        SoundSettings =getSharedPreferences("save80",MODE_PRIVATE);
        switch80.setChecked(SoundSettings.getBoolean("value80",true));
        switch80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch80.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value80",true);
                    SoundSettingsEditor.apply();
                    switch80.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value80",false);
                    SoundSettingsEditor.apply();
                    switch80.setChecked(false);
                }
            }
        });

// for switch 81 to activate
        switch81=findViewById(R.id.switch81);
        SoundSettings =getSharedPreferences("save81",MODE_PRIVATE);
        switch81.setChecked(SoundSettings.getBoolean("value81",true));
        switch81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch81.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value81",true);
                    SoundSettingsEditor.apply();
                    switch81.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value81",false);
                    SoundSettingsEditor.apply();
                    switch81.setChecked(false);
                }
            }
        });

// for switch 82 to activate
        switch82=findViewById(R.id.switch82);
        SoundSettings =getSharedPreferences("save82",MODE_PRIVATE);
        switch82.setChecked(SoundSettings.getBoolean("value82",true));
        switch82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch82.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value82",true);
                    SoundSettingsEditor.apply();
                    switch82.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value82",false);
                    SoundSettingsEditor.apply();
                    switch82.setChecked(false);
                }
            }
        });

// for switch 83 to activate
        switch83=findViewById(R.id.switch83);
        SoundSettings =getSharedPreferences("save83",MODE_PRIVATE);
        switch83.setChecked(SoundSettings.getBoolean("value83",true));
        switch83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch83.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value83",true);
                    SoundSettingsEditor.apply();
                    switch83.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value83",false);
                    SoundSettingsEditor.apply();
                    switch83.setChecked(false);
                }
            }
        });

// for switch 84 to activate
        switch84=findViewById(R.id.switch84);
        SoundSettings =getSharedPreferences("save84",MODE_PRIVATE);
        switch84.setChecked(SoundSettings.getBoolean("value84",true));
        switch84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch84.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value84",true);
                    SoundSettingsEditor.apply();
                    switch84.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value84",false);
                    SoundSettingsEditor.apply();
                    switch84.setChecked(false);
                }
            }
        });

// for switch 85 to activate
        switch85=findViewById(R.id.switch85);
        SoundSettings =getSharedPreferences("save85",MODE_PRIVATE);
        switch85.setChecked(SoundSettings.getBoolean("value85",true));
        switch85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch85.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value85",true);
                    SoundSettingsEditor.apply();
                    switch85.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value85",false);
                    SoundSettingsEditor.apply();
                    switch85.setChecked(false);
                }
            }
        });

// for switch 86 to activate
        switch86=findViewById(R.id.switch86);
        SoundSettings =getSharedPreferences("save86",MODE_PRIVATE);
        switch86.setChecked(SoundSettings.getBoolean("value86",true));
        switch86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch86.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value86",true);
                    SoundSettingsEditor.apply();
                    switch86.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value86",false);
                    SoundSettingsEditor.apply();
                    switch86.setChecked(false);
                }
            }
        });

// for switch 87 to activate
        switch87=findViewById(R.id.switch87);
        SoundSettings =getSharedPreferences("save87",MODE_PRIVATE);
        switch87.setChecked(SoundSettings.getBoolean("value87",true));
        switch87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch87.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value87",true);
                    SoundSettingsEditor.apply();
                    switch87.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value87",false);
                    SoundSettingsEditor.apply();
                    switch87.setChecked(false);
                }
            }
        });

// for switch 88 to activate
        switch88=findViewById(R.id.switch88);
        SoundSettings =getSharedPreferences("save88",MODE_PRIVATE);
        switch88.setChecked(SoundSettings.getBoolean("value88",true));
        switch88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch88.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value88",true);
                    SoundSettingsEditor.apply();
                    switch88.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value88",false);
                    SoundSettingsEditor.apply();
                    switch88.setChecked(false);
                }
            }
        });

// for switch 89 to activate
        switch89=findViewById(R.id.switch89);
        SoundSettings =getSharedPreferences("save89",MODE_PRIVATE);
        switch89.setChecked(SoundSettings.getBoolean("value89",true));
        switch89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch89.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value89",true);
                    SoundSettingsEditor.apply();
                    switch89.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value89",false);
                    SoundSettingsEditor.apply();
                    switch89.setChecked(false);
                }
            }
        });

// for switch 90 to activate
        switch90=findViewById(R.id.switch90);
        SoundSettings =getSharedPreferences("save90",MODE_PRIVATE);
        switch90.setChecked(SoundSettings.getBoolean("value90",true));
        switch90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch90.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value90",true);
                    SoundSettingsEditor.apply();
                    switch90.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value90",false);
                    SoundSettingsEditor.apply();
                    switch90.setChecked(false);
                }
            }
        });

// for switch 91 to activate
        switch91=findViewById(R.id.switch91);
        SoundSettings =getSharedPreferences("save91",MODE_PRIVATE);
        switch91.setChecked(SoundSettings.getBoolean("value91",true));
        switch91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch91.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value91",true);
                    SoundSettingsEditor.apply();
                    switch91.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value91",false);
                    SoundSettingsEditor.apply();
                    switch91.setChecked(false);
                }
            }
        });

// for switch 92 to activate
        switch92=findViewById(R.id.switch92);
        SoundSettings =getSharedPreferences("save92",MODE_PRIVATE);
        switch92.setChecked(SoundSettings.getBoolean("value92",true));
        switch92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch92.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value92",true);
                    SoundSettingsEditor.apply();
                    switch92.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value92",false);
                    SoundSettingsEditor.apply();
                    switch92.setChecked(false);
                }
            }
        });

// for switch 93 to activate
        switch93=findViewById(R.id.switch93);
        SoundSettings =getSharedPreferences("save93",MODE_PRIVATE);
        switch93.setChecked(SoundSettings.getBoolean("value93",true));
        switch93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch93.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value93",true);
                    SoundSettingsEditor.apply();
                    switch93.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value93",false);
                    SoundSettingsEditor.apply();
                    switch93.setChecked(false);
                }
            }
        });

// for switch 94 to activate
        switch94=findViewById(R.id.switch94);
        SoundSettings =getSharedPreferences("save94",MODE_PRIVATE);
        switch94.setChecked(SoundSettings.getBoolean("value94",true));
        switch94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch94.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value94",true);
                    SoundSettingsEditor.apply();
                    switch94.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value94",false);
                    SoundSettingsEditor.apply();
                    switch94.setChecked(false);
                }
            }
        });

// for switch 95 to activate
        switch95=findViewById(R.id.switch95);
        SoundSettings =getSharedPreferences("save95",MODE_PRIVATE);
        switch95.setChecked(SoundSettings.getBoolean("value95",true));
        switch95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch95.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value95",true);
                    SoundSettingsEditor.apply();
                    switch95.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value95",false);
                    SoundSettingsEditor.apply();
                    switch95.setChecked(false);
                }
            }
        });

// for switch 96 to activate
        switch96=findViewById(R.id.switch96);
        SoundSettings =getSharedPreferences("save96",MODE_PRIVATE);
        switch96.setChecked(SoundSettings.getBoolean("value96",true));
        switch96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch96.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value96",true);
                    SoundSettingsEditor.apply();
                    switch96.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value96",false);
                    SoundSettingsEditor.apply();
                    switch96.setChecked(false);
                }
            }
        });

        // for switch 97 to activate
        switch97=findViewById(R.id.switch97);
        SoundSettings =getSharedPreferences("save97",MODE_PRIVATE);
        switch97.setChecked(SoundSettings.getBoolean("value97",true));
        switch97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch97.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value97",true);
                    SoundSettingsEditor.apply();
                    switch97.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value97",false);
                    SoundSettingsEditor.apply();
                    switch97.setChecked(false);
                }
            }
        });

        // for switch 98 to activate
        switch98=findViewById(R.id.switch98);
        SoundSettings =getSharedPreferences("save98",MODE_PRIVATE);
        switch98.setChecked(SoundSettings.getBoolean("value98",true));
        switch98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch98.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value98",true);
                    SoundSettingsEditor.apply();
                    switch98.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value98",false);
                    SoundSettingsEditor.apply();
                    switch98.setChecked(false);
                }
            }
        });

        // for switch 99 to activate
        switch99=findViewById(R.id.switch99);
        SoundSettings =getSharedPreferences("save99",MODE_PRIVATE);
        switch99.setChecked(SoundSettings.getBoolean("value99",true));
        switch99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch99.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value99",true);
                    SoundSettingsEditor.apply();
                    switch99.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value99",false);
                    SoundSettingsEditor.apply();
                    switch99.setChecked(false);
                }
            }
        });

        // for switch 100 to activate
        switch100=findViewById(R.id.switch100);
        SoundSettings =getSharedPreferences("save100",MODE_PRIVATE);
        switch100.setChecked(SoundSettings.getBoolean("value100",true));
        switch100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch100.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value100",true);
                    SoundSettingsEditor.apply();
                    switch100.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value100",false);
                    SoundSettingsEditor.apply();
                    switch100.setChecked(false);
                }
            }
        });

        // for switch 101 to activate
        switch101=findViewById(R.id.switch101);
        SoundSettings =getSharedPreferences("save101",MODE_PRIVATE);
        switch101.setChecked(SoundSettings.getBoolean("value101",true));
        switch101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch101.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value101",true);
                    SoundSettingsEditor.apply();
                    switch101.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value101",false);
                    SoundSettingsEditor.apply();
                    switch101.setChecked(false);
                }
            }
        });

        // for switch 102 to activate
        switch102=findViewById(R.id.switch102);
        SoundSettings =getSharedPreferences("save102",MODE_PRIVATE);
        switch102.setChecked(SoundSettings.getBoolean("value102",true));
        switch102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch102.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value102",true);
                    SoundSettingsEditor.apply();
                    switch102.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value102",false);
                    SoundSettingsEditor.apply();
                    switch102.setChecked(false);
                }
            }
        });






































/*

        //Reset button
        button1=findViewById(R.id.buttonR);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To set all switches to false state and its memory to false

                SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value1",false);
                SoundSettingsEditor.apply();
                switch1.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value2",false);
                SoundSettingsEditor.apply();
                switch2.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value3",false);
                SoundSettingsEditor.apply();
                switch3.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value4",false);
                SoundSettingsEditor.apply();
                switch4.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value5",false);
                SoundSettingsEditor.apply();
                switch5.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value6",false);
                SoundSettingsEditor.apply();
                switch6.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value7",false);
                SoundSettingsEditor.apply();
                switch7.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value8",false);
                SoundSettingsEditor.apply();
                switch8.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value9",false);
                SoundSettingsEditor.apply();
                switch9.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value10",false);
                SoundSettingsEditor.apply();
                switch10.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value11",false);
                SoundSettingsEditor.apply();
                switch11.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value12",false);
                SoundSettingsEditor.apply();
                switch12.setChecked(false);
            }
        });
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button1.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    button1.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });


 */

    }

    private void retrievedata(){
        SoundSettings=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=SoundSettings.getInt("CharaValue",0);

        if(charavalue==0){
            UtoIMG.setChecked(true);
        }else if(charavalue==1){
            UtoIMG1.setChecked(true);
        }else if(charavalue==2){
            UtoIMG2.setChecked(true);
        }
    }
}