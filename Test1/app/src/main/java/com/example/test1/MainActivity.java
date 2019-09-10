package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // Button submitButton ;
    EditText editText1;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // submitButton = (Button) findViewById(R.id.button1);
        editText1 = (EditText) findViewById(R.id.editText1);
        textView1 = (TextView) findViewById(R.id.textView1);
      /* submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             /*   Toast buttontoast = Toast.makeText(getApplicationContext(),
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                        Toast.LENGTH_SHORT);
                buttontoast.show();
             textView1.setText(editText1.getText().toString());
            }
        }); */
    }

}
