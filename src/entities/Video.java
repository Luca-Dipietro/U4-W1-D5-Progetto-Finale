package entities;

import interfaces.Luminosità;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosità {
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void play() {
        String puntoEsclamativo = "";
        String asterisco = "";
        for (int i = 0; i < this.volume; i++) {
            puntoEsclamativo += "!";
        }
        for (int i = 0; i < this.luminosità; i++) {
            asterisco += "*";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(getTitolo() + " " + puntoEsclamativo + " " + asterisco);
        }
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void abbassaLuminosità() {
        if (this.luminosità > 0) {
            this.luminosità--;
        }
    }

    @Override
    public void alzaLuminosità() {
        this.luminosità++;
    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }
}
