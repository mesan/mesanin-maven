# Løsningsforslag steg-2

###### Endret packaging fra jar til pom i pom.xml til
Dette er for at det skal være mulig å lage et multimodulprosjekt.

    ...
    <packaging>pom</packaging>
    ...

###### Opprettet tre nye prosjekter
- mesanin-maven-cli
- mesanin-maven-common
- mesanin-maven-web

Det er viktig at oprettelse av prosjektene gjøres i katalogen `mesanin-maven`.

- Prosjektene mesanin-maven-common og mesanin-maven-cli ble opprettet med malen `maven-archetype-quickstart`.  
- Prosjektet mesanin-maven-web ble opprettet med malen `maven-archetype-webapp`.  
- Alle prosjektene ble gitt samme 'groupId' som ble brukt i opprettelsen av første prosjekt, `no.mesan.mesanin.maven`.

pom.xml som ligger i morprosjektet har også fått informasjon om hvilke barnprosjekter som finnes.

    ...
    <modules>
        <module>mesanin-maven-web</module>
        <module>mesanin-maven-common</module>
        <module>mesanin-maven-cli</module>
    </modules>
    ...

Denne informasjonen legger Maven til for deg automatisk om du oppretter prosjektene som beskrevet her.
 
Har også endret slik at det er noen avhengigheter som er definert i `<dependencyManagement>`. Dette gjør at 
avhengighetene kan brukes i barnprosjektene kun ved å angi `<groupId>` og `<artifactId>`.

Alle barnprosjektene har informasjon om hvem deres mor er.

    ...
    <parent>
        <groupId>no.mesan.mesanin.maven</groupId>
        <artifactId>mesanin-maven</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    ...

Også denne informasjonen legger Maven til for deg automatisk om du oppretter prosjektene som beskrevet her.

##### Hva annet er gjort
- Koden som utgjorde kommandolinjeapplikasjonen er nå flyttet til mesanin-maven-cli. 
- Skilt ut koden som ønskes gjenbrukt i en service, GreeterService.java og lagt den i mesanin-maven-common.

Da du er ferdig med omstruktureringen skal prosjektet se ut som følger:
<pre>
<strong>mesanin-maven</strong>
+--<strong>mesanin-maven-cli</strong>
|  +--src
|  |  +--main
|  |  |  +--java
|  |  |  |  +--no
|  |  |  |  |  +--mesan
|  |  |  |  |  |  +--mesanin
|  |  |  |  |  |  |  +--maven
|  |  |  |  |  |  |  |  +--App.java
|  |  +--test     
|  |  |  +--java
|  |  |  |  +--no
|  |  |  |  |  +--mesan
|  |  |  |  |  |  +--mesanin
|  |  |  |  |  |  |  +--maven
|  |  |  |  |  |  |  |  +--AppTest.java
|  +--pom.xml
+--<strong>mesanin-maven-common</strong>
|  +--src
|  |  +--main
|  |  |  +--java
|  |  |  |  +--no
|  |  |  |  |  +--mesan
|  |  |  |  |  |  +--mesanin
|  |  |  |  |  |  |  +--maven
|  |  |  |  |  |  |  |  +--service
|  |  |  |  |  |  |  |  |  +--GreeterService.java
|  |  +--test
|  |  |  +--java
|  |  |  |  +--no
|  |  |  |  |  +--mesan
|  |  |  |  |  |  +--mesanin
|  |  |  |  |  |  |  +--maven
|  |  |  |  |  |  |  |  +--service
|  |  |  |  |  |  |  |  |  +--GreeterServiceTest.java
|  +--pom.xml
+--<strong>mesanin-maven-web</strong>
|  +--src
|  |  +--main
|  |  |  +--resources
|  |  |  +--webapp
|  |  |  |  +--WEB-INF
|  |  |  |  |  +--web.xml
|  |  |  |  +--index.jsp
|  +--pom.xml
+--pom.xml  
</pre>


- Lagt til avhengighet til loggingrammeverket Log4j 2.
- Kommandolinjeapplikasjonen er endret slik at den benytter Log4j 2 i stedet for System.out.println() for å skrive ut
resultatet fra GreeterService.
- Lagt til kode i index.jsp som kaller GreeterService og viser resultatet.
- Fjernet redundant konfigurasjon fra barnprosjektene som allerede er definert i morprosjektet.

Lagt til et par plugins til mesanin-maven-web slik at webapplikasjonen enkelt kan startes fra kommandolinja uten at du trenger å tenke på at koden må deployes til noen server når du utvikler.
**Det er kun nødvendig å legge til én av plugin-ene.**

    ...
    <build>
        <finalName>mesanin-maven-web</finalName>
        <plugins>
            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <version>2.2</version>
            </plugin>
            <plugin>
                <groupId>org.eclipse.jetty</groupId>
                <artifactId>jetty-maven-plugin</artifactId>
                <version>9.2.2.v20140723</version>
            </plugin>
        </plugins>
    </build>
    ...

Webapplikasjonen kan startes ved å kjøre en av kommandoene under fra katalogen mesanin-maven-web

- `mvn tomcat7:run` webapplikasjonen er tilgjengelig fra [http://localhost:8080/mesanin-maven-web/] [tomcat7-localhost]
- `mvn jetty:run` webapplikasjonen er tilgjengelig fra [http://localhost:8080/] [jetty-localhost]

Test at applikasjonen i `mesanin-maven-cli` fortsatt fungerer. Dette kan gjøres på samme måte som i [step-0]. Husk å legge til GreeterService og eventuelt andre avhengigheter på classpath.

For å kjøre løsningsforslaget så kan følgende kommando benyttes. Husk å tilpasse path-ene slik at de stemmer med din maskin.

Linux/OS X
<pre>
java -cp target/mesanin-maven-cli-1.0-SNAPSHOT.jar:../mesanin-maven-common/target/mesanin-maven-common-1.0-SNAPSHOT.jar:/home/<strong><i>brukernavn</i></strong>/.m2/repository/org/apache/logging/log4j/log4j-core/2.0/log4j-core-2.0.jar:/home/<strong><i>brukernavn</i></strong>/.m2/repository/org/apache/logging/log4j/log4j-api/2.0/log4j-api-2.0.jar no.mesan.mesanin.maven.App
</pre>

Windows
<pre>
java -cp target\mesanin-maven-cli-1.0-SNAPSHOT.jar;..\mesanin-maven-common\target\mesanin-maven-common-1.0-SNAPSHOT.jar;C:\Users\<strong><i>brukernavn</i></strong>\.m2\repository\org\apache\logging\log4j\log4j-core\2.0\log4j-core-2.0.jar;C:\Users\<strong><i>brukernavn</i></strong>\.m2\repository\org\apache\logging\log4j\log4j-api\2.0\log4j-api-2.0.jar no.mesan.mesanin.maven.App
</pre>

[tomcat7-localhost]: http://localhost:8080/mesanin-maven-web/
[jetty-localhost]: http://localhost:8080/
[step-0]: https://github.com/mesan/mesanin-maven/tree/step-0