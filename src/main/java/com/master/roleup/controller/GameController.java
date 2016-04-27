package com.master.roleup.controller;

import com.master.roleup.model.TGames;

import com.master.roleup.service.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;
    private TGames game;
    
    @RequestMapping(value = "/games**", method = RequestMethod.GET)
    public ModelAndView gamesPage() {
        List<TGames> games = gameService.getListOfGames();
        ModelAndView model = new ModelAndView();
        model.addObject("games", games);
        model.setViewName("games");
        return model;
    }
    
    
}
