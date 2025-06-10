package com.example.urbanpizzalab.data.model;

public class Categoria {
    private int ID_Categoria;
    private String Nombre;

    public Categoria(int ID_Categoria, String Nombre) {
        this.ID_Categoria = ID_Categoria;
        this.Nombre = Nombre;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
