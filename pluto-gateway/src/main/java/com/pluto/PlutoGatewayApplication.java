package com.pluto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * @author Administrator
 */
@SpringBootApplication(scanBasePackages = {"com.pluto","com.pluto.common.basic.exception"})
@EnableWebFlux
public class PlutoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlutoGatewayApplication.class, args);
    }

}
