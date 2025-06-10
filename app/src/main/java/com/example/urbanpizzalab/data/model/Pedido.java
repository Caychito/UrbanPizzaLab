package com.example.urbanpizzalab.data.model;

import java.util.Date;

public class Pedido {
    private int ID_Pedido;
    private int ID_Usuario;
    private Date Fecha;
    private String Estado;
    private int ID_MetodoPago;

    public Pedido(int ID_Pedido, int ID_Usuario, Date Fecha, String Estado, int ID_MetodoPago) {
        this.ID_Pedido = ID_Pedido;
        this.ID_Usuario = ID_Usuario;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.ID_MetodoPago = ID_MetodoPago;
    }

    public int getID_Pedido() {
        return ID_Pedido;
    }

    public void setID_Pedido(int ID_Pedido) {
        this.ID_Pedido = ID_Pedido;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getID_MetodoPago() {
        return ID_MetodoPago;
    }

    public void setID_MetodoPago(int ID_MetodoPago) {
        this.ID_MetodoPago = ID_MetodoPago;
    }
}
