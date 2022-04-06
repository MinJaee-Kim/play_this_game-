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
    public String check(Model model, @ModelAttribute("result") ResultDTO resultDTO) {
        List<Question> questionList;
        List<Answer> answerList;
        String[][] parameter;

        InitThings initThings = new InitThings();

        questionList = initThings.getQuestionList();
        answerList = initThings.getAnswerList();
        parameter = initThings.getParameter();
        resultDTO.setAnswerList(initThings.getAnswerList());
        resultDTO.setQuestionList(initThings.getQuestionList());



        model.addAttribute("question", questionList);
        model.addAttribute("answer", answerList);

        System.out.println(parameter[0][1]);

        return "check";
    }

    @PostMapping("/result")
    public ModelAndView result(ModelAndView mv, @ModelAttribute("result") ResultDTO resultDTO, Model model) {
        mv.setViewName("result");
        mv.addObject("gamelist", service.getAllgame());

        model.addAttribute("one", resultDTO);

        return mv;
    }

    @RequestMapping("/gamelist")
    public ModelAndView list(ModelAndView mv){
        mv.setViewName("list");
        mv.addObject("gamelist", service.getRecGame(new GameDTO(1, 1, 1, 1, 1, 1)));

        return mv;
    }
 }

