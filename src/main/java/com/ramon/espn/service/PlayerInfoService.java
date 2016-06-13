package com.ramon.espn.service;

import com.ramon.espn.dao.PlayerRepository;
import com.ramon.espn.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Class built to facilitate high level operations, and transactions to be maintained as a single
 * unit of work, instead of dispersed database operations.
 *
 */
@Component
public class PlayerInfoService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player savePlayerInformation(Player player)
    {
        return playerRepository.save(player);
    }

    public List<Player> getListOfAllPlayers()
    {
        return playerRepository.findAll();
    }

}
