# Løsningsforslag steg-4

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
