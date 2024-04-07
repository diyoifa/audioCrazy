package com.aluracursos.crazyAudio.models;

import com.aluracursos.crazyAudio.interfaces.Clasification;

public class Cancion extends Audio  {
    private String cantante;
    private  String album;
    private  String genero;

    public Cancion(String titulo, int duracion, String cantante, String album, String genero) {
        super(titulo, duracion);
        this.cantante = cantante;
        this.album = album;
        this.genero = genero;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
