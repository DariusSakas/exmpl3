package com.example.exmpl3.controller;

import com.example.exmpl3.model.Agent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/agents")
public class AgentController {
    @GetMapping("/")
    public List<Agent> getAgents(){

        return null;
    }
}
