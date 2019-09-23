package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView txtvw1;
    Button btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtvw1 = (TextView) findViewById(R.id.txtvw1);

        Intent intent = getIntent();
        txtvw1.setText(intent.getStringExtra("Send Data"));


        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(secondActivity.this, com.example.intentexample.MainActivity.class);
                startActivity(MainActivity);
            }
        });

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdActivity = new Intent(secondActivity.this , com.example.intentexample.thirdActivity.class);
                startActivity(thirdActivity);
            }
        });






    }
}
