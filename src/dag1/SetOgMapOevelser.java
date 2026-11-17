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
 * Dag 1: Øvelser med Set og Map.
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
        // Opgave 6.1: TODO: Opret et Set<String> (HashSet) og tilføj kunstnerne ét ad gangen
        // Opgave 6.2: TODO: Brug returværdien af add() til at udskrive, når en dublet ignoreres
        // Opgave 6.3: TODO: Udskriv settet og dets størrelse. Undersøg om "ABBA" findes
    }

    // Opgave 7: TreeSet
    static void opgave7() {
        System.out.println("--- Opgave 7 ---");
        // Opgave 7.1: TODO: Gør det samme med et TreeSet. Sammenlign rækkefølgen med HashSet.
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

        // Opgave 8.1: TODO: Opret et Map<String, Integer>, der tæller hvor mange gange hver sang er afspillet
        Map<String, Integer> antal = new HashMap<>();
        for (String sang : afspillet) {
            if (antal.containsKey(sang)) {
                antal.put(sang, antal.get(sang) + 1);
            } else {
                antal.put(sang, 1);
            }
            // Kortere alternativ: antal.put(sang, antal.getOrDefault(sang, 0) + 1);
        }
        System.out.println(antal);


        // Opgave 8.2: TODO: Udskriv "<sang> er afspillet <antal> gange" for hver sang (brug keySet())
        for (String sang : antal.keySet()) {
            System.out.println(sang + " er afspillet " + antal.get(sang) + " gange");
        }

        // Opgave 8.3: TODO: Find og udskriv den mest afspillede sang
        String mestPlayed= null;
        int max=0;
        for(String sang: antal.keySet()){
            int a=antal.get(sang);
            if (a>max){
                max=a;
                mestPlayed=sang;
            }
        }
        System.out.println("most played: " + mestPlayed + " antal gange: " + max);

    }

    // Opgave 9: TreeMap
    static void opgave9() {
        System.out.println("--- Opgave 9 ---");
        // Opgave 9.1: TODO: Opret et TreeMap<String, Integer> med sangtitel -> udgivelsesår
        //       Purple Rain 1984, Hey Jude 1968, Imagine 1971, Bohemian Rhapsody 1975

        Map<String, Integer> udgivelsesaar = new TreeMap<>();
        udgivelsesaar.put("Purple Rain", 1984);
        udgivelsesaar.put("Hey Jude", 1968);
        udgivelsesaar.put("Imagine", 1971);
        udgivelsesaar.put("Bohemian Rhapsody", 1975);


        // Opgave 9.2: TODO: Udskriv det. Hvilken rækkefølge får du? Hvorfor?
        System.out.println(udgivelsesaar); // sorteret alfabetisk efter key

    }


    // hjælpemetode
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
