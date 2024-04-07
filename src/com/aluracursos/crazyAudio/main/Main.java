package com.aluracursos.crazyAudio.main;

import com.aluracursos.crazyAudio.interfaces.Clasification;
import com.aluracursos.crazyAudio.models.Cancion;
import com.aluracursos.crazyAudio.models.Clasificacion;
import com.aluracursos.crazyAudio.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion song = new Cancion("her ayes", 3, "bruno mars", "vibes", "pop");
        for(int i = 0; i < 5; i++){
            song.meGusta();
            song.reproducir();
        }

        Clasificacion clasificationSong = new Clasificacion(song);
        System.out.println(String.format("La clasificacion de la cancion es: %.2f", clasificationSong.getClasification()));

        Podcast learnEnglish = new Podcast("learn english", 20, "english academy", "verbo to be de cero a experto");
        for(int i = 0; i < 4; i++){
            learnEnglish.meGusta();
            learnEnglish.reproducir();
        }

        Clasificacion clasificationPodcast = new Clasificacion(song);
        System.out.println(String.format("La clasificacion del podcast es: %.2f", clasificationPodcast.getClasification()));

    }

}