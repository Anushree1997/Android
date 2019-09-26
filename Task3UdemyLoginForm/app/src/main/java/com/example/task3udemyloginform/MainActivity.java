package com.example.task3udemyloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_txt1 , edt_txt2;



    public void sendData(View view){

        edt_txt1 = (EditText) findViewById(R.id.edt_txt1);
        edt_txt2 = (EditText) findViewById(R.id.edt_txt2);
        Toast.makeText(MainActivity.this , edt_txt1.getText().toString() +"  "+ edt_txt2.getText().toString() , Toast.LENGTH_SHORT).show();

     //   Log.i("Uname",edt_txt1.getText().toString());
      //  Log.i("Pswd", edt_txt2.getText().toString());
          }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
