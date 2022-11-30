package com.test.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

//    public void login(View view) {
//        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
//    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void txtDangKy(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }
}