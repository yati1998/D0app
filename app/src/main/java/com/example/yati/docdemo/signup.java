package com.example.yati.docdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class signup extends AppCompatActivity implements View.OnClickListener{
     EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


    }

    private void registerUser(){
        String email1= email.getText().toString().trim();
        String password1 = password.getText().toString().trim();




    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signup1:
                registerUser();
                break;
            case R.id.login1:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
