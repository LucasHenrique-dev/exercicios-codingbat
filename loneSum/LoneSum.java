package loneSum;

public class LoneSum {
    //Retorne a soma dos 3 números dados ("a","b" e "c"), porém se houver números repetidos, exclua-o da soma.
    //Ex.: ((2,2,3) -> 3; (1,1,1) -> 0).

    public int loneSum(int a, int b, int c) {
        int soma = a+b+c;
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;
        else return soma;
    }

    //UM OUTRO JEITO DE SE PENSAR
    public int loneSum_2(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;

        // Solution notes: this code is a pretty direct translation
        // of the problem statement.
        // For each of a/b/c, check that it is different from
        // the other two before adding it to the sum variable
    }
}
