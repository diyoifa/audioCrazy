package com.aluracursos.crazyAudio.models;

import com.aluracursos.crazyAudio.interfaces.Clasification;

public class Podcast extends  Audio {
    private String presentador;
    private  String descripcion;

    public Podcast(String titulo, int duracion, String presentador, String descripcion) {
        super(titulo, duracion);
        this.presentador = presentador;
        this.descripcion = descripcion;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
