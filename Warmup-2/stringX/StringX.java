package stringX;

public class StringX {
    //Retorne a String sem nenhum "x", exceto se ele começar ou terminar a String.

    public String stringX(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == 'x' && (i != 0 && i != str.length()-1))) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
