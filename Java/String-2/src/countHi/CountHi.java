package countHi;

public class CountHi {
    //Retorne a quantidade de vezes que a palavra "hi" aparece na String dada.

    public int countHi(String str) {
        int cont = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i,i+2).equals("hi")) cont++;
        }
        return cont;
    }
}
