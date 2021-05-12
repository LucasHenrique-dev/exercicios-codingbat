package strCount;

public class StrCount {
    //Dada uma String "str", retorne o número de vezes em que "sub" aparece, sem sobreposição. Fazer recursivamente.
    //Ex.:(("catcowcat", "dog") → 0; ("catcowcat", "cow") → 1; ("catcowcat", "cat") → 2).

    public int strCount(String str, String sub) {
        if (str.length() <= sub.length()-1) return 0;
        if (str.charAt(0) == sub.charAt(0)){
            for (int i = 1; i < sub.length(); i++) {
                if (str.charAt(i) != sub.charAt(i))
                    return strCount(str.substring(1),sub);
            }
            return strCount(str.substring(sub.length()),sub) + 1;
        }
        return strCount(str.substring(1),sub);
    }
}
