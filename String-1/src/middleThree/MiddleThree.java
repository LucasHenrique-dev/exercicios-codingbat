package middleThree;

public class MiddleThree {
    //Retorne as 3 letras centrais, a String dada deve ter um "length" ímpar e de tamanho pelo menos 3.

    public String middleThree(String str) {
        int tamanho = str.length()/2;
        return str.substring(tamanho-1,tamanho+2);
    }
}
