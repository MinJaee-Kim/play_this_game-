package Kuportfolio.playthisgame.controller;

import Kuportfolio.playthisgame.Service.gamedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    gamedeService service;

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
        model.addAttribute("name", name);
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
        mv.addObject("gamelist", service.getRecGame());

        return mv;
    }
 }
