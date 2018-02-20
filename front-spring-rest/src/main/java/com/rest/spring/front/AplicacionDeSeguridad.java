package com.rest.spring.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * rest-spring
 * com.rest.spring.front
 * Created by winadmin in 20/2/2018.
 * Description:
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.rest.spring.front")
public class AplicacionDeSeguridad {

    public static void main(String[] args) {
        SpringApplication.run(AplicacionDeSeguridad.class, args);
    }

}
