package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText GuessEditText;
    Button guessButton;
    int RandomNumber;

    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void guess(View view){

        GuessEditText = (EditText) findViewById(R.id.GuessEditText);

        int guessInt = Integer.parseInt(GuessEditText.getText().toString());

        if(guessInt > RandomNumber)
        {
            makeToast("Higher");
        }
        else if (guessInt < RandomNumber)
        {
            makeToast("Lower");
        }
        else
        {
            makeToast("That's Right Try Again!!!!");

            Random rand = new Random();
            RandomNumber = rand.nextInt(20)+1;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand= new Random();
        RandomNumber = rand.nextInt(20)+1;
        String number = Integer.toString(RandomNumber);
        Log.i("Random Number Is:" , number);

    }
}
