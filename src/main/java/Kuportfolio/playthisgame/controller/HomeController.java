package Kuportfolio.playthisgame.controller;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.Service.GamedeService;
import Kuportfolio.playthisgame.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    GamedeService service;
    Game game;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/input")
    public String input() {
        return "input";
    }

    @PostMapping("/check")
    public String check(@RequestParam("name") String name, Model model) {
        List<Question> questionList = new ArrayList<>();
        HashMap<String, Integer> parameterMap = new HashMap<>();

        parameterMap.put("casual", 1);

        questionList.add(new Question(1, "asd", parameterMap));
        questionList.add(new Question(2, "asdf", parameterMap));

        model.addAttribute("item", name);

        model.addAttribute("question", questionList);
        System.out.println("asdff");


        return "check";
    }

    @GetMapping("/result")
    public ModelAndView result(ModelAndView mv) {
        mv.setViewName("result");
        mv.addObject("gamelist", service.getAllgame());

        return mv;
    }

    @RequestMapping("/gamelist")
    public ModelAndView list(ModelAndView mv) {
        mv.setViewName("list");
        mv.addObject("gamelist", service.getRecGame(new GameDTO(9, 1, 9, 1, 9, 1)));

        return mv;
    }

    @GetMapping("/test")
    public String getTest(@ModelAttribute Game game) {
        game.getName();

        return null;
    }
}

