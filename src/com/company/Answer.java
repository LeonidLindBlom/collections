package com.company;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private int answer;
    Question question;
    public List<Integer> yourAnswers = new ArrayList<>();
    public List<Boolean> boolAns = new ArrayList<>();
    List<Answer> wrongAnswers = new ArrayList<>();

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer=" + answer +
                ", question=" + question +
                ", yourAnswers=" + yourAnswers +
                '}';
    }
}
