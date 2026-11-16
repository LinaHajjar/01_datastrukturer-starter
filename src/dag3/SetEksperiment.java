package dag3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Dag 3 - Performance-eksperiment: contains() i ArrayList, HashSet og TreeSet.
 * Udleveret - skal ikke ændres. Kør og analysér.
 *
 * Collection er et fælles interface for både List og Set, så én metode
 * kan måle alle tre klasser.
 */
public class SetEksperiment {

    static final int[] STOERRELSER = {10_000, 20_000, 40_000, 80_000, 160_000};
    static long sink = 0;

    public static void main(String[] args) {
        System.out.println("Opvarmning ...");
        koerAlle(false);
        koerAlle(true);
    }

    static void koerAlle(boolean udskriv) {
        if (udskriv) {
            System.out.printf("%8s %14s %12s %12s%n", "n", "ArrayList ns", "HashSet ns", "TreeSet ns");
        }
        for (int n : STOERRELSER) {
            // ArrayList er meget langsommere, så den får færre gentagelser
            double liste = maalContains(new ArrayList<>(), n, 500);
            double hash = maalContains(new HashSet<>(), n, 100_000);
            double tree = maalContains(new TreeSet<>(), n, 100_000);
            if (udskriv) {
                System.out.printf("%8d %14.1f %12.1f %12.1f%n", n, liste, hash, tree);
            }
        }
    }

    static double maalContains(Collection<Integer> samling, int n, int gentagelser) {
        for (int i = 0; i < n; i++) {
            samling.add(i);
        }
        Random rnd = new Random(42); // fast seed -> samme "tilfældige" tal hver gang
        long start = System.nanoTime();
        for (int r = 0; r < gentagelser; r++) {
            if (samling.contains(rnd.nextInt(2 * n))) { // ca. halvdelen findes
                sink++;
            }
        }
        long slut = System.nanoTime();
        return (double) (slut - start) / gentagelser;
    }
}
