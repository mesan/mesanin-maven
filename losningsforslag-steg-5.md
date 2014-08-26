# Løsningsforslag steg-5

###### Lagt til konfigurasjon i pom.xml for mesanin-maven-cli

Under er et utdrag fra pom.xml

    ...
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-assembly-plugin</artifactId>
                    <version>2.4.1</version>
                    <configuration>
                        <descriptorRefs>
                            <descriptorRef>jar-with-dependencies</descriptorRef>
                        </descriptorRefs>
                    </configuration>
                    <executions>
                        <execution>
                            <id>make-assembly</id>
                            <phase>package</phase>
                            <goals>
                                <goal>single</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>
            </plugins>
        </build>
    ...

Kjør kommandoen `mvn package` for å lage uber-jar-en.

For å kjøre applikasjonen benytt kommandoen `java -cp target/mesanin-maven-cli-1.0-SNAPSHOT-jar-with-dependencies.jar no.mesan.mesanin.maven.App`