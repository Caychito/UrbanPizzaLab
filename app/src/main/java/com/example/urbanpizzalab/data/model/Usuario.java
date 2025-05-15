package com.example.urbanpizzalab.data.model;

public class Usuario {

    private String nombre;
    private String apellido;
    private int dni;
    private String correo;
    private String password;
    private int id_distrito;

    public Usuario(int dni, String nombre, String apellido, String correo, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }


    public int dni() {
        return dni;
    }

    public Usuario setDni(int dni) {
        this.dni = dni;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String apellido() {
        return apellido;
    }

    public Usuario setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String correo() {
        return correo;
    }

    public Usuario setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public String password() {
        return password;
    }

    public Usuario setPassword(String password) {
        this.password = password;
        return this;
    }

    public int id_distrito() {
        return id_distrito;
    }

    public Usuario setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
        return this;
    }


}
