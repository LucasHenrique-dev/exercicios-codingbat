package evenlySpaced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenlySpaced {
    //Dado 3 inteiros ("a","b" e "c") e sabendo que há um maior, outro médio e um maior, retorne true se eles são igualmente
    //espaçados, ou seja, a diferença entre o menor e médio é a mesma que do médio para o maior. Caso não seja retorne false.

    public boolean evenlySpaced(int a, int b, int c) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(a); numeros.add(b); numeros.add(c);
        Collections.sort(numeros);
        int n1 = numeros.get(0), n2 = numeros.get(1), n3 = numeros.get(2);
        return (Math.abs(n1-n2) == Math.abs(n2-n3));
    }
}
