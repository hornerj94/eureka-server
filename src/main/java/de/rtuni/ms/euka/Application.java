/*
 * Copyright 2019 (C) by Julian Horner.
 * All Rights Reserved.
 */

package de.rtuni.ms.euka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Class for starting eureka server.
 * 
 * @author Julian
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    //---------------------------------------------------------------------------------------------
    
    /**
     * Start the application.
     * 
     * @param args The arguments
     */
    public static void main(String[] args) { SpringApplication.run(Application.class, args); }

    //---------------------------------------------------------------------------------------------
}
