package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionText;
    private int questionRightAnswer;
    public List<String> answers = new ArrayList<>();

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getQuestionRightAnswer() {
        return questionRightAnswer;
    }

    public void setQuestionRightAnswer(int questionRightAnswer) {
        this.questionRightAnswer = questionRightAnswer;
    }

    @Override
    public String toString() {
        return questionText + "\n" +
                answers;
    }
}
