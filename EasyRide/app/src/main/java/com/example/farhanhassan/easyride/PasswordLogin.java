package com.example.farhanhassan.easyride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PasswordLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_login);



        final Button passwordloginbtn = (Button)findViewById(R.id.passwordloginbtn);
        TextView forgotpassword = (TextView)findViewById(R.id.forgetpasswordtxt);
        TextView noaccount = (TextView)findViewById(R.id.noaccount);
        final EditText passwordtxt = (EditText)findViewById(R.id.passwordtxt);


        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent forgotpassword = new Intent(PasswordLogin.this,Forgotpassword.class);

                startActivity(forgotpassword);

            }
        });


        passwordloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(passwordtxt.getText().toString().equals("messi10")||(passwordtxt.getText().toString().equals("alichoza")))
                {
                    Intent homepage = new Intent(PasswordLogin.this,Home.class);

                    startActivity(homepage);
                }

                else
                {
                    Toast.makeText(getBaseContext(),"please enter correct password", Toast.LENGTH_SHORT).show();
                }


            }
        });



        noaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resgisterform = new Intent(PasswordLogin.this,RegisterForm.class);
                startActivity(resgisterform);
            }
        });
    }
}
