package com.tomasinos.actividad12app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String enviar_dato1 = "nombre";
    public static final String enviar_dato2 = "edad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void enviarDatos(View view){
        Intent intent = new Intent(this, destino.class);
        EditText nombre = (EditText) findViewById(R.id.etxtNombre);
        EditText edad = (EditText) findViewById(R.id.eTxtEdad);
        String aviso1 = nombre.getText().toString();
        String aviso2 = edad.getText().toString();
        intent.putExtra(enviar_dato1, aviso1);
        intent.putExtra(enviar_dato2, aviso2);
        startActivity(intent);
    }

}