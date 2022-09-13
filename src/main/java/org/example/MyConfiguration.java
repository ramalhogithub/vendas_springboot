package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/** @Configuration
@Profile("development") /* Só estará disponível para o ambiente de desenvolvimento do arquivo application.properties */
@ConfigDevelopment
public class MyConfiguration {

    /**@Bean(name = "applicationName")
     * Agora no arquivo application.properties
    public String applicationName(){
        return "Sistema de Vendas";
    }*/


    /** Ao ver o annation @Bean o spring executa automaticamente, o CommandLineRunner executa os comandos
     * da linha de comando
     * @return void
     */
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento....");

        };
    }



}
