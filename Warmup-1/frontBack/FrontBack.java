package frontBack;

public class FrontBack {
    //Retorne a String dada trocando as letra do início e do final.

    public String frontBack(String str) {
        if (!str.isEmpty()) {
            char[] ch = str.toCharArray();
            char aux = ch[str.length() - 1];
            ch[str.length() - 1] = ch[0];
            ch[0] = aux;
            StringBuilder strBuilder = new StringBuilder();
            for (char ch2 :
                    ch) {
                strBuilder.append(ch2);
            }
            str = strBuilder.toString();
            return str;
        }
        return str;
    }

    //JEITO NINJA!!!
    public String frontBack2(String str){
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
}
