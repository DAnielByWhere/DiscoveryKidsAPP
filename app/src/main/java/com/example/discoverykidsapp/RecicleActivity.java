package com.example.discoverykidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RecicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicle);
    }

    public void abrirMsMaker(View view) {
        Intent intent = new Intent(this, MsMakerActivity.class);
        startActivity(intent);
    }

    public void abrirPeixonauta(View view) {
        Intent intent = new Intent(this, PeixonautaActivity.class);
        startActivity(intent);
    }

    public void abrirDoki(View view) {
        Intent intent = new Intent(this, DokiActivity.class);
        startActivity(intent);
    }

    public void abrirSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
