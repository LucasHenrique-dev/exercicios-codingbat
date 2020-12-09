package biggerTwo;

public class BiggerTwo {
    //Retorne o Array que possuir a maior soma dos valores, ambos terão "length" de 2 e se der empate, retorne o Array "a".

    public int[] biggerTwo(int[] a, int[] b) {
        int asum = 0, bsum = 0;
        for (int i = 0; i < 2; i++) {
            asum += a[i];
            bsum += b[i];
        }
        return (asum >= bsum)? a: b;
    }
}
