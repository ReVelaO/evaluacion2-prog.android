package com.example.listaprecios;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegistroUsuarios extends AppCompatActivity {

    private EditText oRegName1;
    private EditText oRegName2;
    private Spinner oSpinner;
    private String[] aGender = {"Hombre", "Mujer", "Prefiero no indicar"};
    private EditText oRegDate;
    public static Persona oUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        oRegName1 = findViewById(R.id.idRegName);
        oRegName2 = findViewById(R.id.idRegName2);
        oSpinner = findViewById(R.id.idSpinner);
        oRegDate = findViewById(R.id.idRegDate);
        oUsuario = new Persona();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aGender);
        oSpinner.setAdapter(adapter);
    }

    public void Crear(View v)
    {
        //seteamos los datos del usuario
        oUsuario.setNombre(oRegName1.getText().toString());
        oUsuario.setApellido(oRegName2.getText().toString());
        oUsuario.setGenero(aGender[oSpinner.getSelectedItemPosition()]);
        oUsuario.setNacimiento(oRegDate.getText().toString());
        //avisamos que ya existe el usuario
        MainActivity.IsRegistryCompleted = true;
        //regresamos el usuario al menu principal
        onBackPressed();
    }
}
