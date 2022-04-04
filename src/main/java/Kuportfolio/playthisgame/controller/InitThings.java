package Kuportfolio.playthisgame.controller;

import java.util.ArrayList;
import java.util.List;

public class InitThings {
    List<Question> questionList = new ArrayList<>();
    List<Answer> answerList = new ArrayList<>();
    String[][] parameter;

    public InitThings() {
        answerList.add(new Answer(0, "매우아니다"));
        answerList.add(new Answer(2, "아니다"));
        answerList.add(new Answer(5, "보통이다"));
        answerList.add(new Answer(7, "그렇다"));
        answerList.add(new Answer(10, "매우그렇다"));

        questionList.add(new Question(1, "asd"));
        questionList.add(new Question(2, "asdf"));
        questionList.add(new Question(3, "asdff"));

        this.parameter = new String[][]{{"casual", "1"}, {"casual", "2"}};
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public String[][] getParameter() {
        return parameter;
    }

    public void setParameter(String[][] parameter) {
        this.parameter = parameter;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

}
