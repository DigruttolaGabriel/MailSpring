package com.Gabi.Mail.Models;

public class Cliente {

    private String nombre;

    private String direccion;

    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Informacion del cliente: nombre:" + this.nombre + ", direccion:" + this.direccion + ", email:" + this.email;
    }

}
