package doubleChar;

public class DoubleChar {
    //Retorne uma String em que cada carctere da palavra original seja duplicado. (Ex.:("lucas") -> "lluuccaass").

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }
        return result.toString();
    }
}
