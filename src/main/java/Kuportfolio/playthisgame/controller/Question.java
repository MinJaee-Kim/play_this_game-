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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public HashMap<String, Integer> getParameter() {
        return parameter;
    }

    public void setParameter(HashMap<String, Integer> parameter) {
        this.parameter = parameter;
    }

    private int value;
}
