package entities;

public class Audio extends ElementoMultimediale {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void alzaVolume() {
        this.volume++;
    }

    public void play() {
        String puntoEsclamativo = "";
        String titolo = "";
        for (int i = 0; i < this.durata; i++) {
            titolo += getTitolo();
        }
        for (int i = 0; i < this.volume; i++) {
            puntoEsclamativo += "!";
        }
        System.out.println(titolo + " " + puntoEsclamativo);
    }

    @Override
    public void esegui() {
        play();
    }
}
