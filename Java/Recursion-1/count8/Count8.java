package count8;

public class Count8 {
    //Dado um número "n" retorne o número de vezes em que o "8" aparece como dígito nesse número, porém caso um "8" for
    //seguido imediatamente por outro, será contado como 2. Ex.:((8818) → 4; (818) → 2; (8) → 1). Fazer recursivamente e
    //sem loopings.

    public int count8(int n) {
        int cont = 0;
        if (n%10 != n) cont = count8(n/10);
        if (n%10 == 8) {
            cont++;
            if ((n / 10) % 10 == 8) cont++;
        }
        return cont;
    }
}
