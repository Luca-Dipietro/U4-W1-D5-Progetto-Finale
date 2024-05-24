package entities;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    public void play() {
        String puntoEsclamativo = "";
        for (int i = 0; i < this.volume; i++) {
            puntoEsclamativo += "!";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(getTitolo() + " " + puntoEsclamativo);
        }
    }

    @Override
    public void esegui() {
        play();
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
