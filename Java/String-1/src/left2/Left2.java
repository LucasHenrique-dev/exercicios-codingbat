package left2;

public class Left2 {
    //Retorne a String dada de modo que suas primeiras duas letras estejam no fim. A String terá que ter pelo menos 2 de
    //length. (Ex.: ("CASA") -> "SACA").

    public String left2(String str) {
        return str.substring(2) + str.substring(0,2);
    }
}
