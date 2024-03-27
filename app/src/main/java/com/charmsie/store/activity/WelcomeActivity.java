package com.charmsie.store.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.charmsie.store.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void moveToSignUp(View view) {
        Intent intent = new Intent(WelcomeActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void moveToSignIn(View view) {
        Intent intent = new Intent(WelcomeActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}