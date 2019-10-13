package com.example.audiodemoudemy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

import static android.media.AudioManager.STREAM_MUSIC;

public class MainActivity extends AppCompatActivity {
    Button play ,  pause;

    AudioManager audioManager;

    MediaPlayer mediaPlayer;
    public void playAudio(View view){
           mediaPlayer.start();
        }

    public void  pauseAudio(View view){
           mediaPlayer.pause();
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this , R.raw.song);

        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(STREAM_MUSIC);
        int curVolume = audioManager.getStreamVolume(STREAM_MUSIC);


        SeekBar volumeControl = (SeekBar) findViewById(R.id.seekBar);
        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(curVolume);

        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                //Log.i("SeekBar Value" , Integer.toString(progress));
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC , progress , 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final SeekBar scrubber = (SeekBar) findViewById(R.id.scrubber);

        scrubber.setMax(mediaPlayer.getDuration());

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                scrubber.setProgress(mediaPlayer.getCurrentPosition());
            }
        }, 0 , 2000);


        scrubber.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

              //  Log.i("Scrubber Data" , Integer.toString(progress));
                mediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                            
            }
        });


    };


    }


