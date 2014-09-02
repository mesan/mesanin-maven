package no.mesan.mesanin.maven.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GreeterService {

    private final Logger logger = LogManager.getLogger(GreeterService.class.getName());

    public String sayHello() {
        logger.info("sayHello()");
        return "Hello World!";
    }
}
