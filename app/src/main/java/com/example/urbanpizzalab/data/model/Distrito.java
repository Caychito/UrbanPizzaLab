package com.example.urbanpizzalab.data.model;

public class Distrito {
    private int ID_Distrito;
    private String Nombre;

    public Distrito(int ID_Distrito, String Nombre) {
        this.ID_Distrito = ID_Distrito;
        this.Nombre = Nombre;
    }

    public Distrito(String nombre) {
        Nombre = nombre;
    }

    public int getID_Distrito() {
        return ID_Distrito;
    }

    public void setID_Distrito(int ID_Distrito) {
        this.ID_Distrito = ID_Distrito;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
