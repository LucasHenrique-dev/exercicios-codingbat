package countABC;

public class CountABC {
    //Dada um String "str", retorne o número de vezes que aparece a String "abc" e "aba", fazer recursivamente.

    public int countAbc(String str) {
        if (str.length() <= 2) return 0;
        char ch1 = str.charAt(0), ch2 = str.charAt(1), ch3 = str.charAt(2);
        if  (ch1 == 'a' && ch2 == 'b' && (ch3 == 'a' || ch3 == 'c'))
            return countAbc(str.substring(1)) + 1;
        return countAbc(str.substring(1));
    }
}
