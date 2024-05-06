package com.example.babycarev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class RegistroActivity extends AppCompatActivity {

    //TODO enviar paquetes Intent o crear objeto y clase Usuario

    //ELEMENTOS INTERFAZ
    protected TextView label1;
    protected LinearLayout layout1;
    protected TextView label2;
    protected EditText caja1;
    protected EditText caja2;
    protected EditText caja3;
    protected EditText caja4;
    protected EditText caja5;
    protected EditText caja6;
    protected EditText caja7;
    protected EditText caja8;
    protected EditText caja9;
    protected EditText caja10;
    protected EditText caja11;
    protected EditText caja12;
    protected RadioGroup radio1;
    protected RadioButton radioHombre;
    protected RadioButton radioMujer;
    protected RadioButton radioOtros;
    protected Spinner spinner1;
    protected Button boton1;

    private ArrayList<String> tiposUsuario = new ArrayList<String>();
    private ArrayAdapter<String> adaptador;

    //VARIABLES DE LOS CAMPOS
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String fechaDeNacimiento;
    private String sexo;
    private String nombreUsuario;
    private String contrasena;
    private String correoElectronico;
    private String nacionalidad;
    private String direccion;
    private Usuario usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        label1 = (TextView) findViewById(R.id.label1_registro);

        layout1 = (LinearLayout) this.findViewById(R.id.layout1_registro);

        label2 = (TextView) findViewById(R.id.label2_registro);
        caja1 = (EditText) findViewById(R.id.caja1_registro);
        caja2 = (EditText) findViewById(R.id.caja2_registro);
        caja3 = (EditText) findViewById(R.id.caja3_registro);
        caja4 = (EditText) findViewById(R.id.caja4_registro);
        caja5 = (EditText) findViewById(R.id.caja5_registro);
        caja6 = (EditText) findViewById(R.id.caja6_registro);
        caja7 = (EditText) findViewById(R.id.caja7_registro);
        caja8 = (EditText) findViewById(R.id.caja8_registro);
        caja9 = (EditText) findViewById(R.id.caja9_registro);
        caja10 = (EditText) findViewById(R.id.caja10_registro);
        caja11 = (EditText) findViewById(R.id.caja11_registro);
        caja12 = (EditText) findViewById(R.id.caja12_registro);
        radio1 = (RadioGroup) findViewById(R.id.radio1_registro);
        radioHombre = (RadioButton) findViewById(R.id.radioHombre_registro);
        radioMujer = (RadioButton) findViewById(R.id.radioMujer_registro);
        radioOtros = (RadioButton) findViewById(R.id.radioOtros_registro);
        spinner1 = (Spinner) findViewById(R.id.spinner1_registro);
        boton1 = (Button) findViewById(R.id.boton1_registro);

        tiposUsuario.add("Padre / madre / tutor");
        tiposUsuario.add("Cuidador/a / canguro");
        adaptador = new ArrayAdapter<String>(RegistroActivity.this, android.R.layout.simple_list_item_1, tiposUsuario);
        spinner1.setAdapter(adaptador);

        //Esto lo he quitado porque daba error y funciona bien sin ello
        /*layout1.addView(label2);
        layout1.addView(caja1);
        layout1.addView(caja2);
        layout1.addView(caja3);
        layout1.addView(caja4);
        layout1.addView(caja5);
        layout1.addView(caja6);
        layout1.addView(caja7);
        layout1.addView(caja8);
        layout1.addView(caja9);
        layout1.addView(caja10);
        layout1.addView(caja11);
        layout1.addView(caja12);
        layout1.addView(radio1);
        layout1.addView(spinner1);
        layout1.addView(boton1);*/

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    nombre = caja1.getText().toString();
                    apellidos = caja2.getText().toString();
                    dni = caja3.getText().toString();
                    telefono =
                    fechaDeNacimiento
                    sexo =
                    nombreUsuario =
                    contrasena
                    correoElectronico
                    nacionalidad
                    direccion
                }
            }
        });

    }
}