package com.example.imageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img_vw;
    Button btn1;

    public void changePicture(View v){
        img_vw = (ImageView) findViewById(R.id.img_vw);
        img_vw.setImageResource(R.drawable.cat);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
