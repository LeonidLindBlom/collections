package com.company;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private int answer;
    Question question;
    public List<Integer> yourAnswers = new ArrayList<Integer>();

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Вопрос" + question +
                "Ваш ответ" + yourAnswers +
                "Правильный ответ" + question.getQuestionRightAnswer();
    }
}
