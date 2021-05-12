package right2;

public class Right2 {
    //Retorne a String dada de modo que suas últimas duas letras estejam no início. A String terá que ter pelo menos 2 de
    //length. (Ex.: ("CASAS") -> "ASCAS").

    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }
}
