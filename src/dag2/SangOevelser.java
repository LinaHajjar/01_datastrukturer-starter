package dag2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Dag 2 - Egne objekter i Set og Map.
 * Udkommentér kaldene i main, efterhånden som du når til dem.
 */
public class SangOevelser {

    public static void main(String[] args) {
        testEquals();         // Opgave 1
        testHashSet();        // Opgave 2
        // testTreeSet();     // Opgave 3 - kaster en fejl, indtil Sang implementerer Comparable
        // testMapMedSang();  // Opgave 5
        // testMapAfLister(); // Opgave 6 (ekstra)
    }

    static void testEquals() {
        System.out.println("--- Opgave 1: equals ---");
        Sang a = new Sang("Imagine", "John Lennon", 183);
        Sang b = new Sang("Imagine", "John Lennon", 190);   // anden længde
        Sang c = new Sang("Imagine", "A Perfect Circle", 288);
        System.out.println("a.equals(b): " + a.equals(b) + "  (forventet true)");
        System.out.println("a.equals(c): " + a.equals(c) + "  (forventet false)");
        System.out.println("a.equals(null): " + a.equals(null) + "  (forventet false)");
    }

    static void testHashSet() {
        System.out.println("--- Opgave 2: HashSet ---");
        Set<Sang> set = new HashSet<>(lavSange());
        System.out.println("Liste: " + lavSange().size() + " sange, HashSet: " + set.size());
        for (Sang s : set) {
            System.out.println("  " + s);
        }
    }

    static void testTreeSet() {
        System.out.println("--- Opgave 3: TreeSet ---");
        Set<Sang> set = new TreeSet<>(lavSange());
        System.out.println("TreeSet: " + set.size() + " sange");
        for (Sang s : set) {
            System.out.println("  " + s);
        }
    }

    static void testMapMedSang() {
        System.out.println("--- Opgave 5: Map<Sang, Integer> ---");
        // TODO: Opret et Map<Sang, Integer> og tæl, hvor mange gange hver sang i lavSange() forekommer
        // TODO: Slå op med et NYT Sang-objekt: new Sang("Hey Jude", "The Beatles", 0)
        //       Hvorfor virker opslaget, selvom det er et andet objekt?
    }

    static void testMapAfLister() {
        System.out.println("--- Opgave 6: Map<String, List<Sang>> ---");
        // TODO (ekstra): Byg et Map fra kunstnernavn til en liste af kunstnerens sange
        // TODO: Udskriv hver kunstner med sine sange
    }

    // Udleveret testdata
    static List<Sang> lavSange() {
        List<Sang> liste = new ArrayList<>();
        liste.add(new Sang("Hey Jude", "The Beatles", 431));
        liste.add(new Sang("Imagine", "John Lennon", 183));
        liste.add(new Sang("Dancing Queen", "ABBA", 231));
        liste.add(new Sang("Hey Jude", "The Beatles", 431));        // dublet
        liste.add(new Sang("Imagine", "A Perfect Circle", 288));    // samme titel, anden kunstner
        liste.add(new Sang("Let It Be", "The Beatles", 243));
        liste.add(new Sang("Waterloo", "ABBA", 168));
        return liste;
    }
}
