package hasTeen;

public class HasTeen {
    //Retorne true se pelo menos 1 dos 3 números dados estiver no range de 13...19, inclusive.

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b <= 19 && b >= 13) || (c >= 13 && c <= 19);
    }
}
