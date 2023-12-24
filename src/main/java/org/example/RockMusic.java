package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class RockMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
