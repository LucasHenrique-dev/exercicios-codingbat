package endX;

public class EndX {
    //Dado uma String "str", retorne uma nova onde todos os "x" sejam movidos para o final. Fazer recursivamente.
    //Ex.:(("xhixhix") → "hihixxx"; ("xxhixx") → "hixxxx"; ("xxre") → "rexx").

    public String endX(String str) {
        if (str.length() <= 0) return "";
        char ch = str.charAt(0);
        if (ch == 'x') return endX(str.substring(1)) + ch;
        return ch + endX(str.substring(1));
    }
}
