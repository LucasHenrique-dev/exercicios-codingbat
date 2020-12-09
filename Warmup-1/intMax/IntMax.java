package intMax;

public class IntMax {
    //Retorne o maior do 3 números.

    public int intMax(int a, int b, int c) {
        int max = 0;
        max = Math.max(a, b);
        return Math.max(max, c);
    }
}
