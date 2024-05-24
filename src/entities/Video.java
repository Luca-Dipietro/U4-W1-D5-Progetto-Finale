package entities;

public class Video extends ElementoMultimediale {
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void aumentaLuminosità() {
        this.luminosità++;
    }

    public void abbassaLuminosità() {
        if (this.luminosità > 0) {
            this.luminosità--;
        }
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
        String asterisco = "";
        for (int i = 0; i < this.durata; i++) {
            titolo += getTitolo();
        }
        for (int i = 0; i < this.volume; i++) {
            puntoEsclamativo += "!";
        }
        for (int i = 0; i < this.luminosità; i++) {
            asterisco += "*";
        }
        System.out.println(titolo + " " + puntoEsclamativo + " " + asterisco);
    }

    @Override
    public void esegui() {
        play();
    }
}
