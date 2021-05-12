package stringClean;

public class StringClean {
    //Dada uma String "str", retorne uma nova onde toda ocorrência de caracteres duplicados e adjacentes sejam substituídos
    //por apenas 1, fazer recursivamente. Ex.:(("abbbcdd") → "abcd"; ("Hello") → "Helo"; ("yyzzza") → "yza").

    public String stringClean(String str) {
        if (str.length() <= 1) return str;
        char ch1 = str.charAt(0), ch2 = str.charAt(1);
        if (ch1 == ch2) return stringClean(str.substring(1));
        return ch1 + stringClean(str.substring(1));
    }
}
