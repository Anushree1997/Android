package com.example.tasktenpicturesanchit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.lang.NullPointerException;

public class MainActivity extends AppCompatActivity {

    ImageView img_vw1;
    Button btn1 , btn2 ;

    int imgNumber = 0;


        public void next(View v){
        img_vw1 = (ImageView) findViewById(R.id.img_vw1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);


        if(imgNumber == 0)
        {

            img_vw1.setImageResource(R.drawable.dog1);
            imgNumber = 1;

        }
        else if(imgNumber == 1)
        {
            img_vw1.setImageResource(R.drawable.bird2);
            imgNumber = 2;
        }
        else if(imgNumber == 2)
        {
            img_vw1.setImageResource(R.drawable.parrot3);
            imgNumber = 3;
        }
        else if(imgNumber == 3)
        {
            img_vw1.setImageResource(R.drawable.monkey4);
            imgNumber = 4;
        }
        else if(imgNumber == 4)
        {
            img_vw1.setImageResource(R.drawable.goat5);
            imgNumber = 5;
        }
        else if(imgNumber == 5)
        {
            img_vw1.setImageResource(R.drawable.tiger6);
            imgNumber = 6;
        }
        else if(imgNumber == 6)
        {
            img_vw1.setImageResource(R.drawable.butterfly8);
            imgNumber = 7;
        }
        else if(imgNumber == 7)
        {
            img_vw1.setImageResource(R.drawable.giraffe8);
            imgNumber = 8;
        }
        else if(imgNumber == 8)
        {
            img_vw1.setImageResource(R.drawable.elephant9);
            imgNumber = 9;

        }
        else {
            img_vw1.setImageResource(R.drawable.cat);
            imgNumber = 0;
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }


    }


    public void prev(View v) {
        img_vw1=(ImageView) findViewById(R.id.img_vw1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);


        if(imgNumber == 0)
        {
            img_vw1.setImageResource(R.drawable.cat);
            imgNumber = 9;


        }
        else if(imgNumber == 1)
        {
            img_vw1.setImageResource(R.drawable.dog1);
            imgNumber = 0;
            btn2.setEnabled(false);
            btn1.setEnabled(true);
        }
        else if(imgNumber == 2)
        {
            img_vw1.setImageResource(R.drawable.bird2);
            imgNumber = 1;
        }
        else if(imgNumber == 3)
        {
            img_vw1.setImageResource(R.drawable.parrot3);
            imgNumber = 2;
        }
        else if(imgNumber == 4)
        {
            img_vw1.setImageResource(R.drawable.monkey4);
            imgNumber = 3;
        }
        else if(imgNumber == 5)
        {
            img_vw1.setImageResource(R.drawable.goat5);
            imgNumber = 4;
        }
        else if(imgNumber == 6)
        {
            img_vw1.setImageResource(R.drawable.tiger6);
            imgNumber = 5;
        }
        else if(imgNumber == 7)
        {
            img_vw1.setImageResource(R.drawable.butterfly8);
            imgNumber = 6;
        }
        else if(imgNumber == 8)
        {
            img_vw1.setImageResource(R.drawable.giraffe8);
            imgNumber = 7;
        }
        else {
            img_vw1.setImageResource(R.drawable.elephant9);
            imgNumber = 8;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
