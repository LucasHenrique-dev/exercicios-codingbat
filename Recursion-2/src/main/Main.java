package main;

import anagram.Anagram;
import groupNoAdj.GroupNoAdj;
import groupSum.GroupSum;
import groupSum5.GroupSum5;
import groupSum6.GroupSum6;
import groupSumClump.GroupSumClump;
import split53.Split53;
import splitArray.SplitArray;
import splitOdd10.SplitOdd10;

public class Main {
    public static void main(String[] args) {
        //1
        GroupSum groupSum = new GroupSum();
        System.out.println(groupSum.groupSum(0,new int[]{2, 4, 8},10));
        //2
        GroupSum6 groupSum6 = new GroupSum6();
        System.out.println(groupSum6.groupSum6(0,new int[]{5, 6, 2},7));
        //3
        GroupNoAdj groupNoAdj = new GroupNoAdj();
        System.out.println(groupNoAdj.groupNoAdj(0,new int[]{2, 5, 10, 4, 7, 6},15));
        //Teste-> System.out.println(groupNoAdj.groupNoAdj_visualizar(0,new int[]{2, 5, 10, 4},6));
        //4
        GroupSum5 groupSum5 = new GroupSum5();
        System.out.println(groupSum5.groupSum5(0,new int[]{2, 5, 10, 4},15));
        //5
        GroupSumClump groupSumClump = new GroupSumClump();
        System.out.println(groupSumClump.groupSumClump(0,new int[]{1, 2, 4, 8, 1},14));
        //6
        SplitArray splitArray = new SplitArray();
        System.out.println(splitArray.splitArray(new int[]{2, 3, 5, 10, 0, -10}));
        //7
        SplitOdd10 splitOdd10 = new SplitOdd10();
        System.out.println(splitOdd10.splitOdd10(new int[]{5, 5, 5}));
        //8
        Split53 split53 = new Split53();
        System.out.println(split53.split53(new int[]{3, 5, 2, 6, 6}));
        //****BONUS EXERCISE****
        Anagram anagram = new Anagram();
        anagram.anagram("","abc");
    }
}
