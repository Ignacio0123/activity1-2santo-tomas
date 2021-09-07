package com.tomasinos.actividad12app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class destino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String aviso1 = intent.getStringExtra(MainActivity.enviar_dato1);
        String aviso2 = intent.getStringExtra(MainActivity.enviar_dato2);

        TextView nombre = (TextView) findViewById(R.id.txtNombre);
        nombre.setText(aviso1);
        TextView edad = (TextView) findViewById(R.id.txtEdad);
        edad.setText(aviso2);

    }


}