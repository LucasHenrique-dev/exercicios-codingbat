package main;

import countTriple.CountTriple;
import countYz.CountYz;
import equalIsNot.EqualIsNot;
import gHappy.GHappy;
import maxBlock.MaxBlock;
import mirrorEnds.MirrorEnds;
import notReplace.NotReplace;
import sameEnds.SameEnds;
import sumDigits.SumDigits;
import sumNumbers.SumNumbers;
import withoutString.WithoutString;

public class Main {
    public static void main(String[] args){
        //1
        CountYz countYz = new CountYz();
        System.out.println(countYz.countYZ("fiz day"));
        //2
        WithoutString withoutString = new WithoutString();
        System.out.println(withoutString.withoutString("This is a FISH", "IS"));
        //3
        EqualIsNot equalIsNot = new EqualIsNot();
        System.out.println(equalIsNot.equalIsNot("noisxxnotyynotxisi"));
        //4
        GHappy gHappy = new GHappy();
        System.out.println(gHappy.gHappy("xxgggxx"));
        //5
        CountTriple countTriple = new CountTriple();
        System.out.println(countTriple.countTriple("xxxabyyyycd"));
        //6
        SumDigits sumDigits = new SumDigits();
        System.out.println(sumDigits.sumDigits("011lucas02"));
        //7
        SameEnds sameEnds = new SameEnds();
        System.out.println(sameEnds.sameEnds("xxxxx"));
        //8
        MirrorEnds mirrorEnds = new MirrorEnds();
        System.out.println(mirrorEnds.mirrorEnds("aba"));
        //9
        MaxBlock maxBlock = new MaxBlock();
        System.out.println(maxBlock.maxBlock("xxxx"));
        //10
        SumNumbers sumNumbers = new SumNumbers();
        System.out.println(sumNumbers.sumNumbers("abc123xyz321"));
        //11
        NotReplace notReplace = new NotReplace();
        System.out.println(notReplace.notReplace("isis"));
    }
}
