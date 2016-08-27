# Løsningsforslag step-4

###### Lagt til en div i index.jsp som refererer til prosjektversjon
    ...
        <div>v${project.version}</div>
    ...

###### Lagt til konfigurasjon i pom.xml for mesanin-maven-web

Under er et utdrag fra pom.xml

    ...
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>2.4</version>
                <configuration>
                    <webResources>
                        <resource>
                            <directory>src/main/webapp</directory>
                            <filtering>true</filtering>
                        </resource>
                    </webResources>
                </configuration>
            </plugin>
        </plugins>
    ...

Kommandoen `mvn tomcat7:run`/`mvn jetty:run` vil ikke vise versjonsnummeret for prosjektet. Dette er fordi 
det ikke lages noen WAR-fil. Benytt derfor heller kommandoen `mvn tomcat7:run-war`/`mvn jetty:run-war` 
som kjører applikasjonen som en WAR-fil.

Webapplikasjonen er tilgjengelig for Tomcat fra [http://localhost:8080/mesanin-maven-web/] [tomcat7-localhost] 
og for Jetty fra [http://localhost:8080/] [jetty-localhost]


[tomcat7-localhost]: http://localhost:8080/mesanin-maven-web/
[jetty-localhost]: http://localhost:8080/