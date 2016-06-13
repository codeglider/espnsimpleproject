package com.ramon.espn.restcontrollers;

import com.ramon.espn.model.Player;
import com.ramon.espn.service.PlayerInfoService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller that works with player data.
 *
 */
@RestController
@RequestMapping("/player")
public class PlayerDataController {

    Logger logger = LogManager.getLogger(getClass());

    @Autowired
    PlayerInfoService playerInfoService;

    @RequestMapping("/save")
    public Player savePlayerAction(Player player)
    {
        logger.info("Saving Player Action Entered");
        logger.info(player);

        return playerInfoService.savePlayerInformation(player);
    }

}
