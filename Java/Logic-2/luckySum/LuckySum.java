package luckySum;

import java.util.ArrayList;

public class LuckySum {
    //Retorne a soma dos números inteiros dados ("a","b" e "c"), porém se algum deles for 13, ignore-o daí em diante.
    //Ex.: ((1,2,13) -> 3; (2,13,4) -> 2; (13,4,5) -> 0).

    public int luckySum(int a, int b, int c) {
        int soma = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(a); numeros.add(b); numeros.add(c);
        int num13 = numeros.indexOf(13);
        if (num13 < 0) num13 = numeros.size();
        for (int n:
        numeros.subList(0,num13)) {
            soma+=n;
        }
        return soma;
    }
}
