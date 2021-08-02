package com.icat.armaloft;


import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import android.content.Intent;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class Login_successActivity extends AppCompatActivity{

    Button logoutBtn;
    TextView userName,userEmail,userId;
    GoogleSignInClient mGoogleSignInClient;
    ImageView profileImage;
    private static int SPLASH_TIME_OUT =3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent homeIntent = new Intent(Login_successActivity.this , MainActivity4.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);


        userName=findViewById(R.id.name);
        userEmail=findViewById(R.id.email);

        profileImage=findViewById(R.id.profileImage);

        GoogleSignInOptions gso =  new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            //String personGivenName = acct.getGivenName();
            //String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            userName.setText(personName);
            userEmail.setText(personEmail);

            Glide.with(this).load(String.valueOf(personPhoto)).into(profileImage);

        }



    }


}