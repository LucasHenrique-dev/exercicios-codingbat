package sumLimit;

public class SumLimit {
    //Dado 2 números não negativos, retorne sua soma, porém caso a soma possua mais digítos que "a", retorne apenas "a".
    //Ex.: ((8,3) -> 8).

    public int sumLimit(int a, int b) {
        int soma = a + b, tamanho = String.valueOf(soma).length();
        if (tamanho > String.valueOf(a).length()) return a;
        else return soma;
    }
}
