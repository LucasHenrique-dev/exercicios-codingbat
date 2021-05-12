package strDist;

public class StrDist {
    //Dada uma String "str", retorne o tamanho da maior substring que começe e termine com "sub" (string não nula). Fazer
    //recursivamente. Ex.:(("catcowcat", "cat") → 9; ("cccatcowcatxx", "cat") → 9; ("catcowcat", "cow") → 3).

    public int strDist(String str, String sub) {
        int last = str.length();
        if (str.length() <= 0) return 0;
        if (!str.startsWith(sub)) return strDist(str.substring(1),sub);
        if (!str.endsWith(sub)) return strDist(str.substring(0,last-1),sub);
        return str.length();
    }
}
