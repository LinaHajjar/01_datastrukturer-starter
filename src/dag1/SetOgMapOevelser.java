package dag1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Dag 1 - Øvelser med Set og Map.
 * Se opgavebeskrivelsen for detaljer.
 */
public class SetOgMapOevelser {

    public static void main(String[] args) {
        opgave6();
        opgave7();
        opgave8();
        opgave9();
    }

    // Opgave 6: Find de unikke kunstnere med et HashSet
    static void opgave6() {
        System.out.println("--- Opgave 6 ---");
        List<String> kunstnerListe = lavKunstnerListe();
        System.out.println("Liste (" + kunstnerListe.size() + "): " + kunstnerListe);
        // TODO: Opret et Set<String> (HashSet) og tilføj kunstnerne ét ad gangen
        // TODO: Brug returværdien af add() til at udskrive, når en dublet ignoreres
        // TODO: Udskriv settet og dets størrelse. Undersøg om "ABBA" findes
    }

    // Opgave 7: TreeSet
    static void opgave7() {
        System.out.println("--- Opgave 7 ---");
        // TODO: Gør det samme med et TreeSet. Sammenlign rækkefølgen med HashSet.
        // Tip: new TreeSet<>(lavKunstnerListe()) laver et TreeSet ud fra en liste
    }

    // Opgave 8: Tæl afspilninger med et HashMap
    static void opgave8() {
        System.out.println("--- Opgave 8 ---");
        List<String> afspillet = new ArrayList<>();
        afspillet.add("Hey Jude");
        afspillet.add("Imagine");
        afspillet.add("Hey Jude");
        afspillet.add("Purple Rain");
        afspillet.add("Hey Jude");
        afspillet.add("Imagine");

        // TODO: Opret et Map<String, Integer>, der tæller hvor mange gange hver sang er afspillet
        // TODO: Udskriv "<sang> er afspillet <antal> gange" for hver sang (brug keySet())
        // TODO: Find og udskriv den mest afspillede sang
    }

    // Opgave 9: TreeMap
    static void opgave9() {
        System.out.println("--- Opgave 9 ---");
        // TODO: Opret et TreeMap<String, Integer> med sangtitel -> udgivelsesår
        //       Purple Rain 1984, Hey Jude 1968, Imagine 1971, Bohemian Rhapsody 1975
        // TODO: Udskriv det. Hvilken rækkefølge får du? Hvorfor?
    }

    // Udleveret hjælpemetode
    static List<String> lavKunstnerListe() {
        List<String> liste = new ArrayList<>();
        liste.add("Queen");
        liste.add("ABBA");
        liste.add("The Beatles");
        liste.add("Queen");
        liste.add("Prince");
        liste.add("ABBA");
        liste.add("Aqua");
        return liste;
    }
}
