package pairStar;

public class PairStar {
    //Dado uma String "str", retorne uma nova onde quaisquer letras idênticas que estejam adjacentes sejam separadas por
    //uma estrela "*". Fazer recursivamente. Ex.:(("aaaa") → "a*a*a*a"; ("xxyy") → "x*xy*y"; ("hello") → "hel*lo").

    public String pairStar(String str) {
        if (str.length() <= 1) return str;
        char ch1 = str.charAt(0), ch2 = str.charAt(1);
        if (ch1 == ch2) return ch1 + "*" + pairStar(str.substring(1));
        return ch1 + pairStar(str.substring(1));
    }
}
