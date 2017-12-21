package com.example.farhanhassan.myapplication30_11_17;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);


        Button b =(Button) findViewById(R.id.btn1);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();

            }

            protected void sendEmail() {

                Log.i("sending email","");
                String [] CC = {""};
                String [] To = {""};

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                //  Intent emailIntent = new Intent(Intent.ACTION_SENDTO);

                emailIntent.setData(Uri.parse("mailto"));

                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, To);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "your subject");
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Sending email sucessfully");



                try {


                    startActivity(Intent.createChooser(emailIntent, "send email"));

                    finish();
                    Log.i("finish sending email","");

                }


                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(email.this,"There is no email", Toast.LENGTH_SHORT).show();

                }
            }


        });








    }
}
