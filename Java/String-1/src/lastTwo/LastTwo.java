package lastTwo;

public class LastTwo {
    //Retorne uma String que os dois último chars estejam trocados, assim ("String") -> "Strign".

    public String lastTwo(String str) {
        int tam = str.length();
        if (str.length() < 2) return str;
        else return str.substring(0,str.length()-2) + str.charAt(tam-1) + str.charAt(tam-2);
    }
}
