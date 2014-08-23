package no.mesan.mesanin.maven.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterServiceTest {

    private GreeterService greeterService;

    @Before
    public void setUp() throws Exception {
        greeterService = new GreeterService();
    }

    @Test
    public void sayHello_skal_returnere_forventet_verdi() throws Exception {
        assertEquals("Hello World!", greeterService.sayHello());
    }
}
