package com.example.crawforl20.carstereo;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View.OnTouchListener;


import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private Button PowerButton;
    private TextView Tuner_Txt;
    private TextView Current_Station;
    private Button preset1;
    private Button preset2;
    private Button preset3;
    private Button preset4;
    private Button preset5;
    private Button preset6;
    private Button am;
    private Button fm;
    private boolean tog;
    private TextView amfm_indicator;
//    private SeekBar seekBar;

    private int radiostatus;
    private int currentAMStation;
    private double currentFMStation;
    private Button seek_down;
    private Button seek_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PowerButton = (Button)findViewById(R.id.PowerButton);
        Tuner_Txt = (TextView)findViewById(R.id.Tuner_txt);
        preset1 = (Button)findViewById(R.id.Preset_1);
        preset2 = (Button)findViewById(R.id.Preset_2);
        preset3 = (Button)findViewById(R.id.Preset_3);
        preset4 = (Button)findViewById(R.id.Preset_4);
        preset5 = (Button)findViewById(R.id.Preset_5);
        preset6 = (Button)findViewById(R.id.Preset_6);
        am = (Button)findViewById(R.id.AM);
        fm = (Button)findViewById(R.id.FM);
        amfm_indicator = (TextView)findViewById(R.id.amfm_indicator);
        Current_Station = (TextView)findViewById(R.id.Current_Station);
        seek_down = (Button)findViewById(R.id.seek_down);
        seek_up = (Button)findViewById(R.id.seek_up);
        /*seekBar = (SeekBar)findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            private int seekBarStatus;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekBarStatus = i;
                if(radiostatus ==0){

                    seekBarStatus += 530;

                    Current_Station.setText(""+seekBarStatus +" kHz");
                }
                else{
                    Current_Station.setText(""+seekBarStatus);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        }
        );*/
        radiostatus = 0;
        currentAMStation = 530;
        currentFMStation = 88.1;
        preset1.setBackgroundColor(Color.argb(100,26,10,255));
        preset2.setBackgroundColor(Color.argb(100,26,10,255));
        preset3.setBackgroundColor(Color.argb(100,26,10,255));
        preset4.setBackgroundColor(Color.argb(100,26,10,255));
        preset5.setBackgroundColor(Color.argb(100,26,10,255));
        preset6.setBackgroundColor(Color.argb(100,26,10,255));
        Current_Station.setBackgroundColor(Color.argb(100,26,10,255));
        Current_Station.setText("");
        amfm_indicator.setText("");
        am.setBackgroundColor(Color.argb(100,26,10,255));
        fm.setBackgroundColor(Color.argb(100,26,10,255));
        tog = true;
        seek_down.setBackgroundColor(Color.argb(100,26,10,255));
        seek_up.setBackgroundColor(Color.argb(100,26,10,255));

    }


    public void PowerOn(View v) {
        if(tog==true)
        {
            //on
            preset1.setBackgroundColor(Color.rgb(0,171,255));
            preset2.setBackgroundColor(Color.rgb(0,171,255));
            preset3.setBackgroundColor(Color.rgb(0,171,255));
            preset4.setBackgroundColor(Color.rgb(0,171,255));
            preset5.setBackgroundColor(Color.rgb(0,171,255));
            preset6.setBackgroundColor(Color.rgb(0,171,255));

            am.setBackgroundColor(Color.rgb(0,171,255));
            fm.setBackgroundColor(Color.rgb(0,171,255));
            tog = false;
            Current_Station.setBackgroundColor(Color.rgb(0,171,255));
            Current_Station.setText(""+currentAMStation + " kHz");
            seek_down.setBackgroundColor(Color.rgb(0,171,255));
            seek_up.setBackgroundColor(Color.rgb(0,171,255));
            amfm_indicator.setText("AM");
            radiostatus = 0;
        }
        else {
            //off
            preset1.setBackgroundColor(Color.argb(100,26,10,255));
            preset2.setBackgroundColor(Color.argb(100,26,10,255));
            preset3.setBackgroundColor(Color.argb(100,26,10,255));
            preset4.setBackgroundColor(Color.argb(100,26,10,255));
            preset5.setBackgroundColor(Color.argb(100,26,10,255));
            preset6.setBackgroundColor(Color.argb(100,26,10,255));
            Current_Station.setBackgroundColor(Color.argb(100,26,10,255));
            Current_Station.setText("");

            am.setBackgroundColor(Color.argb(100,26,10,255));
            fm.setBackgroundColor(Color.argb(100,26,10,255));
            tog = true;
            seek_down.setBackgroundColor(Color.argb(100,26,10,255));
            seek_up.setBackgroundColor(Color.argb(100,26,10,255));
            amfm_indicator.setText("");
        }
    }
    public void onAMClick(View v){
        amfm_indicator.setText("AM");
        radiostatus = 0;

        Current_Station.setText(""+currentAMStation +" kHz");
    }

    public void onFMClick(View v){
        amfm_indicator.setText("FM");
        radiostatus = 1;
        String message = "";
        message = String.format("%.1f",currentFMStation);
        Current_Station.setText(""+message +" MHz");
    }
    public void OnSeekDownClick(View v){
        String message = "";
        if(radiostatus == 0){
            if(currentAMStation <=530){
                currentAMStation = 1700;
                Current_Station.setText(""+currentAMStation +" kHz");
                return;
            }
            currentAMStation -= 10;
            Current_Station.setText(""+currentAMStation +" kHz");
        }
        else{
            if(currentFMStation <=88.1){
                currentFMStation = 107.9;
                Current_Station.setText(""+currentFMStation +" MHz");
                return;
            }
            currentFMStation -= 0.2;
            message = String.format("%.1f",currentFMStation);
            Current_Station.setText(""+message +" MHz");
        }


    }
    public void OnSeekUpClick(View v){
        String message = "";
        if(radiostatus == 0){
            if(currentAMStation >=1700){
                currentAMStation = 530;
                Current_Station.setText(""+currentAMStation +" kHz");
                return;
            }
            currentAMStation += 10;
            Current_Station.setText(""+currentAMStation +" kHz");
        }
        else{
            if(currentFMStation >=107.9){
                currentFMStation = 88.1;
                message = ""+currentFMStation;
                Current_Station.setText(""+currentFMStation +" MHz");
                return;
            }
            currentFMStation += 0.2;
            message = String.format("%.1f",currentFMStation);
            Current_Station.setText(""+message +" MHz");
        }

    }


}
