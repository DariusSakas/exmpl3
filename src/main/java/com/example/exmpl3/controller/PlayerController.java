package com.example.exmpl3.controller;

import com.example.exmpl3.model.Player;
import com.example.exmpl3.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Acces all players by /players/ now (was /lkl/players/)
 *
 */

@RestController
@RequestMapping("/api/players/")
@AllArgsConstructor
public class PlayerController {

    @Autowired
    private final PlayerService playerService;

    //Logger logger = LoggerFactory.getLogger(PlayerController.class);

//    @Autowired
//    public void setPlayerService(PlayerService playerService) {
//        this.playerService = playerService;
//    }

//    @Autowired
//    public PlayerController(PlayerService playerService) {
//        this.playerService = playerService;
//    }

    @GetMapping("/")
    public List<Player> getplayers() {
        return playerService.getPlayerList();
    }
    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable int id ){
        return playerService.getPlayerList().stream().filter(player -> player.getId() == id).findAny().orElse(null);
    }

    @PostMapping("/")
    public Player addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
        return player;
    }

    @PutMapping("/{id}")
    public Player playerList(@RequestBody Player playerToUpdate){
       Player player = playerService.getPlayerList().stream().filter(plr -> plr.getId() == playerToUpdate.getId()).findAny().orElse(null);

        player.setName(playerToUpdate.getName());
        player.setAge(playerToUpdate.getAge());
        player.setSalary(playerToUpdate.getSalary());

       return player;
    }
    @DeleteMapping("/{playerToDelete}")
    public List<Player> removePlayer (@PathVariable int playerToDelete){
        Player player = playerService.getPlayerList().stream().filter(plr -> plr.getId() == playerToDelete).findAny().orElse(null);
        playerService.getPlayerList().remove(player);
        return playerService.getPlayerList();
    }
}
