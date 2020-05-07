package altPairs;

public class AltPairs {
    //Retorne a String com os índices 0,1,4,5,8,9....

    public String altPairs(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            if (i%2 == 1) i += 2;
        }
        return stringBuilder.toString();
    }

    //OUTRA FORMA DE PENSAR
    public String altPairs_2(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i=0; i<str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }
}
