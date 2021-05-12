package main;

import bigHeights.BigHeights;
import commonTwo.CommonTwo;
import copyEndy.CopyEndy;
import copyEvens.CopyEvens;
import dividesSelf.DividesSelf;
import hasOne.HasOne;
import matchup.Matchup;
import mergeTwo.MergeTwo;
import scoreUp.ScoreUp;
import scores100.Scores100;
import scoresAverage.ScoresAverage;
import scoresClump.ScoresClump;
import scoresIncreasing.ScoresIncreasing;
import scoresSpecial.ScoresSpecial;
import sumHeight2.SumHeight2;
import sumHeights.SumHeights;
import userCompare.UserCompare;
import wordsCount.WordsCount;
import wordsFront.WordsFront;
import wordsWithout.WordsWithout;
import wordsWithoutList.WordsWithoutList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        ScoresIncreasing scoresIncreasing = new ScoresIncreasing();
        System.out.println(scoresIncreasing.scoresIncreasing(new int[]{1,1,2,3,4,4,5}));
        //2
        Scores100 scores100 = new Scores100();
        System.out.println(scores100.scores100(new int[]{100,100,3,100}));
        //3
        ScoresClump scoresClump = new ScoresClump();
        System.out.println(scoresClump.scoresClump(new int[]{1,2,3}));
        //4
        ScoresAverage scoresAverage = new ScoresAverage();
        System.out.println(scoresAverage.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        //5
        WordsCount wordsCount = new WordsCount();
        System.out.println(wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"},1));
        //6
        WordsFront wordsFront = new WordsFront();
        System.out.println(Arrays.toString(wordsFront.wordsFront(new String[]{"Lucas","Henrique","Santos"},2)));
        //7
        WordsWithoutList wordsWithoutList = new WordsWithoutList();
        System.out.println(wordsWithoutList.wordsWithoutList(new String[]{"Lucas","oi","sa"},2));
        //8
        HasOne hasOne = new HasOne();
        System.out.println(hasOne.hasOne(10));
        //9
        DividesSelf dividesSelf = new DividesSelf();
        System.out.println(dividesSelf.dividesSelf(32));
        //10
        CopyEvens copyEvens = new CopyEvens();
        System.out.println(Arrays.toString(copyEvens.copyEvens(new int[]{1,2,4,3,12,5,98},3)));
        //11
        CopyEndy copyEndy = new CopyEndy();
        System.out.println(Arrays.toString(copyEndy.copyEndy(new int[]{12, 1, 1, 13, 0, 20, 99},2)));
        //12
        Matchup matchup = new Matchup();
        System.out.println(matchup.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "b", "bb"}));
        //13
        ScoreUp scoreUp = new ScoreUp();
        System.out.println(scoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
        //14
        WordsWithout wordsWithout = new WordsWithout();
        System.out.println(Arrays.toString(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "a")));
        //15
        ScoresSpecial scoresSpecial = new ScoresSpecial();
        System.out.println(scoresSpecial.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        //16
        SumHeights sumHeights = new SumHeights();
        System.out.println(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
        //17
        SumHeight2 sumHeight2 = new SumHeight2();
        System.out.println(sumHeight2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));
        //18
        BigHeights bigHeights = new BigHeights();
        System.out.println(bigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
        //19
        UserCompare userCompare = new UserCompare();
        System.out.println(userCompare.userCompare("aaa",1,"aaa",2));
        //20
        MergeTwo mergeTwo = new MergeTwo();
        System.out.println(Arrays.toString(mergeTwo.mergeTwo(new String[]{"f", "g", "z"},new String[]{"c", "f", "g"},3)));
        //21
        CommonTwo commonTwo = new CommonTwo();
        System.out.println(commonTwo.commonTwo(new String[]{"a", "c", "x"},new String[]{"b", "c", "d", "x"}));
    }
}
