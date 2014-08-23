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

Et løsningsforslag finnes i fila losningsforslag-steg-0.md

### [steg-1: Oppdater avhengighet] [step-1]
Oppdatering av testavhengighet og tilpasning av testkode.

### [steg-2: Multimodulprosjekt] [step-2]
Endre prosjektet til et multimodulprosjekt for gjenbruk av kode.

### [steg-3: Ekskludering av tester og byggprofiler] [step-3]
Ekskludering av trege tester fra standard bygg, og tilrettelegge for at alle testene kjøres på byggserver ved hjelp av byggprofiler.


[git-home]: http://git-scm.com/
[java-home]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-home]: http://maven.apache.org/

[step-0]: https://github.com/mesan/mesanin-maven/tree/step-0
[step-1]: https://github.com/mesan/mesanin-maven/tree/step-1
[step-2]: https://github.com/mesan/mesanin-maven/tree/step-2
[step-3]: https://github.com/mesan/mesanin-maven/tree/step-3