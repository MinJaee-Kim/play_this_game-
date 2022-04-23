package Kuportfolio.playthisgame.controller;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.Service.GamedeService;
import Kuportfolio.playthisgame.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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
        List<Game> games = null;
        int idx = 0;
        List<Long> count = service.CountBetween(new GameDTO(story/4, challenge/4, collect/3, tech/3, casual/3, collabo/3));

        for (;;){
            if (!count.isEmpty()){
                idx = (int)(Math.random() * count.size());
                System.out.println(count.get(idx));
                games = service.findOne(count.get(idx));
                break;
            } else {
                count = service.CountBetweenWide(new GameDTO(story/4, challenge/4, collect/3, tech/3, casual/3, collabo/3));
                System.out.println(count.get(idx));
            }

            if (!count.isEmpty()){
                idx = (int)(Math.random() * count.size());
                System.out.println(count.get(idx));
                games = service.findOne(count.get(idx));
                break;
            } else {
                count = service.CountBetweenWide2(new GameDTO(story/4, challenge/4, collect/3, tech/3, casual/3, collabo/3));
                System.out.println(count);
            }

            if (!count.isEmpty()){
                idx = (int)(Math.random() * count.size());
                System.out.println(count.get(idx));
                games = service.findOne(count.get(idx));
            }
            break;
        }
        System.out.println(count);


        mv.addObject("gamelist", games);

        return mv;
    }

    @RequestMapping("/gamelist")
    public ModelAndView list(ModelAndView mv) {
        mv.setViewName("list");
//        mv.addObject("gamelist", service.getRecGame(new GameDTO(7, 7, 0, 4, 7, 0)));

        return mv;
    }
 }

