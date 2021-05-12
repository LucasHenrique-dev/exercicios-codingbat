package strCopies;

public class StrCopies {
    //Dada uma String "str", retorne true se a quantidade de vezes em que "sub" aparece é maior ou igual a "n" (número não
    //negativo) e "sub" poderá sobrepor. Fazer recursivamente.
    //Ex.:(("catcowcat", "cow", 1) → true; ("catcowcat", "cow", 2) → false; ("catcowcat", "cat", 2) → true).

    public boolean strCopies(String str, String sub, int n) {
        if (str.length() <= sub.length()-1) return n <= 0;
        if (str.charAt(0) == sub.charAt(0)){
            for (int i = 1; i < sub.length(); i++) {
                if (str.charAt(i) != sub.charAt(i))
                    return strCopies(str.substring(1), sub, n);
            }
            return strCopies(str.substring(1),sub,n-1);
        }
        return strCopies(str.substring(1), sub, n);
    }

    //UM JEITO INTERESSANTE DE SE RESOLVER
    public boolean strCopies_2(String str, String sub, int n) {
        if (n == 0) return true;
        int len = sub.length();
        if (str.length() < len) return false;

        if (str.substring(0, len).equals(sub)) {
            // Found it, so subtract 1 from n in the recursion
            return strCopies_2(str.substring(1), sub, n-1);
        } else {
            return strCopies_2(str.substring(1), sub, n);
        }
    }
}
