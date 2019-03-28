package com.example.rishabh.planetmob;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

public class FirstLogin extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {

    private SignInButton SignIn;
    private GoogleApiClient googleApiClient;
    private static final int REQ_CODE = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);
        SignIn = findViewById(R.id.btnGoogle);
        SignIn.setOnClickListener(this);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(Auth.GOOGLE_SIGN_IN_API,googleSignInOptions).build();
    }

    @Override
    protected void onStart() {
        super.onStart();
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        updateUI(Boolean.parseBoolean(String.valueOf(account)));
    }

    @Override
    public void onClick(View v) {
      switch (v.getId())
      {
          case R.id.btnGoogle:
              SignIn();
              break;
      }
    }

    public void buttonClick(View v) {
        Intent myIntent = new Intent(FirstLogin.this, Email.class);
        FirstLogin.this.startActivity(myIntent);
    }


    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    private void SignIn() {
       Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
       startActivityForResult(intent,REQ_CODE);
    }
    private void handleResult(GoogleSignInResult result) {
      if(result.isSuccess())
      {
          GoogleSignInAccount account = result.getSignInAccount();
          assert account != null;
          account.getDisplayName();
          account.getEmail();
          updateUI(true);
      }
      else
      {
          updateUI(false);
      }
    }
    private void updateUI(boolean isLogin) {
          if(isLogin)
          {
              SignIn.setVisibility(View.VISIBLE);
          }
          else
          {
              SignIn.setVisibility(View.VISIBLE);
          }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQ_CODE)
        {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleResult(result);
            Intent myIntent = new Intent(FirstLogin.this,Home.class);
            FirstLogin.this.startActivity(myIntent);
        }
    }
}


