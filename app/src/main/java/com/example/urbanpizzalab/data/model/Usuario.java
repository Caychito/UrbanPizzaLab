package com.example.urbanpizzalab.data.model;

public class Usuario {
    private int ID_Usuario;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Contraseña;
    private int ID_Distrito;
    private int DNI;

    public Usuario(int ID_Usuario, String Nombre, String Apellido, String Email,
                   String Contraseña, int ID_Distrito, int DNI) {
        this.ID_Usuario = ID_Usuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Contraseña = Contraseña;
        this.ID_Distrito = ID_Distrito;
        this.DNI = DNI;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContrasenia() {
        return Contraseña;
    }

    public void setContrasenia(String contraseña) {
        Contraseña = contraseña;
    }

    public int getID_Distrito() {
        return ID_Distrito;
    }

    public void setID_Distrito(int ID_Distrito) {
        this.ID_Distrito = ID_Distrito;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
