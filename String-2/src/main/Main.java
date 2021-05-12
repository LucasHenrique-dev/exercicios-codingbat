package main;

import bobThere.BobThere;
import catDog.CatDog;
import countCode.CountCode;
import doubleChar.DoubleChar;
import countHi.CountHi;
import endOther.EndOther;
import getSandwich.GetSandwich;
import mixString.MixString;
import oneTwo.OneTwo;
import plusOut.PlusOut;
import prefixAgain.PrefixAgain;
import repeatEnd.RepeatEnd;
import repeatFront.RepeatFront;
import repeatSeparator.RepeatSeparator;
import sameStartChar.SameStartChar;
import starOut.StarOut;
import wordEnds.WordEnds;
import xyBalance.XyBalance;
import xyzMiddle.XyzMiddle;
import xyzThere.XyzThere;
import zipZap.ZipZap;

public class Main {
    public static void main(String[] args){
        //1
        DoubleChar doubleChar = new DoubleChar();
        System.out.println(doubleChar.doubleChar("LUCAS"));
        //2
        CountHi countHi = new CountHi();
        System.out.println(countHi.countHi("Hilux"));
        //3
        CatDog catDog = new CatDog();
        System.out.println(catDog.catDog("cat lucas dog cat marta dog"));
        //4
        CountCode countCode = new CountCode();
        System.out.println(countCode.countCode("cozexxcope"));
        //5
        EndOther endOther = new EndOther();
        System.out.println(endOther.endOther("Hiabc", "AbC"));
        //6
        XyzThere xyzThere = new XyzThere();
        System.out.println(xyzThere.xyzThere("a.xyzxyz"));
        //7
        BobThere bobThere = new BobThere();
        System.out.println(bobThere.bobThere("b9b"));
        //8
        XyBalance xyBalance = new XyBalance();
        System.out.println(xyBalance.xyBalance("xxxyxyxyyyyx"));
        System.out.println(xyBalance.xyBalance_3("rato"));
        //9
        MixString mixString = new MixString();
        System.out.println(mixString.mixString("xyz", "abc"));
        //10
        RepeatEnd repeatEnd = new RepeatEnd();
        System.out.println(repeatEnd.repeatEnd("book",2));
        //11
        RepeatFront repeatFront = new RepeatFront();
        System.out.println(repeatFront.repeatFront("estudos",4));
        //12
        RepeatSeparator repeatSeparator = new RepeatSeparator();
        System.out.println(repeatSeparator.repeatSeparator("quaren","tena ",10));
        //13
        PrefixAgain prefixAgain = new PrefixAgain();
        System.out.println(prefixAgain.prefixAgain("aa",1));
        //14
        XyzMiddle xyzMiddle = new XyzMiddle();
        System.out.println(xyzMiddle.xyzMiddle("xyz"));
        //15
        GetSandwich getSandwich = new GetSandwich();
        System.out.println(getSandwich.getSandwich("breadcheesebread"));
        //16
        SameStartChar sameStartChar = new SameStartChar();
        System.out.println(sameStartChar.sameStarChar("abcDEF"));
        //17
        OneTwo oneTwo = new OneTwo();
        System.out.println(oneTwo.oneTwo("AbcDe"));
        //18
        ZipZap zipZap = new ZipZap();
        System.out.println(zipZap.zipZap("zi"));
        //19
        StarOut starOut = new StarOut();
        System.out.println(starOut.starOut("sm***eil*ly"));
        //20
        PlusOut plusOut = new PlusOut();
        System.out.println(plusOut.plusOut("12xy34xyabcxy","xy"));
        //21
        WordEnds wordEnds = new WordEnds();
        System.out.println(wordEnds.wordEnds("abc1xyz11", "1"));
    }

}
