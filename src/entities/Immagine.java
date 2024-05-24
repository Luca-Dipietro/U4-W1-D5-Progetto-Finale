package entities;

import interfaces.Luminosità;

public class Immagine extends ElementoMultimediale implements Luminosità {

    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void show() {
        String asterisco = "";
        for (int i = 0; i < this.luminosità; i++) {
            asterisco += "*";
        }
        System.out.println(getTitolo() + " " + asterisco);
    }

    @Override
    public void esegui() {
        show();
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
}
