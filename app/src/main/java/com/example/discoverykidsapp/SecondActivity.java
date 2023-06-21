package com.example.discoverykidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent= getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView txtNome = new TextView(this);
        txtNome.setTextSize(40);
        txtNome.setText(message);
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
