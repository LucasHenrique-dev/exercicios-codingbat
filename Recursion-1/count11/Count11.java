package count11;

public class Count11 {
    //Dada uma String "str", retorne o número de vezes em que o "11" aparece, ele não pode sobrepor. Fazer recursivamente,
    //sem loopings. Ex.:(("111") → 1; ("abc11x11x11") → 3; ("11abc11") → 2).

    public int count11(String str) {
        if (str.length() <= 1) return 0;
        char ch1 = str.charAt(0), ch2= str.charAt(1);
        if (ch1 == ch2 && ch1 == '1') return count11(str.substring(2)) + 1;
        return count11(str.substring(1));
    }
}
