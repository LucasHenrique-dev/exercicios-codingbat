package roundSum;

public class RoundSum {
    //Dados 3 números inteiros ("a","b" e "c"), retorne a sua soma obedecendo a seguinte lógica:
    //-Se o dígito mais a direita for 5 ou mais, arredonde-o para o múltipo de 10 mais a cima. Ex.: 15 -> 20.
    //-Se o dígito mais a direita for menor que 5, arredonde-o para o múltipo de 10 mais a baixo. Ex.: 14 -> 10.
    //Para isso crie uma função auxiliar "public int round10(int num)" que retornará o número ajustado a essa regra.

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num){
        int unidade = num % 10;
        if (unidade >= 5) return num + (10-unidade);
        else return num - unidade;
    }

    //LEVEMENTE DIFERENTE, MAS INTERESSANTE
    public int roundSum_2(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    // Helper function to round a value based on its last digit.
    public int round10_2(int num) {
        int remainder = num % 10;
        num -= remainder;
        if (remainder >= 5) {
            num += 10;
        }
        return num;
    }
}
