package no.mesan.mesanin.maven;

import no.mesan.mesanin.maven.service.GreeterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        final GreeterService greeterService = new GreeterService();
        logger.info(greeterService.sayHello());
    }
}
