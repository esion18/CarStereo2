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
import android.view.View.OnLongClickListener;


import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
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
    private int[] AM_presets;
    private double[] PM_presets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PowerButton = (Button)findViewById(R.id.PowerButton);
        Tuner_Txt = (TextView)findViewById(R.id.Tuner_txt);
        preset1 = (Button)findViewById(R.id.Preset_1);
        preset1.setOnLongClickListener(this);
        preset2 = (Button)findViewById(R.id.Preset_2);
        preset2.setOnLongClickListener(this);
        preset3 = (Button)findViewById(R.id.Preset_3);
        preset3.setOnLongClickListener(this);
        preset4 = (Button)findViewById(R.id.Preset_4);
        preset4.setOnLongClickListener(this);
        preset5 = (Button)findViewById(R.id.Preset_5);
        preset5.setOnLongClickListener(this);
        preset6 = (Button)findViewById(R.id.Preset_6);
        preset6.setOnLongClickListener(this);
        am = (Button)findViewById(R.id.AM);
        fm = (Button)findViewById(R.id.FM);
        amfm_indicator = (TextView)findViewById(R.id.amfm_indicator);
        Current_Station = (TextView)findViewById(R.id.Current_Station);
        seek_down = (Button)findViewById(R.id.seek_down);
        seek_up = (Button)findViewById(R.id.seek_up);

        AM_presets = new int[] {550,600,650,700,750,800};
        PM_presets = new double[] {90.9,92.9, 94.9, 96.9, 98.9, 100.9};
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

    public boolean onLongClick(View v){
        if(v == preset1){
            if(tog){
                return false;
            }
            if(radiostatus == 0){
                AM_presets[0] = currentAMStation;
                Current_Station.setText(""+AM_presets[0] +" kHz set to Preset 1");
            }
            else{
                PM_presets[0] = currentFMStation;
                String message = "";
                message = String.format("%.1f",PM_presets[0]);
                Current_Station.setText(""+message +" MHz set to Preset 1");
            }
        }
        if(v == preset2){
            if(tog){
                return false;
            }
            if(radiostatus == 0){
                AM_presets[1] = currentAMStation;
                Current_Station.setText(""+AM_presets[1] +" kHz set to Preset 2");
            }
            else{
                PM_presets[1] = currentFMStation;
                String message = "";
                message = String.format("%.1f",PM_presets[1]);
                Current_Station.setText(""+message +" MHz set to Preset 2");
            }
        }
        if(v == preset3){
            if(tog){
                return false;
            }
            if(radiostatus == 0){
                AM_presets[2] = currentAMStation;
                Current_Station.setText(""+AM_presets[2] +" kHz set to Preset 3");
            }
            else{
                PM_presets[2] = currentFMStation;
                String message = "";
                message = String.format("%.1f",PM_presets[2]);
                Current_Station.setText(""+message +" MHz set to Preset 3");
            }
        }
        if(v == preset4){
            if(tog){
                return false;
            }
            if(radiostatus == 0){
                AM_presets[3] = currentAMStation;
                Current_Station.setText(""+AM_presets[3] +" kHz set to Preset 4");
            }
            else{
                PM_presets[3] = currentFMStation;
                String message = "";
                message = String.format("%.1f",PM_presets[3]);
                Current_Station.setText(""+message +" MHz set to Preset 4");
            }
        }
        if(v == preset5){
            if(tog){
                return false;
            }
            if(radiostatus == 0){
                AM_presets[4] = currentAMStation;
                Current_Station.setText(""+AM_presets[4] +" kHz set to Preset 5");
            }
            else{
                PM_presets[4] = currentFMStation;
                String message = "";
                message = String.format("%.1f",PM_presets[4]);
                Current_Station.setText(""+message +" MHz set to Preset 5");
            }
        }
        if(v == preset6){
            if(tog){
                return false;
            }
            if(radiostatus == 0){
                AM_presets[5] = currentAMStation;
                Current_Station.setText(""+AM_presets[5] +" kHz set to Preset 6");
            }
            else{
                PM_presets[5] = currentFMStation;
                String message = "";
                message = String.format("%.1f",PM_presets[5]);
                Current_Station.setText(""+message +" MHz set to Preset 6");
            }
        }
        return true;
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
        if(tog){
            return;
        }
        amfm_indicator.setText("AM");
        radiostatus = 0;

        Current_Station.setText(""+currentAMStation +" kHz");
    }

    public void onFMClick(View v){
        if(tog){
            return;
        }
        amfm_indicator.setText("FM");
        radiostatus = 1;
        String message = "";
        message = String.format("%.1f",currentFMStation);
        Current_Station.setText(""+message +" MHz");
    }
    public void OnSeekDownClick(View v){
        if(tog){
            return;
        }
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
        if(tog){
            return;
        }
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
    public void OnPreset1Click(View v){
        if(tog){
            return;
        }
        if(radiostatus == 0){
            currentAMStation = AM_presets[0];
            Current_Station.setText(""+AM_presets[0] +" kHz");
        }
        else{
            currentFMStation = PM_presets[0];
            String message = "";
            message = String.format("%.1f",PM_presets[0]);
            Current_Station.setText(""+message +" MHz");

        }
    }
    public void OnPreset2Click(View v){
        if(tog){
            return;
        }
        if(radiostatus == 0){
            currentAMStation = AM_presets[1];
            Current_Station.setText(""+AM_presets[1] +" kHz");
        }
        else{
            currentFMStation = PM_presets[1];
            String message = "";
            message = String.format("%.1f",PM_presets[1]);
            Current_Station.setText(""+message +" MHz");
        }
    }
    public void OnPreset3Click(View v){
        if(tog){
            return;
        }
        if(radiostatus == 0){
            currentAMStation = AM_presets[2];
            Current_Station.setText(""+AM_presets[2] +" kHz");
        }
        else{
            currentFMStation = PM_presets[2];
            String message = "";
            message = String.format("%.1f",PM_presets[2]);
            Current_Station.setText(""+message +" MHz");
        }
    }
    public void OnPreset4Click(View v){
        if(tog){
            return;
        }
        if(radiostatus == 0){
            currentAMStation = AM_presets[3];
            Current_Station.setText(""+AM_presets[3] +" kHz");
        }
        else{
            currentFMStation = PM_presets[3];
            String message = "";
            message = String.format("%.1f",PM_presets[3]);
            Current_Station.setText(""+message +" MHz");
        }
    }
    public void OnPreset5Click(View v){
        if(tog){
            return;
        }
        if(radiostatus == 0){
            currentAMStation = AM_presets[4];
            Current_Station.setText(""+AM_presets[4] +" kHz");
        }
        else{
            currentFMStation = PM_presets[4];
            String message = "";
            message = String.format("%.1f",PM_presets[4]);
            Current_Station.setText(""+message +" MHz");
        }
    }
    public void OnPreset6Click(View v){
        if(tog){
            return;
        }
        if(radiostatus == 0){
            currentAMStation = AM_presets[5];
            Current_Station.setText(""+AM_presets[5] +" kHz");
        }
        else{
            currentFMStation = PM_presets[5];
            String message = "";
            message = String.format("%.1f",PM_presets[5]);
            Current_Station.setText(""+message +" MHz");
        }
    }


}
