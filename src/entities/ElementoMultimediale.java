package entities;

import interfaces.Eseguibile;

public abstract class ElementoMultimediale implements Eseguibile {

    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public void play() {

    }

    @Override
    public void show() {
        
    }
}
