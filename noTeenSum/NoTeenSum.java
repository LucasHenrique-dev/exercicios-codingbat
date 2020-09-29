package noTeenSum;

public class NoTeenSum {
    //Dados 3 números inteiros ("a","b" e "c"), retorne a sua soma. Caso eles estejam no intervalo de 13 a 19, inclusive,
    //o seu valor passa a ser zero, porém os números 15 e 16 não contarão, eles permaneceram valendo. Crie um função auxiliar
    //"public int fixTeen(int n)" que retornará o valor do número ajuatado à regra.

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    public int fixTeen(int n){
        if ((n != 15 && n != 16) && (n >= 13 && n <= 19)) return 0;
        else return n;
    }
}
