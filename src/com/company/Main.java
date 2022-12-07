package com.company;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Question> question = new ArrayList<>();
        Question firstQuestion = new Question();
        firstQuestion.setQuestionText("\nЧто такое конструктор у класса?");
        firstQuestion.setQuestionRightAnswer(1);
        firstQuestion.answers.add("1.метод, который вызывается при создании экземпляра объекта;\n");
        firstQuestion.answers.add("2.специальная переменная класса;\n");
        firstQuestion.answers.add("3.объект класса;\n");
        question.add(firstQuestion);

        Question secondQuestion = new Question();
        secondQuestion.setQuestionText("\nЕсли у класса в теле не объявлен конструктор тогда");
        secondQuestion.setQuestionRightAnswer(1);
        secondQuestion.answers.add("1.у данного класса автоматически создается конструктор по умолчанию;\n");
        secondQuestion.answers.add("2.нельзя создать объект этого класса\n");
        secondQuestion.answers.add("3.код не скомпилируется;\n");
        question.add(secondQuestion);

        Question thirdQuestion = new Question();
        thirdQuestion.setQuestionText("\nПеременные в классе инициализируется?");
        thirdQuestion.setQuestionRightAnswer(1);
        thirdQuestion.answers.add("1.в порядке их объявления;\n");
        thirdQuestion.answers.add("2.все одновременно;\n");
        thirdQuestion.answers.add("3.в случайном порядке;\n");
        question.add(thirdQuestion);

        Question fourthQuestion = new Question();
        fourthQuestion.setQuestionText("\nСколько конструкторов может быть у класса?");
        fourthQuestion.setQuestionRightAnswer(1);
        fourthQuestion.answers.add("1.неограниченное количество;\n");
        fourthQuestion.answers.add("2.только один;\n");
        fourthQuestion.answers.add("3.не более пяти;\n");
        question.add(fourthQuestion);

        Question fifthQuestion = new Question();
        fifthQuestion.setQuestionText("\nДля каких целей служат методы get и set");
        fifthQuestion.setQuestionRightAnswer(1);
        fifthQuestion.answers.add("1.чтобы другие классы могли корректно получать или менять данные внутри объектов вашего класса;\n");
        fifthQuestion.answers.add("2.это специальные конструкторы класса;\n");
        question.add(fifthQuestion);

        Scanner ansScanner = new Scanner(System.in);

        Answer ans = new Answer();

        for (Question i : question) {
            System.out.println(i);
            System.out.println("Введите номер ответа: ");
            try {
                ans.setAnswer(ansScanner.nextInt());
                if (ans.getAnswer()>i.answers.size()){
                    throw new WrongAnswerException ("Такого варианта нет");
                }
                else if (ans.getAnswer()<1){
                    throw new WrongAnswerException ("Такого варианта нет");
                }
            }
            catch (WrongAnswerException e){
                e.printStackTrace();
                ans.boolAns.add(false);
                ans.wrongAnswers.add(ans);
            }
            ans.yourAnswers.add(ans.getAnswer());
            if (ans.getAnswer() == i.getQuestionRightAnswer()){
                ans.boolAns.add(true);
            }
            else {
                ans.boolAns.add(false);
                ans.wrongAnswers.add(ans);
            }
        }
        System.out.println("Вы правильно отевтили на " + Collections.frequency(ans.boolAns, true) + " из " + question.size() + " вопросов");
        if (Collections.frequency(ans.boolAns, true)==question.size()) System.out.println("грац");
        else {
            for (int i = 0; i < question.size(); i++) {
                if(question.get(i).getQuestionRightAnswer()!=ans.yourAnswers.get(i)){
                    int q =question.indexOf(question.get(i));
                    q++;
                    System.out.println("\n" + "Вы неправильно ответили на вопрос " + q);
                    System.out.println(question.get(i).getQuestionText());
                    System.out.println("Правильный ответ: " + question.get(i).getQuestionRightAnswer());
                }
            }
        }
    }
}
