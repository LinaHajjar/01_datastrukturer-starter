# Opgaver dag 2: Egne objekter i Set og Map
---

**Efter i dag kan du** få dine egne klasser til at virke korrekt i `HashSet`, `HashMap` og `TreeSet`.

Du arbejder i `src/dag2/Sang.java` og `src/dag2/SangOevelser.java`. I `main` er nogle kald kommenteret ud. Fjern kommentaren, når du når til den opgave. Kør programmet efter hver opgave.

**Nye begreber**

| Begreb | Betydning |
|---|---|
| `equals(Object o)` | Afgør, om to objekter er ens. Alle klasser arver den fra `Object`, men den arvede version svarer til `==` |
| `hashCode()` | Et heltal, som `HashSet` og `HashMap` bruger til at finde den rigtige "skuffe". To objekter, der er ens ifølge `equals`, **skal** have samme `hashCode` |
| `Comparable<T>` | Et interface med én metode, `compareTo(T anden)`. `TreeSet` og `TreeMap` bruger den til at sortere |

---

## Øvelse 1: equals og hashCode

**Fil:** `src/dag2/Sang.java` (test i `SangOevelser.java`)
**Metoder:** `equals(Object o)`, `hashCode()`

### Opgave 1: equals

To sange er ens, hvis de har samme titel **og** samme kunstner. Varigheden tæller ikke med.

Overskriv `equals(Object o)` i `Sang`:

1. Returnér `true`, hvis `o` er samme objekt som `this`.
2. Returnér `false`, hvis `o` er `null` eller af en anden klasse (`getClass() != o.getClass()`).
3. Cast ellers `o` til `Sang`, og sammenlign titel og kunstner med `equals`.

Kør `testEquals()`, og tjek, at de tre linjer passer med det forventede. Kør derefter `testHashSet()`.

> Tjek: Listen har 7 sange, hvoraf én er en dublet. Hvor mange sange er der i dit `HashSet`? Er det, hvad du forventede?

### Opgave 2: hashCode

1. Overskriv `hashCode()`. Brug `Objects.hash(...)` med de **samme felter** som i `equals`.
2. Kør `testHashSet()` igen.

> Tjek: Forklar med dine egne ord, hvorfor `HashSet` først virkede, da du tilføjede `hashCode()`.

---

## Øvelse 2: Sortér sange med compareTo

**Fil:** `src/dag2/Sang.java` (test i `SangOevelser.java`)
**Metode:** `compareTo(Sang anden)`

**Nyt i opgaven**

| `compareTo` returnerer | Betydning |
|---|---|
| Et negativt tal | `this` skal stå **før** `anden` |
| `0` | De er ens |
| Et positivt tal | `this` skal stå **efter** `anden` |

### Opgave 3: compareTo

1. Fjern kommentaren foran `testTreeSet()` i `main`, og kør programmet. Hvilken fejl får du?
2. Skriv `implements Comparable<Sang>` efter klassenavnet i `Sang`.
3. Implementér `compareTo(Sang anden)`: Sortér efter kunstner, og ved samme kunstner efter titel.
4. Kør programmet igen.

> Tip: `String` har selv en `compareTo`-metode.

### Opgave 4: Eksperiment – hvor blev sangen af?

Ændr midlertidigt `compareTo`, så den **kun** sammenligner titel. Kør `testTreeSet()`.

1. Hvor mange sange er der nu i dit `TreeSet`? Hvor mange er der i dit `HashSet`?
2. Hvilken sang mangler, og hvorfor?
3. Hvilken metode bruger `TreeSet` til at afgøre, om to sange er ens?

Sæt `compareTo` tilbage til din løsning fra opgave 3, når du er færdig.

---

## Øvelse 3: Sang som nøgle i et Map

**Fil:** `src/dag2/SangOevelser.java`
**Metoder:** `testMapMedSang()`, `testMapAfLister()`

### Opgave 5: Sang som key

1. Fjern kommentaren foran `testMapMedSang()` i `main`.
2. Opret et `Map<Sang, Integer>`, og tæl, hvor mange gange hver sang i `lavSange()` forekommer (samme mønster som dag 1, opgave 8).
3. Slå derefter op med et **nyt** objekt: `new Sang("Hey Jude", "The Beatles", 0)`.

> Tjek: Hvorfor finder opslaget sangen, selvom det er et andet objekt med en anden varighed?

### Opgave 6 (ekstra): Map af lister

1. Fjern kommentaren foran `testMapAfLister()` i `main`.
2. Byg et `Map<String, List<Sang>>` fra kunstnernavn til en liste af kunstnerens sange.
   > Har en kunstner endnu ingen liste, skal du oprette en ny `ArrayList` og lægge den i mappet, før du tilføjer sangen.
3. Udskriv hver kunstner med sine sange.
