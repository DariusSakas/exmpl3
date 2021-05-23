package com.example.exmpl3.service;

import com.example.exmpl3.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    public List<Player> playerList = new ArrayList<>();

    public PlayerService() {
        playerList.add(new Player(1L, "p1", 27, 25000));
        playerList.add(new Player(2L, "p1", 41, 25500));
        playerList.add(new Player(3L, "p1", 24, 25050));
        playerList.add(new Player(4L, "p1", 35, 26000));
        playerList.add(new Player(5L, "p1", 51, 25005));
    }
    public List<Player> getPlayerList(){
        return playerList;
    }
    public void addPlayer(Player player){
        playerList.add(player);
    }
}
