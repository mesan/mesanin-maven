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

### [steg-2: Multimodulprosjekt] [step-2]
Endre prosjektet til et multimodulprosjekt for gjenbruk av kode.

### steg-3: Ekskludering av tester og byggprofiler
Etter en stund så har applikasjonen vokst og mengden tester er blitt mange og det å kjøre testene
går stadig tregere. Dette har gjort at det å kjøre enhetstestene tar uforholdsmessig lang tid og utgjør
et irritasjonsmoment i det daglige. Men det er kun noen av testene som tar lang tid.

- Ekskluder trege tester fra standard bygg i prosjektet mesanin-maven-common som benyttes lokalt.
- Alle testene skal kjøres på byggserver, inkludert de trege.
 - Her er det tenkt at du skal benytte en maven profil til å konfigurere plugin til å kjører alle testene.

Hint:

- Nullstill ekskludering av trege tester i byggen i profilen.

Hvis du trenger en treg test så bruker SlowTest.java hele 30 sekunder på å bli ferdig.

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

Et løsningsforslag finnes i fila losningsforslag-steg-3.md
### [steg-4: Sluttresultat] [step-4]
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
