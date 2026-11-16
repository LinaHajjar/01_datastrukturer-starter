package ugeopgave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Ugeopgave: Tekstanalyse.
 * Se opgavebeskrivelsen. Husk den skriftlige refleksion (Del 7).
 */
public class Tekstanalyse {

    static final String TEKST =
            "En datastruktur er en måde at organisere data på. "
            + "Nogle datastrukturer er gode til at finde data hurtigt, "
            + "andre er gode til at holde data i en bestemt rækkefølge. "
            + "En liste husker rækkefølgen og tillader dubletter. "
            + "Et set tillader ikke dubletter, og et map gemmer par af nøgler og værdier. "
            + "Når vi vælger en datastruktur, spørger vi først: hvilke egenskaber har vi brug for? "
            + "Dernæst spørger vi: hvilke operationer skal være hurtige? "
            + "Det er ikke altid den samme datastruktur, der er bedst. "
            + "Det afhænger af data, og det afhænger af hvad vi vil gøre med data.";

    public static void main(String[] args) {
        // Del 0 (udleveret): opdel teksten i ord med små bogstaver.
        // split deler teksten ved alt, der ikke er et bogstav (a-z, æ, ø, å).
        String[] ordArray = TEKST.toLowerCase().split("[^a-zæøå]+");

        // Del 1: Gem alle ord i rækkefølge i en passende datastruktur (spring tomme strenge over).
        //        Udskriv antal ord i alt og de første 5 ord.

        // Del 2: Find antallet af unikke ord.

        // Del 3: Find det første og det sidste ord i alfabetisk rækkefølge.

        // Del 4: Tæl hvor mange gange hvert ord forekommer.
        //        Udskriv det hyppigste ord, og hvor mange gange "data" forekommer.

        // Del 5: Udskriv alle ord, der forekommer mindst 3 gange - i alfabetisk rækkefølge.

        // Del 6 (ekstra): Gruppér de unikke ord efter længde, sorteret efter længde.
        //        Fx  2: [af, at, en, ...]   3: [den, der, ...]
    }
}
