package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usuario=(EditText)findViewById(R.id.ed5);
        contraseña=(EditText)findViewById(R.id.ed6);

    }

    public void inicio(View view){
        String val5=usuario.getText().toString();
        String val6=contraseña.getText().toString();

        if(!val5.isEmpty() && !val6.isEmpty() ){


        }else{
            if(val5.isEmpty())
                usuario.setError("Falta Usuario");

            contraseña.setError("Falta Contraseña");


            Toast.makeText( this, "ERROR AL REGISTRAR", Toast.LENGTH_LONG).show();

        }
    }

    public void registrarse(View view){
        Intent i=new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
