package dag1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Dag 1: Øvelser med lister.
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
        // TODO: opgave 1.1: Opret en List<String> med navnet playliste (brug ArrayList)
        List<String> playListe = new ArrayList<>();
        playListe.add("Hey Jude");
        playListe.add("Hey Jude (Remix)");
        playListe.add("sang 2");
        playListe.add("sang3");
        playListe.add("sang4");

        // TODO: opgave 1.2: Tilføj 5 sangtitler - lad én af dem forekomme to gange
        playListe.add("sang6");
        playListe.add("sang6");
        playListe.add("lina1");

        // TODO: opgave 1.3: Udskriv listen, antal sange, den første og den sidste sang
        //System.out.println(playListe);
        //System.out.println("antal sange: "+ playListe.size());
        //System.out.println("første: " + playListe.get(0));
        //System.out.println("første: " + playListe.getFirst());
        //System.out.println("Sidste: " + playListe.getLast());

    }

    // Opgave 2: Indsæt, fjern og søg
    static void opgave2() {
        //System.out.println("--- Opgave 2 ---");
        List<String> playliste = lavPlayliste();


        // TODO: opgave 2.1: Indsæt "Imagine" på index 1 og udskriv
        playliste.add(1, "Imagine");
        //System.out.println("efter vi har tilføjet Imagine: " + playliste);

        // TODO: opgave 2.2: Fjern elementet på index 0 og udskriv
        playliste.remove(0);
        //System.out.println("efter vi har fjern elementet på index 0: "+ playliste);

        // TODO: opgave 2.3: Fjern "Purple Rain" (som objekt). Udskriv returværdien af remove
        boolean fjernet= playliste.remove("Purple Rain");
        //System.out.println("er Purple Rain fjernet?" + fjernet);
        //System.out.println(playliste);

        // TODO: opgave 2.4: Undersøg med contains() om "Imagine" findes
        //System.out.println("Indeholder Imagine? " + playliste.contains("Imagine"));

        // TODO: opgave 2.5: Find index for "Hey Jude" og for "Yesterday" med indexOf(). Hvad sker der?
        //System.out.println("Index for Hey Jude: " + playliste.indexOf("Hey Jude"));
        //System.out.println("Index for Yesterday: " + playliste.indexOf("Yesterday")); // -1
    }

    // Opgave 3: Gennemløb listen på to måder og tæl dubletter
    static void opgave3() {
        System.out.println("--- Opgave 3 ---");
        List<String> playliste = lavPlayliste();
        //Opgave 3.1: TODO: Udskriv listen nummereret (1. ..., 2. ...) med en almindelig for-løkke
        for(int i=0; i< playliste.size(); i++){
            System.out.println( (i+1)+ ". " + playliste.get(i));
        }

        //Opgave 3.2: TODO: Tæl med en for-each-løkke, hvor mange gange "Hey Jude" forekommer
        int antal=0;
        for (String sang: playliste){
            if (sang.equals("Hey Jude")){
                antal++;
            }
        }
        System.out.println("der er " + antal+ " Hey Jude.");

    }

    // Opgave 4: Programmér mod interfacet List
    static void opgave4() {
        System.out.println("--- Opgave 4 ---");
        List<String> a = new ArrayList<>();
        List<String> b = new LinkedList<>();

        // Opgave 4.3: TODO: Kald tilfoejTreSange og printPlayliste med både a og b
    }

    static void tilfoejTreSange(List<String> liste) {
        // Opgave 4.1: TODO: Tilføj tre sange til listen
    }

    static void printPlayliste(List<String> liste) {
        // Opgave 4.2: TODO: Udskriv klassens navn (liste.getClass().getSimpleName()),
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

        // Opgave 5.1: TODO a: Prøv først at fjerne remix-sange inde i en for-each-løkke.
        //         Hvad sker der? Skriv fejlens navn ned og udkommentér koden.

        /*for (String sang: playliste){ //en for each loop bruger et internet iterator når den iterarer gennem listen
            //derfor man ikke kan slet imens man iterarer
            if (sang.contains("Remix"))
                playliste.remove(sang);
        }*/


        // Opagve 5.2: TODO b: Løs det med en Iterator (hasNext(), next(), remove())

        Iterator<String> it = playliste.iterator();

        while (it.hasNext()){
            String sang =it.next();

            if (sang.contains("Remix")){
                it.remove();
            }
        }



        System.out.println(playliste);

    }

    // hjælpemetode: giver en ny playliste hver gang
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
