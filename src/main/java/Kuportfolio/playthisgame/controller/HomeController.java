package Kuportfolio.playthisgame.controller;

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

        model.addAttribute("item", name);
        model.addAttribute("question", questionList);

        return "check";
    }

    @PostMapping("/result")
    public ModelAndView result(ModelAndView mv) {
        mv.setViewName("result");
        mv.addObject("gamelist", service.getAllgame());

        return mv;
    }

    @RequestMapping("/gamelist")
    public ModelAndView list(ModelAndView mv){
        mv.setViewName("list");
        mv.addObject("gamelist", service.getRecGame(new GameDTO(1, 1, 1, 1, 1, 1)));

        return mv;
    }
 }

