package sumDigits;

public class SumDigits {
    //Dado um número "n", retorne a soma dos dígitos desse algarismo. Ex.:((123) -> 6; (325) -> 10; (12) -> 3).

    public int sumDigits(int n) {
        if (n%10 != n) n = n%10 + sumDigits(n/10);
        return n;
    }
}
