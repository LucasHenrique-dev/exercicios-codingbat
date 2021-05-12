package count7;

public class Count7 {
    //Dado um número "n", retorne o número de ocorrência do número "7" como dígito, nesse número dado. Fazer recursivamente
    //e sem looping. Ex.:((717) -> 2; (17) -> 1; (932) -> 0).

    public int count7(int n) {
        int cont = 0;
        if (n % 10 != n) cont += count7(n/10);
        if (n % 10 == 7) cont++;
        return cont;
    }
}
