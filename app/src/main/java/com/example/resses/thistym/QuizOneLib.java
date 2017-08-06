package com.example.resses.thistym;

/**
 * Created by haliimah on 7/29/2017.
 */

public class QuizOneLib {
    public static String mQuestions [] = {
            "What name is given to the green coloring matter found in leaves",
            "______ have parallel leaf venation",
            "______is the process by which plants lose water to the atmosphere",
            "leaves make food for the plant called_______",
            "plants breathe through small holes found on their leaves called_______ ",
            "________is the process by which leaves create food for the plant",
            "plants absorb __________ from the air and give off ________",
            "there are two types of leaf venation, parallel leaf venation and _______ leaf venetion",
            "plants absorb water from soil to leaves by a process called_______"

    };


    public static String mChoices [][] = {
            {"oxygen", "Stomata", "chrolophyll"},
            {"tall plants", "monocotylydonous plants", "dicotylidonous plants"},
            {"Transpiration", "diffusion", "osmosis"},
            {"matooke", "starch", "eggs"},
            {"stomatah", "spiracles", "nose"},
            {"transpiration", "germination", "photosynthesis"},
            {"air,food", "carbondioxide,oxygen", "oxygen,carbondioxide"},
            {"zig-zag", "wire mesh", "network"},
            {"osmosis", "diffusion", "transpiration"}

    };



    public String mCorrectAnswers[] = {"chrolophyll","monocotylydonous plants","Transpiration","starch","stomatah","photosynthesis", "carbondioxide,oxygen","network","osmosis"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;



    }
}
