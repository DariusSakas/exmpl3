package com.example.exmpl3.repository;

import com.example.exmpl3.model.Agent;
import com.example.exmpl3.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
