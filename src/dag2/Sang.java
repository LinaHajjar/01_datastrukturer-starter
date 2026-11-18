package dag2;

import java.util.Comparator;
import java.util.Objects;

/**
 * En sang. To sange er "ens", hvis de har samme titel OG samme kunstner.
 * Varigheden indgår ikke i lighed (samme sang kan findes i flere længder).
 */
public class Sang implements Comparable<Sang> {   // Opgave 3: tilføj "implements Comparable<Sang>"

    private String titel;
    private String kunstner;
    private int varighedSekunder;

    public Sang(String titel, String kunstner, int varighedSekunder) {
        this.titel = titel;
        this.kunstner = kunstner;
        this.varighedSekunder = varighedSekunder;
    }

    public String getTitel() {
        return titel;
    }

    public String getKunstner() {
        return kunstner;
    }

    public int getVarighedSekunder() {
        return varighedSekunder;
    }

    @Override
    public String toString() {
        return titel + " (" + kunstner + ", " + varighedSekunder + " s)";
    }

    // Opgave 1: Overskriv equals(Object o)
    //   - returnér true, hvis o er samme objekt som this
    //   - returnér false, hvis o er null eller af en anden klasse
    //   - ellers: cast o til Sang og sammenlign titel og kunstner

    public boolean equals(Object o) {
        // Opgave 1.1: Samme objekt -> true
        if (this == o) {
            return true;
        }

        // Opgave 1.2: null eller anden klasse -> false
        if (o == null || getClass() != o.getClass()) { //Er o tomt, eller, Er o en anden slags ting end mig?
            return false;
        }

        Sang anden = (Sang) o;
        return titel.equals(anden.titel) && kunstner.equals(anden.kunstner);

    }


    // Opgave 2: Overskriv hashCode()
    //   - brug Objects.hash(...) med de SAMME felter som i equals

    @Override
    public int hashCode() {
        return Objects.hash(titel, kunstner);
    }

    // Opgave 3: Implementér compareTo(Sang anden)
    //   - sortér efter kunstner; ved samme kunstner efter titel
    //   - tip: String har selv en compareTo-metode

    public int compareTo(Sang anden) {
        // Opgave 3.3: Sortér efter kunstner, ved samme kunstner efter titel
        int resultat = kunstner.compareTo(anden.kunstner);
        if (resultat != 0) {
            return resultat;
        }
        return titel.compareTo(anden.titel);
    }

    /*public int compareTo(Sang anden) {
        return titel.compareTo(anden.titel);
    }*/


}
