package frontTimes;

public class FrontTimes {
    //Retorne as 3 primeiras letras da String n vezes, ou que ela tiver (caso seja menor que 3), para n >= 0.

    public String frontTimes(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() < 3){
            for (int i = 0; i < n; i++) {
                stringBuilder.append(str);
            }
        } else {
            for (int i = 0; i < n; i++) {
                stringBuilder.append(str.substring(0,3));
            }
        }
        return stringBuilder.toString();
    }

    //ENGENHOSO
    public String frontTimes_2(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
}
