package com.example.urbanpizzalab.data.controller;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.urbanpizzalab.data.database.bdUrban;
import com.example.urbanpizzalab.data.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoController extends bdUrban {
    private final String tProducto = "Producto";

    public ProductoController(@Nullable Context context) {
        super(context);
    }

    // Obtener todos los productos
    public List<Producto> obtenerTodos() {
        List<Producto> lista = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + tProducto, null);

        if (cursor.moveToFirst()) {
            do {
                Producto producto = new Producto(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getDouble(3),
                        cursor.getInt(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getInt(7)
                );
                lista.add(producto);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return lista;
    }

    // Obtener productos por categoría
    public List<Producto> obtenerPorCategoria(int idCategoria) {
        List<Producto> lista = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + tProducto + " WHERE ID_Categoria = ?", new String[]{String.valueOf(idCategoria)});

        if (cursor.moveToFirst()) {
            do {
                Producto producto = new Producto(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getDouble(3),
                        cursor.getInt(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getInt(7)
                );
                lista.add(producto);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return lista;
    }
}
