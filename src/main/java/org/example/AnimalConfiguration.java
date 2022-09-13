package org.example;


import org.springframework.context.annotation.Bean;

@ConfigDevelopment
public class AnimalConfiguration {
    @Bean(name = "cachorro")
    public Animal cachorro() {
        return new Animal() {
             @Override
                public void fazerBarulho () {
                    System.out.println("Au au!!!!!!!!!!!");
                 }
            };
    }
    @Bean(name = "gato")
    public Animal gato() {
        return new Animal() {
            @Override
            public void fazerBarulho () {
                System.out.println("Miau!!!!!!!!!!!");
            }
        };
    }
}
