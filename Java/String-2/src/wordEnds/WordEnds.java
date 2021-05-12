package wordEnds;

public class WordEnds {
    //Retorne uma String de modo que mostre os caracteres que estão antes e atrás de "word" (String do parâmetro) na String
    //"str", poderá haver repetição de caractere caso ele esteja entre 2 "word"."word" não será uma String vazia.
    //Ex.:(("abcXY123XYijk", "XY") → "c13i"; ("XY123XY", "XY") → "13"; ("XY1XY", "XY") → "11").

    public String wordEnds(String str, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int pos, dist;
            if (str.startsWith(word,i)) pos = str.indexOf(word,i+1);
            else pos = str.indexOf(word,i);
            if (pos == -1) pos = -2;
            dist = Math.abs(i-pos);
            if (dist == 1) stringBuilder.append(str.charAt(i));
            if (str.startsWith(word,i) && i+word.length() < str.length()){
                stringBuilder.append(str.charAt(i+word.length()));
            }
        }
        return stringBuilder.toString();
    }
}
