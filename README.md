# mesanin-maven

## En maven minitutorial

### Det som trengs

- [Git] [git-home] (kun nødvendig om du ønsker å hente ned koden)
- [Java] [java-home] 1.5 eller nyere.
- [Maven] [maven-home], følg installasjonsbeskrivelsen på nedlastingssiden.

### steg-0
- Opprett et prosjekt på kommandolinja
  - Hint: Maven Archetype Plugin, mal `maven-archetype-quickstart`
  - Forslag til groupId: `no.mesan.mesanin.maven` og artifactId: `mesanin-maven`

###### Når du har gjort dette så vil du ha opprettet:
- Et nytt prosjekt med navn 'mesanin-maven' med filene
  - pom.xml, App.java og AppTest.java

Bygg prosjektet med `mvn package`

Kjør applikasjonen `java -cp target/mesanin-maven-1.0-SNAPSHOT.jar no.mesan.mesanin.maven.App`.

En vellyket kjøring skriver ut `Hello World!`

Kjør kommandoen `mvn help:effective-pom` for å se den fullstendige konfigurasjonen for prosjektet.

Et løsningsforslag kan ses i branch [steg-0] [steg-0]

### steg-1
- Oppdater testavhengigheten (JUnit) til siste versjon. Søk kan gjøres i [The Central Repository] [maven-search-repo]
- Oppdater syntaks for testen til å bruke JUnit 4.x syntaks. Det skal da bli mindre boilerplatekode i testen.

Sjekk at testen fortsatt fungerer ved å kjøre testen på nytt med `mvn clean test`

Et løsningsforslag kan ses i branch [steg-1] [steg-1]


[git-home]: http://git-scm.com/
[java-home]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-home]: http://maven.apache.org/
[maven-search-repo]: http://search.maven.org/

[steg-0]: https://github.com/mesan/mesanin-maven/tree/steg-0
[steg-1]: https://github.com/mesan/mesanin-maven/tree/steg-1
