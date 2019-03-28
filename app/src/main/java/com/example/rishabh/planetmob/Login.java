package com.example.rishabh.planetmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class Login extends FirstLogin {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d("Login:", "onCreate: created activity_login.xml UI succesfully.");

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(Login.this, FirstLogin.class));
                finish();

                Log.d("Login:", "onCreate: waiting 5 seconds for FirstLogin... loading FirstLogin.class");
            }
        }, 2000 );
    }
}

