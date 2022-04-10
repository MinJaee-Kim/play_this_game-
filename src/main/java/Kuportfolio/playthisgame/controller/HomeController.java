package Kuportfolio.playthisgame.controller;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.Service.GamedeService;
import Kuportfolio.playthisgame.dto.GameDTO;
import Kuportfolio.playthisgame.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

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
    public String check(Model model) {
        List<Question> questionList;
        List<Answer> answerList;
        String[][] parameter;

        InitThings initThings = new InitThings();

        questionList = initThings.getQuestionList();
        answerList = initThings.getAnswerList();
        parameter = initThings.getParameter();



        model.addAttribute("question", questionList);
        model.addAttribute("answer", answerList);

        System.out.println(parameter[0][1]);

        return "check";
    }

    @PostMapping("/result")
    public ModelAndView result(ModelAndView mv, @RequestParam HashMap<String, String> hashMap, Model model) {
        mv.setViewName("result");
        mv.addObject("gamelist", service.getAllgame());

        System.out.println(hashMap);
        model.addAttribute("val", hashMap);

        return mv;
    }

    @RequestMapping("/gamelist")
    public ModelAndView list(ModelAndView mv){
        mv.setViewName("list");
        mv.addObject("gamelist", service.getRecGame(new GameDTO(1, 1, 1, 1, 1, 1)));

        return mv;
    }
 }

