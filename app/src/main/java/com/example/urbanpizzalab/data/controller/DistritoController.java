package com.example.urbanpizzalab.data.controller;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.urbanpizzalab.data.database.bdUrban;
import com.example.urbanpizzalab.data.model.Distrito;

import java.util.ArrayList;

public class DistritoController extends bdUrban {
    public DistritoController(@Nullable Context context) {
        super(context);
    }
    private final String tDistrito = "Distrito";

    //Insertar un nuevo distrito
    public void insertarDistrito(Distrito distrito) {
        SQLiteDatabase db = this.getWritableDatabase();
        if (db != null) {
            db.execSQL("INSERT INTO " + tDistrito + " (Nombre) VALUES ('" + distrito.getNombre() + "')");
            db.close();
        }
    }

    //Listar todos los distritos (para un Spinner)
    public ArrayList<Distrito> listarDistritos() {
        ArrayList<Distrito> lista = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + tDistrito, null);

        if (cursor.moveToFirst()) {
            do {
                Distrito d = new Distrito(
                        cursor.getInt(0),
                        cursor.getString(1)
                );
                lista.add(d);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return lista;
    }
}
