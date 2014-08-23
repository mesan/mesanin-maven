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
