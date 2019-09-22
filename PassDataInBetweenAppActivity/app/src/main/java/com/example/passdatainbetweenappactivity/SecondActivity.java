package com.example.passdatainbetweenappactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txt_vw1;
    Button btn_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt_vw1 =(TextView) findViewById(R.id.txt_vw1);
        btn_second = (Button) findViewById(R.id.btn_second);
        Intent intentFromMainActivity = getIntent();
        txt_vw1.setText(intentFromMainActivity.getStringExtra("Hello"));
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(SecondActivity.this, MainActivity.class);

                startActivity(mainActivity);
            }
        });
            }
    }

