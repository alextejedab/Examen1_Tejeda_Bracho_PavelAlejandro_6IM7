package com.example.cecyt9.examen1_tejeda_bracho_pavelalejandro_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    TextView dato;
    String texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Bundle datos = getIntent().getExtras();
        Double resultado = datos.getDouble("resultado");
        texto = resultado.toString();
        dato = (TextView) findViewById(R.id.res);
        dato.setText("Nombre: Tejeda Bracho Pavel Alejandro, RESULTADO: $" + texto);
    }

    public void btnEnviar(View v){
        Intent envia = new Intent(Intent.ACTION_SEND);
        envia.setType("text/html");
        envia.putExtra(Intent.EXTRA_EMAIL, "eoropezag@ipn.mx");
        envia.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        envia.putExtra(Intent.EXTRA_TEXT, "Nombre: Tejeda Bracho Pavel Alejandro, RESULTADO: $" + texto);
        startActivity(Intent.createChooser(envia, "Send Email"));
    }
}
