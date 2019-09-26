package com.example.imageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img_vw;
    Button btn1;
    int imgNumber = 0;

    public void changePicture(View v){
        img_vw = (ImageView) findViewById(R.id.img_vw);


        if (imgNumber == 0){
           img_vw.setImageResource(R.drawable.cat1);
            imgNumber = 1;
       }else{
           img_vw.setImageResource(R.drawable.cat);
            imgNumber = 0;
       }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
