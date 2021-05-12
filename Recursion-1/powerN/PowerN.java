package powerN;

public class PowerN {
    //Dado uma 2 números ("base" e "n") maiores ou igual a 1, retorne quanto é "base" elevado a "n", recursivamente e sem
    //looping.

    public int powerN(int base, int n) {
        if (n > 1) base *= powerN(base, n-1);
        return base;
    }
}
