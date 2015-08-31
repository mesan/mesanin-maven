# Løsningsforslag steg-3

###### Lagt til SlowTest.java som skal eksluderes fra standard bygg
<pre>

package no.mesan.mesanin.maven.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SlowTest {

    @Test
    public void veldig_treg_test() throws Exception {
        System.out.println("Kjorer veldig_treg_test");
        Thread.sleep(30000);
        assertTrue(true);
    }
}

</pre>

###### Lagt til konfigurasjon i pom.xml for prosjektet mesanin-maven-common

- Eksludert SlowTest.java fra sandard bygg.
- Opprettet profilen med 'id' `alletester` og nullstilt ekskluderingen som er gjort i standard.
 - Nullstilling blir gjort ved å benytte pattern `**/*$*` i excludes-elementet. Det er dette som er defaultverdien 
 dersom ikke noe er oppgitt. Se siden til [maven-surefire-plugin] for mer informasjon.

Under er et utdrag fra pom.xml

    ...
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.17</version>
                <configuration>
                    <excludes>
                        <exclude>**/SlowTest.java</exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <profiles>
        <profile>
            <id>alletester</id>
            <build>
                <plugins>
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-surefire-plugin</artifactId>
                        <version>2.17</version>
                        <configuration>
                            <excludes>
                                <exclude>**/*$*</exclude>
                            </excludes>
                        </configuration>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>
    ...

Forsøk å kjøre de kjappe testene med kommandoen `mvn clean test`. Dette skal gå fort da SlowTest.java er ekskludert.   
Kjør alle testene ved å bruke opprettet profil `mvn -P alletester clean test`. Nå kjører også den trege testen i SlowTest.java. 


[maven-surefire-plugin]: http://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html