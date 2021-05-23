package com.example.exmpl3.controller;

import com.example.exmpl3.model.Agent;
import com.example.exmpl3.service.AgentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/agents")
@Slf4j
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping("/")
    public List<Agent> getAgents(){
        log.info("Fetching AGENTS from DB ");
        return agentService.getAgents();
    }
}
