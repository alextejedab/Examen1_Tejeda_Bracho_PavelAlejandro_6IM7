package com.example.cecyt9.examen1_tejeda_bracho_pavelalejandro_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesos = (EditText) findViewById(R.id.txtPesos);
    }

    public void onClickConvertir(View v){
        String valor = "";
        Intent intento = new Intent(this, activity2.class);
        Bundle datos = new Bundle();
        valor = pesos.getText().toString();
        Double numPesos = Double.parseDouble(valor);
        Double resultado;
        resultado = numPesos/15;
        datos.putDouble("resultado", resultado);
        intento.putExtras(datos);
        startActivity(intento);
        finish();
    }
}
