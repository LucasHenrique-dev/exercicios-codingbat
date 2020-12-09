package countXX;

public class CountXX {
    //Retorne a quantidade de vezes que "XX" aparece na String, sobreposição é permitido. (EX.: "xxxx" -> 3; "xxx" -> 2).

    public int countXX(String str) {
        int cont = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i+2).equals("xx")){
                cont++;
            }
        }
        return cont;
    }
}
