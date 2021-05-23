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
    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable int id ){
        return playerService.getPlayerList().stream().filter(player -> player.getId() == id).findAny().orElse(null);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
        return player;
    }

    @PutMapping("/players/{id}")
    public Player playerList(@RequestBody Player playerToUpdate){
       Player player = playerService.getPlayerList().stream().filter(plr -> plr.getId() == playerToUpdate.getId()).findAny().orElse(null);

        player.setName(playerToUpdate.getName());
        player.setAge(playerToUpdate.getAge());
        player.setSalary(playerToUpdate.getSalary());

       return player;
    }
    @DeleteMapping("/players/{playerToDelete}")
    public List<Player> removePlayer (@PathVariable int playerToDelete){
        Player player = playerService.getPlayerList().stream().filter(plr -> plr.getId() == playerToDelete).findAny().get();
        playerService.getPlayerList().remove(player);
        return playerService.getPlayerList();
    }
}
