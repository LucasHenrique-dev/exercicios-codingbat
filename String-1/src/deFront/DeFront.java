package deFront;

public class DeFront {
    //Retorne uma String sem as 2 primeiras letras, exceto se a primeira for "a" ou a segunda for "b", nesses casos mantenha-as.

    public String deFront(String str) {
        if (str.length() <= 2 && !str.contains("a") && !str.contains("b")) return "";
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') return str;
        if (str.charAt(0) == 'a') return str.substring(0,1) + str.substring(2);
        if (str.charAt(1) == 'b') return str.substring(1);
        return str.substring(2);
    }
}
