# Opgaver: Datastrukturer i Java
---

## Øvelse 1: Opret, indsæt og fjern i en ArrayList

**Fil:** `src/dag1/ListeOevelser.java`
**Metoder:** `opgave1()`, `opgave2()`

**Nye metoder i opgaven**

| Metode | Betydning |
|---|---|
| `add(i, e)` | Indsætter `e` på plads `i` |
| `indexOf(e)` | Finder elementets index |

### Opgave 1: Opret og udskriv en playliste

1. Opret en `List<String>` med navnet `playliste` (brug `ArrayList`).
2. Tilføj 5 sangtitler. Lad én af dem forekomme to gange.
3. Udskriv listen, antal sange, den første og den sidste sang.

### Opgave 2: Indsæt, fjern og søg

Brug listen fra `lavPlayliste()`.

1. Indsæt `"Imagine"` på index 1, og udskriv listen.
2. Fjern elementet på index 0, og udskriv listen.
3. Fjern `"Purple Rain"` som objekt. Udskriv returværdien af `remove`.
4. Undersøg med `contains()`, om `"Imagine"` findes.
5. Find index for `"Hey Jude"` og `"Yesterday"` med `indexOf()`. Hvad sker der?

---

## Øvelse 2: Gennemløb listen og fjern sikkert

**Fil:** `src/dag1/ListeOevelser.java`
**Metoder:** `opgave3()`, `opgave5()`

**Nyt begreb: Iterator**

En Iterator går gennem listen ét element ad gangen.

| Metode | Betydning |
|---|---|
| `hasNext()` | Er der flere elementer? |
| `next()` | Hent det næste element |
| `remove()` | Fjern det sidst hentede element |

### Opgave 3: Gennemløb listen på to måder

1. Udskriv listen nummereret (`1. …`, `2. …`) med en almindelig for-løkke og `get(i)`.
2. Tæl med en for-each-løkke, hvor mange gange `"Hey Jude"` forekommer.

### Opgave 5: Fjern alle remix-versioner

1. Prøv først at fjerne sange, der indeholder `"Remix"`, inde i en for-each-løkke. Hvad sker der? Skriv fejlens navn ned, og udkommentér koden.
2. Løs det med en Iterator: `hasNext()`, `next()` og `remove()`.

> Tip: `sang.contains("Remix")` undersøger, om teksten indgår i titlen.

---

## Øvelse 3: Tæl afspilninger med et HashMap

**Fil:** `src/dag1/SetOgMapOevelser.java`
**Metoder:** `opgave8()`, `opgave9()`

**Nyt i opgaven**

| Metode / klasse | Betydning |
|---|---|
| `containsKey(k)` | Findes nøglen allerede? |
| `keySet()` | Alle nøgler – kan gennemløbes med for-each |
| `TreeMap` | Et Map, der holder nøglerne sorteret |

### Opgave 8: Tæl afspilninger

1. Opret et `Map<String, Integer>`, der tæller, hvor mange gange hver sang i listen `afspillet` forekommer.
   > Tænk først: Hvad skal der ske, første gang du ser en sang? Og næste gang?
2. Udskriv `"<sang> er afspillet <antal> gange"` for hver sang (brug `keySet()`).
3. Find og udskriv den mest afspillede sang.

### Opgave 9: TreeMap

1. Opret et `TreeMap<String, Integer>` med sangtitel → udgivelsesår:
   Purple Rain 1984, Hey Jude 1968, Imagine 1971, Bohemian Rhapsody 1975.
2. Udskriv det. Hvilken rækkefølge får du? Hvorfor?

---

## Øvelse 4: Find de unikke kunstnere

**Fil:** `src/dag1/SetOgMapOevelser.java`
**Metoder:** `opgave6()`, `opgave7()`

**Nyt i opgaven:** `TreeSet` er et Set, der holder elementerne sorteret.

### Opgave 6: Unikke kunstnere med HashSet

1. Opret et `Set<String>` (`HashSet`), og tilføj kunstnerne fra `kunstnerListe` ét ad gangen.
2. Brug returværdien af `add()` til at udskrive, når en dublet ignoreres.
3. Udskriv settet og dets størrelse. Undersøg, om `"ABBA"` findes.

### Opgave 7: TreeSet

1. Gør det samme med et `TreeSet`. Sammenlign rækkefølgen med `HashSet`.

> Tip: `new TreeSet<>(lavKunstnerListe())` laver et TreeSet ud fra en liste.

---

## Øvelse 5: Programmér mod interfacet List

*Efter slide 14: List, Set og Map er interfaces*

**Fil:** `src/dag1/ListeOevelser.java`
**Metoder:** `opgave4()`, `tilfoejTreSange(List<String> liste)`, `printPlayliste(List<String> liste)`

> Husk: Parameteren har typen `List`, ikke `ArrayList` eller `LinkedList`.

### Opgave 4: Samme metoder, to klasser

1. Udfyld `tilfoejTreSange`: Tilføj tre sange til listen.
2. Udfyld `printPlayliste`: Udskriv klassens navn med `liste.getClass().getSimpleName()`, antal sange og selve listen.
3. I `opgave4()`: Kald begge metoder med både `a` (`ArrayList`) og `b` (`LinkedList`).

### Refleksion

1. Hvorfor kan de samme metoder bruges med begge klasser?
2. Hvad skulle du ændre, hvis parameteren havde typen `ArrayList<String>`?
