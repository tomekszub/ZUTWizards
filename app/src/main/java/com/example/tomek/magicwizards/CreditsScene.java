package com.example.tomek.magicwizards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CreditsScene extends AppCompatActivity {

    private Button gobbaGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits_scene);
        //byla tu wczesniej funkcja powrotu, ale w sumie android sam to obsluguje xd
    }
}
