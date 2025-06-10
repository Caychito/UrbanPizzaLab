package com.example.urbanpizzalab.data.model;

public class MetodoPago {
    private int ID_MetodoPago;
    private String Nombre;

    public MetodoPago(int ID_MetodoPago, String Nombre) {
        this.ID_MetodoPago = ID_MetodoPago;
        this.Nombre = Nombre;
    }

    public int getID_MetodoPago() {
        return ID_MetodoPago;
    }

    public void setID_MetodoPago(int ID_MetodoPago) {
        this.ID_MetodoPago = ID_MetodoPago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
