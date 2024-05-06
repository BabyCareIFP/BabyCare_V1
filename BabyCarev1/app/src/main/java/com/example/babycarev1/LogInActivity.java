package com.example.babycarev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    //TODO boton de login

    protected ImageView imagen1;
    protected TextView label1;
    protected TextView label2;
    protected TextView label3;
    protected EditText caja1;
    protected EditText caja2;
    protected Button boton1;
    protected Button boton2;
    private Intent pasarPantalla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        imagen1 = (ImageView) findViewById(R.id.imagen1_login);
        label1 = (TextView) findViewById(R.id.label1_login);
        label2 = (TextView) findViewById(R.id.label2_login);
        label3 = (TextView) findViewById(R.id.label3_login);
        caja1 = (EditText) findViewById(R.id.caja1_login);
        caja2 = (EditText) findViewById(R.id.caja2_login);
        boton1 = (Button) findViewById(R.id.boton1_login);
        boton2 = (Button) findViewById(R.id.boton2_login);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantalla = new Intent(LogInActivity.this, RegistroActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });
    }



}