package com.example.listaprecios;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Genero;
    private String Nacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String genero, String nacimiento) {
        Nombre = nombre;
        Apellido = apellido;
        Genero = genero;
        Nacimiento = nacimiento;
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

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        Nacimiento = nacimiento;
    }
}
