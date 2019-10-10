package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView osward;
    ImageView tomandjerry;

    public void fade(View view){

    osward = (ImageView) findViewById(R.id.osward);
    tomandjerry = (ImageView) findViewById(R.id.tomandjerry);

        osward.animate().alpha(0f).setDuration(2000);
        tomandjerry.animate().alpha(1f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
