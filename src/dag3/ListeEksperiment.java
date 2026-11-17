package dag3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Dag 3 - Performance-eksperiment: ArrayList vs. LinkedList.
 *
 * Princip: Vi fylder en liste med n elementer og måler, hvor lang tid
 * GENTAGELSER udførelser af én operation tager. Vi dividerer med antallet
 * af gentagelser og får tiden pr. operation i nanosekunder (ns).
 *
 * Vigtigt: Tallene er støjfyldte (JIT-oversætter, garbage collector, andre
 * programmer). Kig efter TENDENSEN, når n fordobles - ikke på det præcise tal.
 */
public class ListeEksperiment {

    static final int GENTAGELSER = 1000;
    static final int[] STOERRELSER = {10_000, 20_000, 40_000, 80_000};

    // Resultater lægges her, så JVM'en ikke optimerer vores løkker væk.
    static long sink = 0;

    public static void main(String[] args) {
        System.out.println("Opvarmning ...");
        koerAlle(false);   // første runde kasseres (JVM'en "varmer op")
        koerAlle(true);
    }

    static void koerAlle(boolean udskriv) {
        if (udskriv) {
            System.out.printf("%-14s %8s %14s %14s%n", "Operation", "n", "ArrayList ns", "LinkedList ns");
        }
        for (int n : STOERRELSER) {
            raekke(udskriv, "add(e)", n, maalAddSidst(new ArrayList<>(), n), maalAddSidst(new LinkedList<>(), n));
            raekke(udskriv, "add(0, e)", n, maalAddForrest(new ArrayList<>(), n), maalAddForrest(new LinkedList<>(), n));
            raekke(udskriv, "get(n/2)", n, maalGetMidten(new ArrayList<>(), n), maalGetMidten(new LinkedList<>(), n));
            raekke(udskriv, "contains", n, maalContains(new ArrayList<>(), n), maalContains(new LinkedList<>(), n));
            raekke(udskriv, "remove(0)", n, maalRemoveForrest(new ArrayList<>(), n), maalRemoveForrest(new LinkedList<>(), n));
        }
    }

    static void raekke(boolean udskriv, String operation, int n, double arrayNs, double linkedNs) {
        if (udskriv) {
            System.out.printf("%-14s %8d %14.1f %14.1f%n", operation, n, arrayNs, linkedNs);
        }
    }

    // Fylder listen med tallene 0, 1, ..., n-1
    static void fyld(List<Integer> liste, int n) {
        for (int i = 0; i < n; i++) {
            liste.add(i);
        }
    }

    // MODELEKSEMPEL (udleveret): opslag midt i listen
    static double maalGetMidten(List<Integer> liste, int n) {
        fyld(liste, n);
        long start = System.nanoTime();
        for (int r = 0; r < GENTAGELSER; r++) {
            sink += liste.get(n / 2);
        }
        long slut = System.nanoTime();
        return (double) (slut - start) / GENTAGELSER;
    }

    // MODELEKSEMPEL (udleveret): indsæt sidst
    static double maalAddSidst(List<Integer> liste, int n) {
        fyld(liste, n);
        long start = System.nanoTime();
        for (int r = 0; r < GENTAGELSER; r++) {
            liste.add(r);
        }
        long slut = System.nanoTime();
        return (double) (slut - start) / GENTAGELSER;
    }

    static double maalAddForrest(List<Integer> liste, int n) {
        fyld(liste, n);
        // TODO: Mål liste.add(0, r) GENTAGELSER gange og returnér ns pr. operation.
        //       Følg mønsteret fra maalGetMidten.
        return 0;
    }

    // Søger efter et tal, der IKKE findes -> hele listen gennemløbes (værste tilfælde)
    static double maalContains(List<Integer> liste, int n) {
        fyld(liste, n);
        // TODO: Mål liste.contains(-1) GENTAGELSER gange. Læg 1 til sink, hvis den returnerer true.
        //       Følg mønsteret fra maalGetMidten.
        return 0;
    }

    static double maalRemoveForrest(List<Integer> liste, int n) {
        fyld(liste, n);
        // TODO: Mål liste.remove(0) GENTAGELSER gange. Læg returværdien til sink.
        //       Følg mønsteret fra maalGetMidten.
        return 0;
    }
}
