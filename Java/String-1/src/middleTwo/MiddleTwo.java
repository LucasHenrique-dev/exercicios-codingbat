package middleTwo;

public class MiddleTwo {
    //Retorne uma String formada pelos 2 chars centrais, a String dada deverá ter pelo menos 2 de "length".
    //(Ex.: ("String") -> "ri").

    public String middleTwo(String str) {
        int tamanho = str.length()/2;
        return str.substring(tamanho-1,tamanho+1);
    }
}
