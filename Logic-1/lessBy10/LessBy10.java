package lessBy10;

import java.util.ArrayList;
import java.util.List;

public class LessBy10 {
    //Retorne true se um dos números for pelo menos 10 unidades a menos ou mais que outro.

    public boolean lessBy10(int a, int b, int c) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(a); numeros.add(b); numeros.add(c);
        for (int i = 0; i < numeros.size(); i++) {
            int dif;
            if (i == numeros.size()-1)
                dif = Math.abs(numeros.get(i)-numeros.get(0));
            else dif = Math.abs(numeros.get(i)-numeros.get(i+1));
            if (dif >= 10) return true;
        }
        return false;
    }

    //REALMENTE INTERESSANTE KKK.
    public boolean lessBy10_2(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 ||
                Math.abs(b - c) >= 10 ||
                Math.abs(a - c) >= 10);

        // Solution notes: it's a bit surprising that this can be so short.
        // We simplify by using Math.abs() to take the absolute value --
        // say with the ab pair, one is smaller and one is bigger, but we don't
        // care which is which, since we are just looking for a difference
        // of 10 or more.
    }
}
