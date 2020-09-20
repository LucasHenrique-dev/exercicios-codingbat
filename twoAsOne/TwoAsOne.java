package twoAsOne;

import java.util.ArrayList;
import java.util.List;

public class TwoAsOne {
    //Retorne true se a soma de dois dos números dados, resulta em outro, caso contrário retorne false.

    public boolean twoAsOne(int a, int b, int c) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(a); numeros.add(b); numeros.add(c);
        for (int i = 0; i < numeros.size(); i++) {
            int soma;
            if (i == numeros.size()-1){
                soma = numeros.get(i)+numeros.get(0);
            } else soma = numeros.get(i)+numeros.get(i+1);
            if (numeros.contains(soma)) return true;
        }
        return false;
    }
}
