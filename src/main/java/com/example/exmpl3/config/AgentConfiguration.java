package com.example.exmpl3.config;

import com.example.exmpl3.model.Agent;
import com.example.exmpl3.model.Team;
import com.example.exmpl3.repository.AgentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AgentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(AgentRepository agentRepository) {
        return args -> {
            agentRepository.saveAll(Arrays.asList(

            ));
        };
    }
}
