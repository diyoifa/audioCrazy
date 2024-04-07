package com.aluracursos.crazyAudio.models;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGustas;

    public Audio(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public void meGusta(){
        this.meGustas ++;
    }

    public  void reproducir(){
        this.totalDeReproducciones ++;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public int getDuration() {
        return duracion;
    }

    public void setDuration(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGustas() {
        return meGustas;
    }

    public void setMeGustas(int meGustas) {
        this.meGustas = meGustas;
    }


}
