
package com.master.roleup.controller;

import com.master.roleup.object.Game;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateGameController {
    

    @RequestMapping(value = "/creategame", method = RequestMethod.GET)
    public ModelAndView createGamePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("creategame");
        return model;
    }
    
    @RequestMapping(value = "/creategamesuccess", method = RequestMethod.POST)
    public ModelAndView createGamePageSuccess(@RequestParam("title") String title,
            @RequestParam("file") MultipartFile file) {
        Game game = new Game();
        game.setVtitle(title);
        game.setVimage(file);
        
        ModelAndView model = new ModelAndView();
        model.addObject("game", game);
        model.setViewName("creategamesuccess");
        return model;
    }
}
