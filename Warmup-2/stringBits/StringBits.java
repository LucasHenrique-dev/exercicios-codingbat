package stringBits;

public class StringBits {
    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    public String stringBits(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
