package com.example.task4currencyconverterudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    EditText edt_txt1;
    Button btn1;
    ImageView imgvw;



    public void currencyConverter(View view){

        edt_txt1 = (EditText) findViewById(R.id.edt_txt1);
        Double rupeeAmountDouble = Double.parseDouble(edt_txt1.getText().toString());
        Double rupeeAmount = rupeeAmountDouble * 70.69;

        Toast.makeText(MainActivity.this , "Rs  "+  String.format("%.2f", rupeeAmount) , Toast.LENGTH_LONG).show();

           }
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
