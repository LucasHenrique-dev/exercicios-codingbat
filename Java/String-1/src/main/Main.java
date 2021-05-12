package main;

import FrontAgain.FrontAgain;
import atFirst.AtFirst;
import comboString.ComboString;
import conCat.ConCat;
import deFront.DeFront;
import endsLy.EndsLy;
import extraEnd.ExtraEnd;
import extraFront.ExtraFront;
import firstHalf.FirstHalf;
import firstTwo.FirstTwo;
import hasBad.HasBad;
import helloName.HelloName;
import lastChars.LastChars;
import lastTwo.LastTwo;
import left2.Left2;
import makeAbba.MakeAbba;
import makeOutWord.MakeOutWord;
import makeTags.MakeTags;
import middleThree.MiddleThree;
import middleTwo.MiddleTwo;
import minCat.MinCat;
import nTwice.NTwice;
import nonStart.NonStart;
import right2.Right2;
import seeColor.SeeColor;
import startWord.StartWord;
import theEnd.TheEnd;
import twoChar.TwoChar;
import without2.Without2;
import withoutEnd.WithoutEnd;
import withoutEnd2.WithoutEnd2;
import withoutX.WithoutX;
import withoutX2.WithoutX2;

public class Main {
    public static void main(String[] args){
        //1
        HelloName helloName = new HelloName();
        System.out.println(helloName.helloName("Lucas"));
        //2
        MakeAbba makeAbba = new MakeAbba();
        System.out.println(makeAbba.makeAbba("Estudando","Java"));
        //3
        MakeTags makeTags = new MakeTags();
        System.out.println(makeTags.makeTags("Title","Meu primeiro site"));
        //4
        MakeOutWord makeOutWord = new MakeOutWord();
        System.out.println(makeOutWord.makeOutWord("{{}}","Java"));
        //5
        ExtraEnd extraEnd = new ExtraEnd();
        System.out.println(extraEnd.extraEnd("Kaka"));
        //6
        FirstTwo firstTwo = new FirstTwo();
        System.out.println(firstTwo.firstTwo("Loop"));
        //7
        FirstHalf firstHalf = new FirstHalf();
        System.out.println(firstHalf.firstHalf("Escola"));
        //8
        WithoutEnd withoutEnd = new WithoutEnd();
        System.out.println(withoutEnd.withoutEnd("Henrique"));
        //9
        ComboString comboString = new ComboString();
        System.out.println(comboString.comboString("aaa","bbbb"));
        //10
        NonStart nonStart = new NonStart();
        System.out.println(nonStart.nonStart("AB","Bola"));
        //11
        Left2 left2 = new Left2();
        System.out.println(left2.left2("CASA"));
        //12
        Right2 right2 = new Right2();
        System.out.println(right2.right2("CASAS"));
        //13
        TheEnd theEnd = new TheEnd();
        System.out.println(theEnd.theEnd("Lucas",true));
        //14
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        System.out.println(withoutEnd2.withouEnd2("ABC"));
        //15
        MiddleTwo middleTwo = new MiddleTwo();
        System.out.println(middleTwo.middleTwo("String"));
        //16
        EndsLy endsLy = new EndsLy();
        System.out.println(endsLy.endsLy("Correctly"));
        //17
        NTwice nTwice = new NTwice();
        System.out.println(nTwice.nTwice("ABC",3));
        //18
        TwoChar twoChar = new TwoChar();
        System.out.println(twoChar.twoChar("ABC",-1));
        //19
        MiddleThree middleThree = new MiddleThree();
        System.out.println(middleThree.middleThree("ABCDE"));
        //20
        HasBad hasBad = new HasBad();
        System.out.println(hasBad.hasBad("bad"));
        System.out.println(hasBad.hasBad_2("xbad"));
        //21
        AtFirst atFirst = new AtFirst();
        System.out.println(atFirst.atFirst("Lucas"));
        //22
        LastChars lastChars = new LastChars();
        System.out.println(lastChars.lastChars("ABA","DVD"));
        //23
        ConCat conCat = new ConCat();
        System.out.println(conCat.conCat("pig",""));
        //24
        LastTwo lastTwo = new LastTwo();
        System.out.println(lastTwo.lastTwo("CASA"));
        //25
        SeeColor seeColor = new SeeColor();
        System.out.println(seeColor.seeColor("red Papper"));
        //26
        FrontAgain frontAgain = new FrontAgain();
        System.out.println(frontAgain.frontAgain("ab"));
        //27
        MinCat minCat = new MinCat();
        System.out.println(minCat.minCat("Hello","hi"));
        //28
        ExtraFront extraFront = new ExtraFront();
        System.out.println(extraFront.extraFront("S"));
        //29
        Without2 without2 = new Without2();
        System.out.println(without2.without2("Olá"));
        //30
        DeFront deFront = new DeFront();
        System.out.println(deFront.deFront("ab"));
        //31
        StartWord startWord = new StartWord();
        System.out.println(startWord.startWord("hippo","xip"));
        //32
        WithoutX withoutX = new WithoutX();
        System.out.println(withoutX.withoutX("x"));
        //33
        WithoutX2 withoutX2 = new WithoutX2();
        System.out.println(withoutX2.withoutX2("xtxeste"));
        System.out.println(withoutX2.withoutX2_2("xtxeste"));
    }
}
