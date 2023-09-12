package com.example.discoverykidsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignificadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_significado);
    }

    public void abrirSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void abrirHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void abrirValores(View view) {
        Intent intent = new Intent(this, AmizadeActivity.class);
        startActivity(intent);
    }

    public void abrirCuriosidades(View view) {
        Intent intent = new Intent(this, CuriosidadesActivity.class);
        startActivity(intent);
    }

    public void abrirInformacoes(View view) {
        Intent intent = new Intent(this, InformacoesActivity.class);
        startActivity(intent);
    }

    public void abrirGoogle(View view) {
        Uri uri = Uri.parse("https://www.google.com/search?q=Programas+de+Discovery+kid+2023&client=opera-gx&hs=crF&sca_esv=564802514&biw=1325&bih=665&ei=ieEAZe3ALIyV5OUP566-8AM&ved=0ahUKEwitqb-Li6aBAxWMCrkGHWeXDz4Q4dUDCA8&uact=5&oq=Programas+de+Discovery+kid+2023&gs_lp=Egxnd3Mtd2l6LXNlcnAiH1Byb2dyYW1hcyBkZSBEaXNjb3Zlcnkga2lkIDIwMjNIoR9Q0w5Y-RxwAXgBkAEAmAHNAaABuwSqAQUwLjMuMbgBA8gBAPgBAcICChAAGEcY1gQYsAPCAgoQABiKBRiwAxhDwgIHEAAYigUYQ8ICBRAAGIAE4gMEGAAgQYgGAZAGCg&sclient=gws-wiz-serp");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
