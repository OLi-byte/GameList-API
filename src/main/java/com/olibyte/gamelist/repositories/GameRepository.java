package com.olibyte.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olibyte.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}