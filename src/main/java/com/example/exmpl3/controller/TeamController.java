package com.example.exmpl3.controller;

import com.example.exmpl3.model.Player;
import com.example.exmpl3.repository.TeamRepository;
import com.example.exmpl3.service.TeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
@Slf4j
public class TeamController {

    private TeamService teamService;

    @GetMapping("/")
    public List<Player> getplayers() {
        return null;
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable int id ){
        return null;
    }

    @PostMapping("/")
    public Player addPlayer(@RequestBody Player player){
        return null;
    }

    @PutMapping("/{id}")
    public Player playerList(@RequestBody Player playerToUpdate){
        return null;
    }

    @DeleteMapping("/{playerToDelete}")
    public List<Player> removePlayer (@PathVariable int playerToDelete){
        return null;
    }

}
