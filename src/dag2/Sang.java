package dag2;

import java.util.Objects;

/**
 * En sang. To sange er "ens", hvis de har samme titel OG samme kunstner.
 * Varigheden indgår ikke i lighed (samme sang kan findes i flere længder).
 */
public class Sang {   // Opgave 3: tilføj "implements Comparable<Sang>"

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

    // Opgave 2: Overskriv hashCode()
    //   - brug Objects.hash(...) med de SAMME felter som i equals

    // Opgave 3: Implementér compareTo(Sang anden)
    //   - sortér efter kunstner; ved samme kunstner efter titel
    //   - tip: String har selv en compareTo-metode
}
