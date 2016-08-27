# Løsningsforslag step-1

######Endret testavhengighet i pom.xml til

    ...
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    ...

######Endret AppTest.java til

    package no.mesan.mesanin.maven;

    import org.junit.Test;

    import static org.junit.Assert.assertTrue;

    public class AppTest {

        @Test
        public void viktig_sjekk() {
            assertTrue(true);
        }
    }

- Klassen extender ikke lenger TestCase.
- Trenger ikke noen konstruktør eller å lage en TestSuite.
- Har lagt på annotasjonen `@Test` på testmetoden. Har også illustrert at metoden ikke lenger trenger å starte med `test` som i JUnit 3.
- Fjernet unødvendige kommentarer.