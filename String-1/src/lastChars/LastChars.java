package lastChars;

public class LastChars {
    //Retorne uma String que seja a junção da primeira letra da String "a" e a última letra da String "b", caso o "length"
    //de alguma delas for 0, use "@".

    public String lastChars(String a, String b) {
        if (a.isEmpty()) a = "@";
        if (b.isEmpty()) b = "@";
        return a.substring(0,1) + b.substring(b.length() - 1);
    }
}
