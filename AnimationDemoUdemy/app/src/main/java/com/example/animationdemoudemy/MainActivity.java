package com.example.animationdemoudemy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView noddy;
    ImageView shinchan;
    @RequiresApi(api=Build.VERSION_CODES.LOLLIPOP)
    public void fade(View view){
        noddy = (ImageView) findViewById(R.id.noddy);

        //noddy.animate().alpha(0f).setDuration(2000);

        //noddy.animate().translationYBy(1000f).setDuration(2000);    Goes to Bottom
        //noddy.animate().translationXBy(-1000f).setDuration(2000);   Goes to Left
        //noddy.animate().translationXBy(1000f).setDuration(2000);

        //noddy.animate().rotation(180f).setDuration(2000);            Rotate at 180 degree

        //noddy.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000); Smaller than real image

        noddy.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600)
                .setDuration(2000);

        //noddy.animate().alpha(1f).setDuration(2000);
        // shinchan = (ImageView) findViewById(R.id.shinchan);

        // shinchan.animate().alpha(1f).setDuration(2000);
    }
                     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noddy = (ImageView) findViewById(R.id.noddy);
        noddy.setTranslationX(-1000f);
        noddy.setTranslationY(-1000f);
    }
}
