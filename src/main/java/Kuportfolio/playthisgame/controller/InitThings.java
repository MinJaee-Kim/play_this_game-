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

        questionList.add(new Question("casual", "질문 질문 질문 질문질문"));
        questionList.add(new Question("story", "질문 질문 질문 질문질문2"));
        questionList.add(new Question("challenge", "asd"));
        questionList.add(new Question("collect", "asdf"));
        questionList.add(new Question("tech", "asdff"));
        questionList.add(new Question("challenge", "asd"));
        questionList.add(new Question("collect", "asd"));
        questionList.add(new Question("casual", "asd"));
        questionList.add(new Question("collabo", "asd"));
        questionList.add(new Question("story", "asdf"));
        questionList.add(new Question("collabo", "asd"));
        questionList.add(new Question("challenge", "asd"));
        questionList.add(new Question("casual", "asd"));
        questionList.add(new Question("story", "asdf"));
        questionList.add(new Question("collect", "asd"));
        questionList.add(new Question("tech", "asd"));
        questionList.add(new Question("challenge", "asd"));
        questionList.add(new Question("collabo", "asd"));
        questionList.add(new Question("story", "asdf"));
        questionList.add(new Question("tech", "asdff"));

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
