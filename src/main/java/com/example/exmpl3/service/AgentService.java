package com.example.exmpl3.service;

import com.example.exmpl3.model.Agent;
import com.example.exmpl3.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public List<Agent> getAgents(){
        return agentRepository.findAll();
    }

    public Agent getAgentById(Long id ){
        return agentRepository.findById(id).get();
    }
}
