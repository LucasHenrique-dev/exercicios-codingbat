package mirrorEnds;

public class MirrorEnds {
    //Retorne a maior String que esteja no comço da String dada "string" e que seja o espelho de outra que esteja no fim.
    //É possível que se sobreponha. Ex.:(("abXYZba") → "ab"; ("abca") → "a"; ("aba") → "aba").

    public String mirrorEnds(String string) {
        int tamanho = string.length();
        String result = "";
        for (int i = 0; i < tamanho; i++) {
            String info = string.substring(0,tamanho-i);
            StringBuilder stringBuilder = new StringBuilder("");
            for (int j = info.length() - 1; j >= 0; j--) {
                stringBuilder.append(info.charAt(j));
            }
            if (string.endsWith(stringBuilder.toString())) {
                result = info;
                break;
            }
        }
        return result;
    }
}
