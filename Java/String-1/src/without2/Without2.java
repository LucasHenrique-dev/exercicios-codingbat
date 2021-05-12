package without2;

public class Without2 {
    //Se as duas primeiras letras que começam a String também as terminam, então retorne a String sem essas 2 primeiras
    //letras de modo que se for ("Hi") -> "", caso contrário retorne a String inalterada.

    public String without2(String str) {
        if (str.length() < 2 || !str.endsWith(str.substring(0,2))) return str;
        return str.substring(2);
    }
}
