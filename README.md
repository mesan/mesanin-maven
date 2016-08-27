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

### [step-0: Opprett prosjekt] [step-0]
Oppretting av prosjekt på kommandolinja.

### steg-1: Oppdater avhengighet
- Oppdater testavhengigheten (JUnit) til siste versjon. Søk kan gjøres i [The Central Repository] [maven-search-repo]
- Oppdater syntaks for testen til å bruke JUnit 4.x syntaks. Det blir da mindre boilerplatekode i testen.
Et eksempel på syntaksen finner du på "Getting started "-siden hos [junit.org] [junit-home]

Sjekk at testen fortsatt fungerer ved å kjøre testen på nytt med `mvn clean test`

Et løsningsforslag finnes her [losningsforslag-steg-1.md] [losningsforslag]

### [step-2: Multimodulprosjekt] [step-2]
Endre prosjektet til et multimodulprosjekt for gjenbruk av kode.

### [step-3: Ekskludering av tester og byggprofiler] [step-3]
Ekskludering av trege tester fra standard bygg, og tilrettelegge for at alle testene kjøres på byggserver ved hjelp av en byggprofil.

### [step-4: Filtrering av ressurser] [step-4]
Legge til versjonsnummer i JSP-siden ved hjelp av filtrering av ressurser.

### [step-5: Uber-jar] [step-5]
Lag en uber-jar som kan kjøres uten å måtte manuelt bygge opp classpath-en ved kjøring.

### [step-6: Sluttresultat] [step-6]
Dette steget inneholder sluttresultatet etter å ha vært gjennom tutorialen.


[git-home]: http://git-scm.com/
[java-home]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-home]: http://maven.apache.org/
[maven-search-repo]: http://search.maven.org/
[junit-home]: http://junit.org/

[losningsforslag]: https://github.com/mesan/mesanin-maven/blob/step-1/losningsforslag-step-1.md

[step-0]: https://github.com/mesan/mesanin-maven/tree/step-0
[step-1]: https://github.com/mesan/mesanin-maven/tree/step-1
[step-2]: https://github.com/mesan/mesanin-maven/tree/step-2
[step-3]: https://github.com/mesan/mesanin-maven/tree/step-3
[step-4]: https://github.com/mesan/mesanin-maven/tree/step-4
[step-5]: https://github.com/mesan/mesanin-maven/tree/step-5
[step-6]: https://github.com/mesan/mesanin-maven/tree/step-6