package lastDigit;

public class LastDigit {
    //Retorne true se 2 ou mais dos números dados possuírem os mesmos dígitos à direita, os números serão não negativos.

    public boolean lastDigit(int a, int b, int c) {
        if (a%10 == b%10) return true;
        if (a%10 == c%10) return true;
        return  (b%10 == c%10);
    }
}
