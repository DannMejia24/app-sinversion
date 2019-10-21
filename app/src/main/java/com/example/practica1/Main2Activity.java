package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText nombre,correo,contraseña,confirmacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.ed1);
        correo=(EditText)findViewById(R.id.ed2);
        contraseña=(EditText)findViewById(R.id.ed3);
        confirmacion=(EditText)findViewById(R.id.ed4);
    }

    public void registro(View view){
        String val1=nombre.getText().toString();
        String val2=correo.getText().toString();
        String val3=contraseña.getText().toString();
        String val4=confirmacion.getText().toString();

        if(!val1.isEmpty() && !val2.isEmpty() && !val3.isEmpty() && !val4.isEmpty()){
            if(val3.equals(val4)){

            }else{
                Toast.makeText(this, "LAS CONTRASEÑAS NO COINCIDEN", Toast.LENGTH_LONG).show();
            }

        }else{
            if(val1.isEmpty())
                nombre.setError("Falta Nombre");
            correo.setError("Falta Correo");
            contraseña.setError("Falta Contraseña");
            confirmacion.setError("Falta Contraseña");

            Toast.makeText( this, "ERROR AL REGISTRAR", Toast.LENGTH_LONG).show();

        }


    }

    public void salir(View view){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
}