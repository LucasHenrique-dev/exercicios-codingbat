package plusTwo;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class PlusTwo {
    //Dados 2 Arrays de "length" 2, retorne um 3° de tamanho 4 que contenha todos os elementos dos 2.

    public int[] plusTwo(int[] a, int[] b) {
        int[] sum = new int[a.length+b.length];
        System.arraycopy(a, 0, sum, 0, a.length);
        System.arraycopy(b,0,sum ,a.length , b.length);
        return sum;
    }

    //2° JEITO... SITE NÃO ACEITOU O 1° ;-;.
    public int[] plusTwo_2(int[] a, int[] b) {
        int[] sum = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum[i+a.length] = b[i];
        }
        return sum;
    }
}
