package teenSum;

public class TeenSum {
    //Retorne a soma dos 2 números dados, entretanto se eles estiverem no intervalo entre 13 e 19, inclusive, retorne 19.

    public int teenSum(int a, int b) {
        int result;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) result = 19;
        else result = a+b;
        return result;
    }
}
