package com.ramon.espn.controllers;

import com.ramon.espn.service.PlayerInfoService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    Logger logger = LogManager.getLogger(getClass());

    @Autowired
    private PlayerInfoService playerInfoService;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {

        logger.info(playerInfoService.getListOfAllPlayers().size());
        model.put("players", playerInfoService.getListOfAllPlayers());

        return "welcome";
    }

}
