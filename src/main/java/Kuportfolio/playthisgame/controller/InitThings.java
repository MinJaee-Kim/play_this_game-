package Kuportfolio.playthisgame.controller;

import java.util.ArrayList;
import java.util.List;

public class InitThings {
    List<Question> questionList = new ArrayList<>();
    List<Answer> answerList = new ArrayList<>();

    public InitThings() {
        answerList.add(new Answer(0, "매우아니다"));
        answerList.add(new Answer(1, "아니다"));
        answerList.add(new Answer(2, "보통이다"));
        answerList.add(new Answer(3, "그렇다"));
        answerList.add(new Answer(4, "매우그렇다"));

        questionList.add(new Question("casual1",1, "나는 게임을 짧게 즐기는 편이다."));
        questionList.add(new Question("story1",2, "나는 영화를 자주 보는 편이다"));
        questionList.add(new Question("challenge1",3, "나는 포기를 모른다"));
        questionList.add(new Question("collect1",4, "나는 게임에 현질을 자주한다."));
        questionList.add(new Question("tech1",5, "나는 보드게임을 좋아하는 편이다"));
        questionList.add(new Question("challenge2",6, "어려운 게임에 흥미가 많다"));
        questionList.add(new Question("collect2",7, "나는 육성게임을 좋아한다"));
        questionList.add(new Question("casual2",8, "나는 쉽게 실증이 나는편이다."));
        questionList.add(new Question("collabo1",9, "나는 공대장을 많이 해봤다."));
        questionList.add(new Question("story2",10, "나는 감수성이 깊다"));
        questionList.add(new Question("collabo2",11, "나는 친구가 많다"));
        questionList.add(new Question("challenge3",12, "나는 집중력이 좋다"));
        questionList.add(new Question("casual3",13, "나는 귀여운게 좋다"));
        questionList.add(new Question("story3",14, "나는 게임을 할때 스킵을 하지 않는다"));
        questionList.add(new Question("collect3",15, "나는 운이 좋다"));
        questionList.add(new Question("tech2",16, "나는 머리쓰는것을 좋아한다"));
        questionList.add(new Question("challenge4",17, "나는 컨트롤이 좋다"));
        questionList.add(new Question("collabo3",18, "나는 말이 많다"));
        questionList.add(new Question("story4",19, "나는 생각이 많은 편이다"));
        questionList.add(new Question("tech3",20, "나는 계획하는걸 좋아한다"));
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

}
