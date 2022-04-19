package Kuportfolio.playthisgame.controller;

public class Question {
    private int number;
    private String parameter;
    private String Question;

    public Question(String parameter, int number, String question) {
        this.parameter = parameter;
        this.number = number;
        Question = question;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
