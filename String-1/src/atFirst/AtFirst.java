package atFirst;

public class AtFirst {
    //Retorne uma String feita com as duas primeiras letras da String dada, caso o "length" seja menor que 2 complete o
    //que falta com "@".

    public String atFirst(String str) {
        if (str.length() < 2){
            str += "@@";
        }
        return str.substring(0,2);
    }
}
