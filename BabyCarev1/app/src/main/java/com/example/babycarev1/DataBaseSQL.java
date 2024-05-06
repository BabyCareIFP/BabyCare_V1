package com.example.babycarev1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseSQL extends SQLiteOpenHelper {

    /*TODO propagar foraneas idUsuario a tutores y cuidadores
      TODO Como almacenamos el array de hijos

     */


    protected SQLiteDatabase db;

    //CONSTRUCTOR
    public DataBaseSQL(Context context) {
        super(context, "babycareDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE table usuarios (idUsuario integer primary key autoincrement not null, nombre text, apellidos text, dni text, telefono text, edad integer (3), sexo text, nombreUsuario text, contrasena text, correo text, nacionalidad text, direccion text)");
        /*db.execSQL("CREATE table tutores (idTutor integer primary key autoincrement not null, numeroHijos integer, hijos text)");
        db.execSQL("CREATE table cuidadores (idCuidador integer primary key autoincrement not null, experiencia text, disponibilidad)");
        db.execSQL("CREATE table hijos (idHijo integer primary key autoincrement not null, nota text)");
        db.execSQL("CREATE table reservas (idReserva integer primary key autoincrement not null, nota text)");*/

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
