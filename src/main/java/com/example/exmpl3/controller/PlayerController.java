package com.example.exmpl3.controller;

import com.example.exmpl3.model.Player;
import com.example.exmpl3.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lkl/")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

//    @Autowired
//    public void setPlayerService(PlayerService playerService) {
//        this.playerService = playerService;
//    }

//    @Autowired
//    public PlayerController(PlayerService playerService) {
//        this.playerService = playerService;
//    }

    @GetMapping("/players")
    public List<Player> getplayers() {
        return playerService.getPlayerList();
    }
    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
        return player;
    }

}
