package FrontAgain;

public class FrontAgain {
    //Retorne true se as duas primeiras letras que iniciam a String também as termina. (Ex.: ("edited") -> true).

    public boolean frontAgain(String str) {
        if (str.length() <= 1) return false;
        return  (str.endsWith(str.substring(0,2)));
    }
}
