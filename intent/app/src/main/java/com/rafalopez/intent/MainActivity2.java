package com.rafalopez.intent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= getIntent();
        Bundle data = intent.getExtras();
        String name = data.getString("nombre");
        int edad = data.getInt("edad",-1);
        Boolean esActivo = data.getBoolean("esActivo",false);
        Log.d("salida", name +" " + edad + " " + esActivo + "");
    }
}