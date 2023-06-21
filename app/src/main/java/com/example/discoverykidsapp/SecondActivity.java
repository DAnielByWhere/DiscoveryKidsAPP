package com.example.discoverykidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void abrirRecicle(View view) {
        Intent intent = new Intent(this, RecicleActivity.class);
        startActivity(intent);
    }

    public void abrirSignificado(View view) {
        Intent intent = new Intent(this, SignificadoActivity.class);
        startActivity(intent);
    }

    public void abrirHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
