package com.example.listaprecios;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroAves extends AppCompatActivity {

    private EditText oVisName;
    private EditText oVisDate;
    private EditText oVisCom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_aves);

        oVisName = findViewById(R.id.idVisName);
        oVisDate = findViewById(R.id.idVisDate);
        oVisCom = findViewById(R.id.idVisCom);

    }

    public void Añadir(View v)
    {
        Avistamiento avis = new Avistamiento();
        avis.setNombreAve(oVisName.getText().toString());
        avis.setFecha(oVisDate.getText().toString());
        avis.setComentario(oVisCom.getText().toString());

        MainActivity.aAvistamientos.add(avis);
        onBackPressed();
        Toast.makeText(getApplicationContext(), "Se agregó " + avis.getNombreAve(), Toast.LENGTH_SHORT).show();
    }
}
