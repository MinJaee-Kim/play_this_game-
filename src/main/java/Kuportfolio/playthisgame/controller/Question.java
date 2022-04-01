package Kuportfolio.playthisgame.controller;

import java.util.HashMap;
import java.util.Map;

public class Question {
    private int number;
    private String Question;
    HashMap<String, Integer> parameter = new HashMap<>();

    public Question(int number, String question, HashMap<String, Integer> parameter) {
        this.number = number;
        Question = question;
        this.parameter = parameter;
    }

    private int value;
}
