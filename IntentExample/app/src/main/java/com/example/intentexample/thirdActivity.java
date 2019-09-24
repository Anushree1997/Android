package com.example.intentexample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class thirdActivity extends AppCompatActivity {

    EditText edt_txt2;
    Button btn5, btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        edt_txt2=(EditText) findViewById(R.id.edt_txt2);
        btn5=(Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api=Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    Activity#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for Activity#requestPermissions for more details.
                    Intent intent=new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + edt_txt2.getText().toString()));
                    startActivity(intent);

                    return;
                }




            }
        });



        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent thirdActivity = new Intent(com.example.intentexample.thirdActivity.this , MainActivity.class);
                startActivity(thirdActivity);



            }
        });





    }
}
