package firstHalf;

public class FirstHalf {
    //Retorne uma String que seja a metade da String dada, não há limite de tamanho para a String;

    public String firstHalf(String str) {
        int tamanho = str.length()/2;
        return str.substring(0,tamanho);
    }
}
