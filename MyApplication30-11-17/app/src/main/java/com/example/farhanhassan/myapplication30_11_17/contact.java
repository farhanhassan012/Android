package com.example.farhanhassan.myapplication30_11_17;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button ahsan = (Button)findViewById(R.id.ahsbtn);
        Button ali = (Button)findViewById(R.id.alibtn);
        Button dennis = (Button)findViewById(R.id.denbtn);
        Button nabeel = (Button)findViewById(R.id.nabbtn);


        ahsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:03452301199"));
                startActivity(a);
            }
        });



        ali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:03013301100"));
                startActivity(al);
            }
        });

        dennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:03340301191"));
                startActivity(d);
            }
        });


        nabeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:03004301201"));
                startActivity(n);
            }
        });


    }
}
