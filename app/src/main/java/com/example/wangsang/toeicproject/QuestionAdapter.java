package com.example.wangsang.toeicproject;

/**
 * Created by WANGSANG on 2017/04/14.
 */

public class QuestionAdapter {

    private String[] mQuestions ={
            "Name of the Liverpool's captain in 2010 session.",
            "How many times did Liverpool win the Champion League? ",
            "Current manager of LV FC.",
            "Mane is the______man in Liverpool."
    };

    private String [][] mChoices ={
            {"SteveG","Fernando9","Reina","Hong Son"},
            {"2","3","5","7"},
            {"Klopp","Mourinho","Huynh Duc","Coutinho"},
            {"most handsome","blackest","heaviest","tallest"}};

    private String [] mCorrectAnswers ={"SteveG","5","Klopp","blackest"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return  choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return  choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return  choice2;
    }

    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return  choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public String[] getQuestions(){
        String [] a =mQuestions;
        return a;
    }
}
