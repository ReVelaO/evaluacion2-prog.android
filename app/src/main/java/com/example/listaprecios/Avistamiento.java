package com.example.listaprecios;

import java.io.Serializable;

public class Avistamiento implements Serializable, Comparable<Avistamiento> {
    private String NombreAve;
    private String Fecha;
    private String Comentario;

    public Avistamiento() {
    }

    public Avistamiento(String nombreAve, String fecha, String comentario) {
        NombreAve = nombreAve;
        Fecha = fecha;
        Comentario = comentario;
    }

    public String getNombreAve() {
        return NombreAve;
    }

    public void setNombreAve(String nombreAve) {
        NombreAve = nombreAve;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public int compareTo(Avistamiento o)
    {
        return getFecha().compareTo(o.getFecha());
    }
}
