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

### [steg-1: Oppdater avhengighet] [step-1]
Oppdatering av testavhengighet og tilpasning av testkode.

### steg-2: Multimodulprosjekt
Applikasjonen er blitt veldig etterspurt og det er et ønske om å gjøre den tilgjengelig også på nett.  
Det er da naturlig å tenke gjenbruk, og det kan løses gjennom å endre prosjektet til et multimodulprosjekt

Vi får da ett morprosjekt med flere barnprosjekter

 - Eksisterende prosjekt mesanin-maven endres til å bli morprosjekt, de andre nye blir barnprosjekt
 - Opprett prosjekt for kommandolinjeapplikasjonen `mesanin-maven-cli`,
 - opprett et webprosjekt `mesanin-maven-web` og
 - et prosjekt for koden som er felles `mesanin-maven-common`.

Hint:

- Det har betydning for i hvilken katalog du står i når du kjører kommandoene for opprettelse av barnprosjektene.
- Prosjektene mesanin-maven-common og mesanin-maven-cli kan opprettes med malen `maven-archetype-quickstart`.
- mesanin-maven-web kan opprettes med malen `maven-archetype-webapp`.
- Benytt samme groupId for alle prosjektene som ble benyttet under opprettelsen av første prosjekt, `no.mesan.mesanin.maven`.
- Et barnprosjekt kan ha en avhengighet til et annet barnprosjekt.

Den overordnede prosjektstrukturen er tenkt å bli som vist under:
<pre>
<strong>mesanin-maven</strong>
+--<strong>mesanin-maven-cli</strong>
|  +--src
|  +--pom.xml
+--<strong>mesanin-maven-common</strong>
|  +--src
|  +--pom.xml
+--<strong>mesanin-maven-web</strong>
|  +--src
|  +--pom.xml
+--pom.xml  
</pre>

Den opprinnelige koden fra mesanin-maven skal fordeles på barnprosjektene

- Lag en ny felles service, for eksempel GreeterService.java, som  inneholder felleskoden fra App.java.
- Benytt den nye servicen i main-metoden i App.java og fra index.jsp i mesanin-maven-web.
For å få resultatet fra GreetingService så kan følgende kodesnutter legges i JSP-fila. Merk fullt klassenavn.
`<% no.mesan.mesanin.maven.service.GreeterService greeterService = new no.mesan.mesanin.maven.service.GreeterService(); %>`
`<h2>GreeterService.sayHello(): '<%= greeterService.sayHello() %>'</h2>`

- Det kan være en idé å legge til en plugin som gjør at du slipper å tenkte på å deploye mesanin-maven-web til en Servlet-container for å gjøre utvikling enklere. 
  - Dette løser Maven ved at du kan kunne legge til en plugin.
  - Legg til enten `tomcat7-maven-plugin` eller `jetty-maven-plugin` som **plugin** i mesanin-maven-web.
- Endre slik at avhengigheter som skal brukes i flere barnprosjekter konfigureres i morpom-en, `dependencyManagement`.
- Legg til et loggrammeverk
  - Endre App.java i mesanin-maven-cli til å bruke en logger i stedet for System.out.println() for å skrive ut resultatet fra GreeterService.
  - Legg til en logger i mesanin-maven-common slik at GreeterService kan benytte den for å logge at servicen blir kalt.

Et løsningsforslag finnes i fila losningsforslag-steg-2.md

### [steg-3: Ekskludering av tester og byggprofiler] [step-3]
Ekskludering av trege tester fra standard bygg, og tilrettelegge for at alle testene kjøres på byggserver ved hjelp av en byggprofil.

### [steg-4: Filtrering av ressurser] [step-4]
Legge til versjonsnummer i JSP-siden ved hjelp av filtrering av ressurser.

### [steg-5: Uber-jar] [step-5]
Lag en uber-jar som kan kjøres uten å måtte manuelt bygge opp classpath-en ved kjøring.

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
