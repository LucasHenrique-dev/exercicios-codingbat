package countPairs;

public class CountPairs {
    //Dado uma String "str", retorne o número de vezes em que um "par" (2 caracteres idênticos, separados por um caractere)
    //aparece, eles podem se sobrepor. Fazer recursivamente. Ex.:(("AxAxA")-> 3; ("axax") → 2; ("axbx") → 1).

    public int countPairs(String str) {
        if (str.length() <= 2) return 0;
        char ch1 = str.charAt(0), ch2 = str.charAt(2);
        if (ch1 == ch2) return countPairs(str.substring(1)) + 1;
        return countPairs(str.substring(1));
    }
}
