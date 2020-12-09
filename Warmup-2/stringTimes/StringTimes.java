package stringTimes;

public class StringTimes {
    //Retorne a uma String que seja n cópias da String original dada, para um n não negativo.

    public String stringTimes(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
