package backAround;

public class BackAround {
    //Retorne a String dada sendo contida pela última letra dada, tanto na frnte como atrás. (Ex.: cat -> tcatt).

    public String backAround(String str) {
        if (str.length() >= 1){
            return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
        } else {
            return "A sua String deve ter pelo menos 1 letra";
        }
    }
}