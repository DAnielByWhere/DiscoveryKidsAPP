package com.example.discoverykidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MsMakerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msmaker);
    }

    public void abrirRecicle(View view) {
        Intent intent = new Intent(this, RecicleActivity.class);
        startActivity(intent);
    }

    public void abrirSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
