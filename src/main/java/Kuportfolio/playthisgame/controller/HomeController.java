package Kuportfolio.playthisgame.controller;

import Kuportfolio.playthisgame.Service.GamedeService;
import Kuportfolio.playthisgame.dto.GameDTO;
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

        InitThings initThings = new InitThings();

        questionList = initThings.getQuestionList();
        answerList = initThings.getAnswerList();


        model.addAttribute("question", questionList);
        model.addAttribute("answer", answerList);

        return "check";
    }


    @PostMapping("/result")
    public ModelAndView result(ModelAndView mv, @RequestParam HashMap<String, String> hashMap, Model model) {
        mv.setViewName("result");
        model.addAttribute("val", hashMap);

        int story=0;
        int challenge=0;
        int collect=0;
        int tech=0;
        int casual=0;
        int collabo=0;

        for(String key:hashMap.keySet()){
            if (key.substring(0, key.length()-1).equals("story")){
                story+=Integer.parseInt(hashMap.get(key));
            }
            if (key.substring(0, key.length()-1).equals("challenge")){
                challenge+=Integer.parseInt(hashMap.get(key));
            }
            if (key.substring(0, key.length()-1).equals("collect")){
                collect+=Integer.parseInt(hashMap.get(key));
            }
            if (key.substring(0, key.length()-1).equals("tech")){
                tech+=Integer.parseInt(hashMap.get(key));
            }
            if (key.substring(0, key.length()-1).equals("casual")){
                casual+=Integer.parseInt(hashMap.get(key));
            }
            if (key.substring(0, key.length()-1).equals("collabo")){
                collabo+=Integer.parseInt(hashMap.get(key));
            }
        }

        mv.addObject("gamelist", service.getRecGame(new GameDTO(story/4, challenge/4, collect/3, tech/3, casual/3, collabo/3)));
        mv.addObject("gamecount", service.getRecGame(new GameDTO(story/4, challenge/4, collect/3, tech/3, casual/3, collabo/3)));

        System.out.println(service.getCount(new GameDTO(story/4, challenge/4, collect/3, tech/3, casual/3, collabo/3)));
        return mv;
    }

    @RequestMapping("/gamelist")
    public ModelAndView list(ModelAndView mv) {
        mv.setViewName("list");
        mv.addObject("gamelist", service.getRecGame(new GameDTO(7, 7, 0, 4, 7, 0)));

        return mv;
    }
 }

