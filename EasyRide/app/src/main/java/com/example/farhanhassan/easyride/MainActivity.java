package com.example.farhanhassan.easyride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbtn = (Button)findViewById(R.id.numberloginbtn);
        final EditText enternumber = (EditText)findViewById(R.id.enternumbertxt);
        TextView socialaccount = (TextView)findViewById(R.id.socialloginpagetxtview);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(enternumber.getText().toString().equals("03368804742")||(enternumber.getText().toString().equals("03442522927")))
                {
                    Intent passwordlogin = new Intent(MainActivity.this,PasswordLogin.class);

                    startActivity(passwordlogin);
                }

                else
                {
                    Toast.makeText(getBaseContext(),"please enter correct Phone number", Toast.LENGTH_SHORT).show();
                }


            }
        });


        socialaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent socialaccount = new Intent(MainActivity.this,Sociallogin.class);

                startActivity(socialaccount);
            }
        });


    }
}
