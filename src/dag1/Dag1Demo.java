package dag1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Underviserdemo til dag 1. Køres trin for trin på storskærm.
 * Hvert afsnit svarer til et kort teorioplæg.
 */
public class Dag1Demo {

    public static void main(String[] args) {
        demoGenerics();
        demoInterfaceSomKontrakt();
        demoSet();
        demoMap();
    }

    // 1) Generics: <String> fortæller, hvilken type elementerne har.
    static void demoGenerics() {
        System.out.println("--- Generics ---");
        ArrayList<String> sange = new ArrayList<>();
        sange.add("Bohemian Rhapsody");
        sange.add("Hey Jude");
        // sange.add(42);   // Kompileringsfejl: 42 er ikke en String

        String foerste = sange.get(0); // Ingen cast nødvendig
        System.out.println("Første sang: " + foerste);

        // Primitive typer kan ikke bruges direkte: ArrayList<int> virker ikke.
        // Vi bruger wrapper-klassen Integer i stedet (autoboxing).
        ArrayList<Integer> tal = new ArrayList<>();
        tal.add(7);           // int 7 bliver automatisk til Integer
        int x = tal.get(0);   // og tilbage igen
        System.out.println("Tal: " + x);
    }

    // 2) Interface som kontrakt: List lover metoderne add, get, size ...
    //    ArrayList og LinkedList opfylder begge kontrakten på hver deres måde.
    static void demoInterfaceSomKontrakt() {
        System.out.println("--- Interface som kontrakt ---");
        List<String> a = new ArrayList<>();
        List<String> b = new LinkedList<>();
        fyldOgPrint(a);
        fyldOgPrint(b);
    }

    // Metoden kender kun kontrakten (List) - ikke den konkrete klasse.
    static void fyldOgPrint(List<String> liste) {
        liste.add("A");
        liste.add("B");
        liste.add("A"); // Lister tillader dubletter
        System.out.println(liste.getClass().getSimpleName() + ": " + liste
                + " (size=" + liste.size() + ")");
    }

    // 3) Set: ingen dubletter, intet index.
    static void demoSet() {
        System.out.println("--- Set ---");
        Set<String> kunstnere = new HashSet<>();
        System.out.println(kunstnere.add("Queen"));   // true
        System.out.println(kunstnere.add("ABBA"));    // true
        System.out.println(kunstnere.add("Queen"));   // false - findes allerede
        System.out.println(kunstnere + " size=" + kunstnere.size());
        // kunstnere.get(0);  // Findes ikke - et Set har intet index
    }

    // 4) Map: par af key -> value. Keys er unikke.
    static void demoMap() {
        System.out.println("--- Map ---");
        Map<String, Integer> afspilninger = new HashMap<>();
        afspilninger.put("Hey Jude", 3);
        afspilninger.put("Dancing Queen", 5);
        afspilninger.put("Hey Jude", 4); // Overskriver den gamle værdi
        System.out.println(afspilninger);
        System.out.println("Hey Jude: " + afspilninger.get("Hey Jude"));
        System.out.println("Ukendt: " + afspilninger.get("Ukendt")); // null
    }
}
