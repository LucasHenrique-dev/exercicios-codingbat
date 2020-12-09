package stringSplosion;

public class StringSplosion {
    //Given a non-empty string like "Code" return a string like "CCoCodCode".

    public String stringSplosion(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.substring(0,i+1));
        }
        return stringBuilder.toString();
    }
}
