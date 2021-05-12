package sameEnds;

public class SameEnds {
    //Retorne a maior String que está presente no início e fim da String dada "string", ela não sobrepõe.
    //Ex.: (("abXYab") → "ab"; ("xx") → "x"; ("xxx") → "x").

    public String sameEnds(String string) {
        String result = "";
        int cont = 0;
        for (int i = string.length()/2; i > 0; i--) {
            String info = string.substring(0,i);
            if (string.endsWith(info)) {
                result = info;
                break;
            }
        }
        for (char letra :
                result.toCharArray()) {
            if (result.charAt(0) == letra) cont++;
        }
        if (cont*2 > string.length()) return String.valueOf(result.charAt(0));
        else return result;
    }
}
