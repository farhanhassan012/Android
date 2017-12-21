package com.example.farhanhassan.myapplication30_11_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button contact = (Button) findViewById(R.id.conbtn);
        final Button home = (Button) findViewById(R.id.hombtn);

        final TextView name = (TextView) findViewById(R.id.namtxt);
        final TextView password = (TextView) findViewById(R.id.pastxt);
        final Button reg = (Button) findViewById(R.id.logbtn);
        final Button about = (Button) findViewById(R.id.abubtn);
        final Button email = (Button) findViewById(R.id.emailbtn);


        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent con = new Intent(MainActivity.this, contact.class);

                startActivity(con);
            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this, home.class);
                startActivity(h);
            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, About.class);
                startActivity(a);
            }
        });


        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this, email.class);
                startActivity(e);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.getText().toString().equals("")) {
                    Toast.makeText(getBaseContext(), "Please enter  user name", Toast.LENGTH_SHORT).show();

                } else if (password.getText().toString().equals("")) {
                    Toast.makeText(getBaseContext(), "Please enter correct password", Toast.LENGTH_SHORT).show();

                }
                else
                    {
                    Intent intent = new Intent(MainActivity.this, Registration.class);

                    startActivity(intent);
                }
            }
        });


//        reg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                validate(name.getText().toString() , password.getText().toString());
//
//            }
//        });



    }

//    private   void validate(String name , String password)
//    {
//          if((name == "farhan" )&& (password == "12345"))
//        {
//
//              Intent intent=new Intent(MainActivity.this, Registration.class);
//              startActivity(intent);
//          }
//
//          else {
//
//
//          }





}
