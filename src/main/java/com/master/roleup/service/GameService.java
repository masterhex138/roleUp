
package com.master.roleup.service;

import com.master.roleup.dao.interfaces.GameDao;
import com.master.roleup.model.TGames;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameDao gameDao;

        
    public List<TGames> getListOfGames() {
        return gameDao.getGames();
    }
    
    
    public TGames getGame(HttpSession session){
        TGames game = (TGames) session.getAttribute("game");
        return game;
    }
    
}
