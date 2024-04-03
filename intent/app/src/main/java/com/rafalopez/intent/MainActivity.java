package com.rafalopez.intent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("salida", "Iniciando , linea 18");
        sendIntent();

    }
    private void sendIntent(){
        Intent intent=new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("nombre", "Pepe");
        bundle.putInt("edad", 10);
        bundle.putBoolean("esActivo", true);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}