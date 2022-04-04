package Kuportfolio.playthisgame.controller;

public class Question {
    private int number;
    private String Question;

    public Question(int number, String question) {
        this.number = number;
        Question = question;
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

    private int value;
}
