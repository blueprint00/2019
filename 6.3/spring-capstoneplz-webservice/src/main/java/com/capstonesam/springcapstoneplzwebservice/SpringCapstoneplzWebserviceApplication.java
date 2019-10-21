package com.capstonesam.springcapstoneplzwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//(scanBasePackages={"com.capstonesam.springcapstoneplzwebservice.domain","com.capstonesam.springcapstoneplzwebservice.DTO","com.capstonesam.springcapstoneplzwebservice.Service","com.capstonesam.springcapstoneplzwebservice.web"})
public class SpringCapstoneplzWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCapstoneplzWebserviceApplication.class, args);
    }

}
