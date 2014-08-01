# mesanin-maven

## En maven minitutorial

### Det som trengs

- [Git] [git-home]
- [Java] [java-home] 1.5 eller nyere.
- [Maven] [maven-home], følg installasjonsbeskrivelsen på nedlastingssiden.

###steg-0
- Opprett et prosjekt på kommandolinja
  - Hint: Maven Archetype Plugin, mal `maven-archetype-quickstart`
  - Forslag til groupId: `no.mesan.mesanin.maven` og artifactId: `mesanin-maven`

######Når du har gjort dette så vil du ha opprettet:
- Et nytt prosjekt med navn 'mesanin-maven' med filene
  - pom.xml, App.java og AppTest.java

Bygg prosjektet med `mvn package`

Kjør applikasjonen `java -cp target/mesanin-maven-1.0-SNAPSHOT.jar no.mesan.mesanin.maven.App`.

En vellyket kjøring skriver ut `Hello World!`

Kjør kommandoen `mvn help:effective-pom` for å se den fullstendige konfigurasjonen for prosjektet.

Et løsningsforslag kan ses i branch [steg-0] [steg-0]


[git-home]: http://git-scm.com/
[java-home]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-home]: http://maven.apache.org/

[steg-0]: https://github.com/mesan/mesanin-maven/tree/steg-0
