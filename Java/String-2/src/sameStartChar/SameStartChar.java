package sameStartChar;

public class SameStartChar {
    //Retorne true se na String dada houver um asterísco "*" e ele for sucedido e precedido pelo memso dígito, caso não
    //retorne false.

    public boolean sameStarChar(String str) {
        for (int i = 0; i < str.length() -1; i++){
            if (str.charAt(i) == '*' && i != 0){
                String anterior = str.substring(i-1,i);
                String posterior = str.substring(i+1,i+2);
                if (!anterior.equals(posterior)) return false;
            }
        }
        return true;
    }

    //SIMPLIFICANDO AS COISAS...
    public boolean sameStarChar_2(String str) {
        for (int i=1; i<str.length()-1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i-1) != str.charAt(i+1)) return false;
            }
        }
        return true;

        // Solution notes: loop through the chars 1..len-2 (that is,
        // skip over the first and last chars). Each time that the char
        // is '*', check that the chars before and after it are equal. If they
        // are not, return false immediately.
    }
}
