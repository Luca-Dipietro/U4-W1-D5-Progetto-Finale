import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String titolo;
        int luminosità;
        int volume;
        int durata;

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " Elemento");
            System.out.println("Tipo( 1 -> Immagine, 2 -> Audio, 3 -> Video): ");
            int tipologia = Integer.parseInt(sc.nextLine());

            switch (tipologia) {
                case 1: {
                    System.out.println("Inserire titolo immagine: ");
                    titolo = sc.nextLine();
                    System.out.println("Luminosità: ");
                    luminosità = Integer.parseInt(sc.nextLine());
                    elementi[i] = new Immagine(titolo, luminosità);
                    break;
                }
                case 2: {
                    System.out.println("Inserire titolo audio: ");
                    titolo = sc.nextLine();
                    System.out.println("Durata: ");
                    durata = Integer.parseInt(sc.nextLine());
                    System.out.println("Volume: ");
                    volume = Integer.parseInt(sc.nextLine());
                    elementi[i] = new Audio(titolo, durata, volume);
                    break;
                }
                case 3: {
                    System.out.println("Inserire titolo video: ");
                    titolo = sc.nextLine();
                    System.out.println("Durata: ");
                    durata = Integer.parseInt(sc.nextLine());
                    System.out.println("Volume: ");
                    volume = Integer.parseInt(sc.nextLine());
                    System.out.println("Luminosità: ");
                    luminosità = sc.nextInt();
                    elementi[i] = new Video(titolo, durata, volume, luminosità);
                    break;
                }
                default:
                    System.out.println("Tipologia errata");
                    break;
            }

        }
    }
}
