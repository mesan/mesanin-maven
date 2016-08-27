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

### step-0: Opprett prosjekt
Oppretting av prosjekt på kommandolinja.
### steg-0: Opprett prosjekt
Opprett et prosjekt på kommandolinja

- Hint: Maven Archetype Plugin, mal `maven-archetype-quickstart`  
- Forslag til groupId: `no.mesan.mesanin.maven` og artifactId: `mesanin-maven`

######Når du har gjort dette så vil du ha opprettet:
Et nytt prosjekt med navn 'mesanin-maven' med filene

- pom.xml, App.java og AppTest.java

Bygg prosjektet med `mvn package`

Kjør applikasjonen `java -cp target/mesanin-maven-1.0-SNAPSHOT.jar no.mesan.mesanin.maven.App`.

En vellyket kjøring skriver ut `Hello World!`

Kjør kommandoen `mvn help:effective-pom` for å se den fullstendige konfigurasjonen for prosjektet.

Et løsningsforslag finnes her [losningsforslag-steg-0.md] [losningsforslag]

### [step-1: Oppdater avhengighet] [step-1]
Oppdatering av testavhengighet og tilpasning av testkode.

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

[losningsforslag]: https://github.com/mesan/mesanin-maven/blob/step-0/losningsforslag-steg-0.md

[step-0]: https://github.com/mesan/mesanin-maven/tree/step-0
[step-1]: https://github.com/mesan/mesanin-maven/tree/step-1
[step-2]: https://github.com/mesan/mesanin-maven/tree/step-2
[step-3]: https://github.com/mesan/mesanin-maven/tree/step-3
[step-4]: https://github.com/mesan/mesanin-maven/tree/step-4
[step-5]: https://github.com/mesan/mesanin-maven/tree/step-5
[step-6]: https://github.com/mesan/mesanin-maven/tree/step-6