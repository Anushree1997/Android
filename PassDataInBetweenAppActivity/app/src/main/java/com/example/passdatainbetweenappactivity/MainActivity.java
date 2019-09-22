package com.example.passdatainbetweenappactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt_txt1;
    Button btn_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_txt1 = (EditText) findViewById(R.id.edt_txt1);
        btn_data = (Button) findViewById(R.id.btn_data);

        btn_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent SecondActivity = new Intent(MainActivity.this , com.example.passdatainbetweenappactivity.SecondActivity.class);
                SecondActivity.putExtra("Hello" ,edt_txt1.getText().toString() );

                startActivity(SecondActivity);

            }
        });

    }
}
