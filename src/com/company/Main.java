package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Question> question = new ArrayList<>();
        Question firstQuestion = new Question();
        firstQuestion.setQuestionText("\nЧто такое конструктор у класса?");
        firstQuestion.setQuestionRightAnswer(1);
        firstQuestion.answers.add("1.метод, который вызывается при создании экземпляра объекта;");
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

        Question[] qArray = new Question[question.size()];
        question.toArray(qArray);
        int a=0;

        Answer ans = new Answer();

        for (int i = 0; i < qArray.length; i++) {
            System.out.println(qArray[i]);
            System.out.println("Введите номер ответа: ");
            try {
                ans.setAnswer(ansScanner.nextInt());
                if (ans.getAnswer()>qArray[i].answers.size()){
                    throw new WrongAnswerException ("Такого варианта нет");
                }
                else if (ans.getAnswer()<1){
                    throw new WrongAnswerException ("Такого варианта нет");
                }
            }
            catch (WrongAnswerException e){
                e.printStackTrace();
            }
            ans.yourAnswers.add(ans.getAnswer());
            if (ans.getAnswer() == qArray[i].getQuestionRightAnswer()){
                a++;
            }
        }
        System.out.println("Вы правильно отентили на " + a + " из " + question.size() + " вопросов");
    }
}
