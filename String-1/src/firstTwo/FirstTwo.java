package firstTwo;

public class FirstTwo {
    //Retorne um String que seja as duas primeiras letras da String dada ou o que for que ela tenha até lá.

    public String firstTwo(String str) {
        int tamanho = 2;
        if (str.length() < 2){
            tamanho = str.length();
        }
        return str.substring(0,tamanho);
    }
}
