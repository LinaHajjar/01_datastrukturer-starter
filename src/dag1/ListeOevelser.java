package dag1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Dag 1 - Øvelser med lister.
 * Løs én opgave ad gangen og kør programmet efter hver opgave.
 * Se opgavebeskrivelsen for detaljer.
 */
public class ListeOevelser {

    public static void main(String[] args) {
        opgave1();
        opgave2();
        opgave3();
        opgave4();
        opgave5();
    }

    // Opgave 1: Opret og udskriv en playliste
    static void opgave1() {
        System.out.println("--- Opgave 1 ---");
        // TODO: Opret en List<String> med navnet playliste (brug ArrayList)
        // TODO: Tilføj 5 sangtitler - lad én af dem forekomme to gange
        // TODO: Udskriv listen, antal sange, den første og den sidste sang
    }

    // Opgave 2: Indsæt, fjern og søg
    static void opgave2() {
        System.out.println("--- Opgave 2 ---");
        List<String> playliste = lavPlayliste();
        // TODO: Indsæt "Imagine" på index 1 og udskriv
        // TODO: Fjern elementet på index 0 og udskriv
        // TODO: Fjern "Purple Rain" (som objekt). Udskriv returværdien af remove
        // TODO: Undersøg med contains() om "Imagine" findes
        // TODO: Find index for "Hey Jude" og for "Yesterday" med indexOf(). Hvad sker der?
    }

    // Opgave 3: Gennemløb listen på to måder og tæl dubletter
    static void opgave3() {
        System.out.println("--- Opgave 3 ---");
        List<String> playliste = lavPlayliste();
        // TODO: Udskriv listen nummereret (1. ..., 2. ...) med en almindelig for-løkke
        // TODO: Tæl med en for-each-løkke, hvor mange gange "Hey Jude" forekommer
    }

    // Opgave 4: Programmér mod interfacet List
    static void opgave4() {
        System.out.println("--- Opgave 4 ---");
        List<String> a = new ArrayList<>();
        List<String> b = new LinkedList<>();
        // TODO: Kald tilfoejTreSange og printPlayliste med både a og b
    }

    static void tilfoejTreSange(List<String> liste) {
        // TODO: Tilføj tre sange til listen
    }

    static void printPlayliste(List<String> liste) {
        // TODO: Udskriv klassens navn (liste.getClass().getSimpleName()),
        //       antal sange og selve listen
    }

    // Opgave 5: Fjern alle remix-versioner
    static void opgave5() {
        System.out.println("--- Opgave 5 ---");
        List<String> playliste = new ArrayList<>();
        playliste.add("Hey Jude");
        playliste.add("Hey Jude (Remix)");
        playliste.add("Imagine");
        playliste.add("Imagine (Remix)");
        playliste.add("Purple Rain");

        // TODO a: Prøv først at fjerne remix-sange inde i en for-each-løkke.
        //         Hvad sker der? Skriv fejlens navn ned og udkommentér koden.
        // TODO b: Løs det med en Iterator (hasNext(), next(), remove())

        System.out.println(playliste);
    }

    // Udleveret hjælpemetode - giver en ny playliste hver gang
    static List<String> lavPlayliste() {
        List<String> liste = new ArrayList<>();
        liste.add("Hey Jude");
        liste.add("Dancing Queen");
        liste.add("Bohemian Rhapsody");
        liste.add("Purple Rain");
        liste.add("Hey Jude");
        return liste;
    }
}
