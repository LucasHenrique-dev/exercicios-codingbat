package scoresSpecial;

public class ScoresSpecial {
    //Dado 2 Arrays numéricos ("a" e "b") de números não negativos retorne a soma dos maiores "números especiais" de cada
    //Array. Sabendo que um número é considerado "especial" quando ele é múltiplo de 10. Para resolver o problema, deve-se
    //utilizar um método auxiliar. Ele será responsável por identificar o maior "número especial" dos Arrays dados.

    public int scoresSpecial(int[] a, int[] b) {
        int result = 0;
        result += maiorEspecial(a);
        result += maiorEspecial(b);
        return result;
    }

    public int maiorEspecial(int[] nums){
        int maiorEsp = 0;
        for (int num : nums) {
            if (num % 10 == 0 && num > maiorEsp) maiorEsp = num;
        }
        return maiorEsp;
    }
}
