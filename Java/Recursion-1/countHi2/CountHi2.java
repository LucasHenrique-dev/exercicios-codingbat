package countHi2;

public class CountHi2 {
    //Dado uma String "str", retorne o número de vezes em que a string "hi" aparece, porém não deverá ser contado se houver
    //um "x" imediatamente antes

    public int countHi2(String str) {
        if (str.length() <= 1) return 0;
        char ch1 = str.charAt(0), ch2 = str.charAt(1);
        if (ch1 == 'h' && ch2 == 'i') return countHi2(str.substring(2)) + 1;
        if (ch1 == 'x' && ch2 == 'h') return countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }
}
