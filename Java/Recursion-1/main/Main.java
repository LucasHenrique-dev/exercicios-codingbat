package main;

import allStar.AllStar;
import array11.Array11;
import array220.Array220;
import array6.Array6;
import bunnyEars.BunnyEars;
import bunnyEars2.BunnyEars2;
import changePi.ChangePi;
import changeXY.ChangeXY;
import count11.Count11;
import count7.Count7;
import count8.Count8;
import countABC.CountABC;
import countHi.CountHi;
import countHi2.CountHi2;
import countPairs.CountPairs;
import countX.CountX;
import endX.EndX;
import factorial.Factorial;
import fibonacci.Fibonacci;
import nestParen.NestParen;
import noX.NoX;
import pairStar.PairStar;
import parenBit.ParenBit;
import powerN.PowerN;
import strCopies.StrCopies;
import strCount.StrCount;
import strDist.StrDist;
import stringClean.StringClean;
import sumDigits.SumDigits;
import triangle.Triangle;

public class Main {
    public static void main(String[] args){
        //1
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(6));
        //2
        BunnyEars bunnyEars = new BunnyEars();
        System.out.println(bunnyEars.bunnyEars(12));
        //3
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(4));
        //4
        BunnyEars2 bunnyEars2 = new BunnyEars2();
        System.out.println(bunnyEars2.bunnyEars2(2));
        //5
        Triangle triangle = new Triangle();
        System.out.println(triangle.triangle(4));
        //6
        SumDigits sumDigits = new SumDigits();
        System.out.println(sumDigits.sumDigits(999));
        //7
        Count7 count7 = new Count7();
        System.out.println(count7.count7(717));
        //8
        Count8 count8 = new Count8();
        System.out.println(count8.count8(8818));
        //9
        PowerN powerN = new PowerN();
        System.out.println(powerN.powerN(3,2));
        //10
        CountX countX = new CountX();
        System.out.println(countX.countX("xbox"));
        //11
        CountHi countHi = new CountHi();
        System.out.println(countHi.countHi("hixhi"));
        System.out.println(countHi.countHi_2("hi"));
        //12
        ChangeXY changeXY = new ChangeXY();
        System.out.println(changeXY.changeXY("xbox"));
        //13
        ChangePi changePi = new ChangePi();
        System.out.println(changePi.changePi("pipi"));
        System.out.println(changePi.changePi_2("ippii"));
        //14
        NoX noX = new NoX();
        System.out.println(noX.noX("xbox"));
        //15
        Array6 array6 = new Array6();
        System.out.println(array6.array6(new int[]{2,3,4},0));
        //16
        Array11 array11 = new Array11();
        System.out.println(array11.array11(new int[]{11,2,3,11},0));
        //17
        Array220 array220 = new Array220();
        System.out.println(array220.array220(new int[]{11,2,3,0,1,10},0));
        //18
        AllStar allStar = new AllStar();
        System.out.println(allStar.allStar("LUCAS"));
        //19
        PairStar pairStar = new PairStar();
        System.out.println(pairStar.pairStar("aaa"));
        //20
        EndX endX = new EndX();
        System.out.println(endX.endX("hxixhix"));
        //21
        CountPairs countPairs = new CountPairs();
        System.out.println(countPairs.countPairs("axaxa"));
        //22
        CountABC countABC = new CountABC();
        System.out.println(countABC.countAbc("abaxabsabc"));
        //23
        Count11 count11 = new Count11();
        System.out.println(count11.count11("1111"));
        //24
        StringClean stringClean = new StringClean();
        System.out.println(stringClean.stringClean("GGE"));
        //25
        CountHi2 countHi2 = new CountHi2();
        System.out.println(countHi2.countHi2("xxxhixjhi"));
        //26
        ParenBit parenBit = new ParenBit();
        System.out.println(parenBit.parenBit("xyz(abc)123"));
        //27
        NestParen nestParen = new NestParen();
        System.out.println(nestParen.nestParen(""));
        //28
        StrCount strCount = new StrCount();
        System.out.println(strCount.strCount("aaabababab","ab"));
        //29
        StrCopies strCopies = new StrCopies();
        System.out.println(strCopies.strCopies("iiiiij", "iii", 3));
        //30
        StrDist strDist = new StrDist();
        System.out.println(strDist.strDist("cccatcowcatxx", "cat"));
    }
}
