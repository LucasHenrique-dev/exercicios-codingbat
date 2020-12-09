package allStar;

public class AllStar {
    //Dado uma String "str", retorne uma nova que contenha uma estrela "*" entre cada letra. Fazer recursivamente.
    //Ex.:(("hello") → "h*e*l*l*o"; ("abc") → "a*b*c"; ("ab") → "a*b").

    public String allStar(String str) {
        if (str.length() <= 0) return "";
        char ch = str.charAt(0);
        if (str.length() == 1) return ch + allStar(str.substring(1));
        return ch + "*" + allStar(str.substring(1));
    }
}
