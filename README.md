# En maven minitutorial

### Det som trengs

- [Git] [git-home] (kun nødvendig om du ønsker å hente ned koden)
- [Java] [java-home] 1.5 eller nyere.
- [Maven] [maven-home], følg installasjonsbeskrivelsen på nedlastingssiden.

### Advarsel
<pre>
<strong>
Koden i denne tutorialen er demokode og følger ikke nødvendigvis best practice.
Den er ikke ment for bruk i produksjon.
</strong>
</pre>

### [steg-0: Opprett prosjekt] [step-0]
Oppretting av prosjekt på kommandolinja.

Et løsningsforslag finnes i fila losningsforslag-steg-0.md

### steg-1: Oppdater avhengighet
- Oppdater testavhengigheten (JUnit) til siste versjon. Søk kan gjøres i [The Central Repository] [maven-search-repo]
- Oppdater syntaks for testen til å bruke JUnit 4.x syntaks. Det blir da mindre boilerplatekode i testen.

Sjekk at testen fortsatt fungerer ved å kjøre testen på nytt med `mvn clean test`

Et løsningsforslag finnes i fila losningsforslag-steg-1.md

### [steg-2: Multimodulprosjekt] [step-2]
Endre prosjektet til et multimodulprosjekt for gjenbruk av kode.

### [steg-3: Ekskludering av tester og byggprofiler] [step-3]
Ekskludering av trege tester fra standard bygg, og tilrettelegge for at alle testene kjøres på byggserver ved hjelp av byggprofiler.


[git-home]: http://git-scm.com/
[java-home]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-home]: http://maven.apache.org/
[maven-search-repo]: http://search.maven.org/

[step-0]: https://github.com/mesan/mesanin-maven/tree/step-0
[step-1]: https://github.com/mesan/mesanin-maven/tree/step-1
[step-2]: https://github.com/mesan/mesanin-maven/tree/step-2
[step-3]: https://github.com/mesan/mesanin-maven/tree/step-3