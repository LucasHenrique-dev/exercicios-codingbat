package zipZap;

public class ZipZap {
    //Retorne uma String em que todos os pares do tipo "zip" e "zap" (começem com "z" e terminem com "p"), tenham as suas
    //letras do meio removidas. Ex.:(("zipXzap") → "zpXzp"; ("zzzopzop") → "zzzpzp").

    public String zipZap(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String trio;
            if (i < str.length()-2) {
               trio = str.substring(i, i + 3);
            } else trio = "";
            if (trio.startsWith("z") && trio.endsWith("p")){
                stringBuilder.append(trio.charAt(0));
                stringBuilder.append(trio.charAt(2));
                i += 2;
            } else stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
