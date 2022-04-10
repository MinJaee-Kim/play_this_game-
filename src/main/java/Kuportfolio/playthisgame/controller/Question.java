package Kuportfolio.playthisgame.controller;

public class Question {
    private String parameter;
    private String Question;

    public Question(String parameter, String question) {
        this.parameter = parameter;
        Question = question;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    private int value;
}
