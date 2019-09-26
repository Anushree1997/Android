package com.example.task2udemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_txt;

    public void clickFunction(View view){

        edt_txt = (EditText) findViewById(R.id.edt_txt);
        Toast.makeText(MainActivity.this , edt_txt.getText().toString() + "!" ,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
