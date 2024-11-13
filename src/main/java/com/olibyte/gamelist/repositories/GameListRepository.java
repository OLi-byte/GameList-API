package com.olibyte.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olibyte.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
