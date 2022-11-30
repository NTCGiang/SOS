package com.test.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IdentifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify);
    }

    public void txtDangNhap(View view) {
        startActivity(new Intent(IdentifyActivity.this, RegisterActivity.class));
    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(IdentifyActivity.this, MainActivity.class));
    }
}