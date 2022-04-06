package Kuportfolio.playthisgame.dto;

import Kuportfolio.playthisgame.controller.Answer;
import Kuportfolio.playthisgame.controller.Question;

import java.util.List;

public class ResultDTO {
    private int value;
    List<Question> questionList;
    List<Answer> answerList;

    public int getValue() {
        return value;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
