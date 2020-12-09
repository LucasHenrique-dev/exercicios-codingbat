package max1020;

public class Max1020 {
    //Retorne o maior número entre o range 10...20, inclusive, ou zero se ambos não estiverem no range.

    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
            return b >= 10 && b <= 20 && b > a ? b : a <= 20 ? a: b;
        } else return 0;
    }

    //INTERESSANTE
    public int max1020_2(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
