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
    private ImageView Radio_Display;
    private boolean tog;
    private TextView amfm_indicator;
    private SeekBar seekbar;
    private int seekBarStatus;
    private int radiostatus;

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
        Radio_Display = (ImageView)findViewById(R.id.Radio_display);
        tog = true;
        amfm_indicator = (TextView)findViewById(R.id.amfm_indicator);
        Current_Station = (TextView)findViewById(R.id.Current_Station);
        seekbar = (SeekBar)findViewById(R.id.seekBar);
        radiostatus = 0;

    /*    seekbar.setOnSeekBarChangeListener(this) {
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                if(radiostatus ==0){
                    seekbar.setProgress(0);
                    seekbar.incrementProgressBy(10);

                    seekbar.setMax(1170);
                    progress = progress / 10;
                    progress = progress * 10;
                    Current_Station.setText(String.valueOf(progress+530));
                }
                else if(radiostatus ==1){
                    double p = progress;
                    seekbar.setProgress(0);
                    seekbar.incrementProgressBy(10);

                    seekbar.setMax(99);
                    p = progress / .2;
                    p = progress * .2;
                    Current_Station.setText(String.valueOf((double)progress+88.1));
                }

            }

            public void onStartTrackingTouch(SeekBar seekbar) {

            }

            public void onStopTrackingTouch(SeekBar seekbar) {

            }
        }
*/
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
            Tuner_Txt.setBackgroundColor(Color.rgb(0,171,255));
            am.setBackgroundColor(Color.rgb(0,171,255));
            fm.setBackgroundColor(Color.rgb(0,171,255));
            Radio_Display.setBackgroundColor(Color.rgb(0,171,255));
            tog = false;

        }
        else {
            //off
            preset1.setBackgroundColor(Color.argb(100,26,10,255));
            preset2.setBackgroundColor(Color.argb(100,26,10,255));
            preset3.setBackgroundColor(Color.argb(100,26,10,255));
            preset4.setBackgroundColor(Color.argb(100,26,10,255));
            preset5.setBackgroundColor(Color.argb(100,26,10,255));
            preset6.setBackgroundColor(Color.argb(100,26,10,255));
            Tuner_Txt.setBackgroundColor(Color.argb(100,26,10,255));
            am.setBackgroundColor(Color.argb(100,26,10,255));
            fm.setBackgroundColor(Color.argb(100,26,10,255));
            Radio_Display.setBackgroundColor(Color.argb(100,26,10,255));
            tog = true;
        }
    }
    public void onAMClick(View v){
        amfm_indicator.setText("AM");
        radiostatus = 0;
    }

    public void onFMClick(View v){
        amfm_indicator.setText("FM");
        radiostatus = 1;
    }




}
