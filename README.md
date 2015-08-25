# En maven minitutorial

### Det som trengs

- [Git] [git-home] (kun nødvendig om du ønsker å hente ned koden)
- [Java JDK] [java-home] 7 eller nyere.
- [Maven] [maven-home] må være installert.

### Advarsel
<pre>
<strong>
Koden i denne tutorialen er demokode og følger ikke nødvendigvis best practice.
Den er ikke ment for bruk i produksjon.
</strong>
</pre>

### [steg-0: Opprett prosjekt] [step-0]
Oppretting av prosjekt på kommandolinja.

### [steg-1: Oppdater avhengighet] [step-1]
Oppdatering av testavhengighet og tilpasning av testkode.

### [steg-2: Multimodulprosjekt] [step-2]
Endre prosjektet til et multimodulprosjekt for gjenbruk av kode.

### [steg-3: Ekskludering av tester og byggprofiler] [step-3]
Ekskludering av trege tester fra standard bygg, og tilrettelegge for at alle testene kjøres på byggserver ved hjelp av en byggprofil.

### [steg-4: Filtrering av ressurser] [step-4] 
Legge til versjonsnummer i JSP-siden ved hjelp av filtrering av ressurser.

### steg-5: Uber-jar
Synes du det virket unødvendig komplisert å måtte bygge opp classpath-en for hånd for å kjøre applikasjonen i 
`mesanin-maven-cli` i steg-2?

Det finnes et bedre alternativ. Stikkordet er uber-jar. Lag en uber-jar, en jar som inneholder alle avhengighetene som 
trengs for å kjøre applikasjonen, og du trenger ikke lenger å bekymre deg for å manuelt måtte bygge opp classpath-en ved kjøring.

Et løsningsforslag finnes i fila losningsforslag-steg-5.md

### [steg-6: Sluttresultat] [step-6]
Dette steget inneholder sluttresultatet etter å ha vært gjennom tutorialen.


[git-home]: http://git-scm.com/
[java-home]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-home]: http://maven.apache.org/
[maven-search-repo]: http://search.maven.org/

[step-0]: https://github.com/mesan/mesanin-maven/tree/step-0
[step-1]: https://github.com/mesan/mesanin-maven/tree/step-1
[step-2]: https://github.com/mesan/mesanin-maven/tree/step-2
[step-3]: https://github.com/mesan/mesanin-maven/tree/step-3
[step-4]: https://github.com/mesan/mesanin-maven/tree/step-4
[step-5]: https://github.com/mesan/mesanin-maven/tree/step-5
[step-6]: https://github.com/mesan/mesanin-maven/tree/step-6
