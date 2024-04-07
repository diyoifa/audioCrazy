package com.aluracursos.crazyAudio.models;

import com.aluracursos.crazyAudio.interfaces.Clasification;

public class Clasificacion implements Clasification {
    private Audio audio;

    public Clasificacion(Audio audio) {
        this.audio = audio;
    }

    @Override
    public float getClasification() {
        return (float) ((this.audio.getMeGustas() > 5 && this.audio.getTotalDeReproducciones() > 5) ? 5.0: 3.5);
    }
}
