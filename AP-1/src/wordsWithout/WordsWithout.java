package wordsWithout;

public class WordsWithout {
    //Dado um Array de Strings ("words") e uma String "target", retorne outro Array de Strings baseado no original, porém
    //que possua todas as ocorrências do "target" removidas.

    public String[] wordsWithout(String[] words, String target) {
        String[] result;
        int cont = 0, i = 0;
        for (String str: words){
            if (str.equals(target)) cont++;
        }
        result = new String[words.length-cont];
        for (String str: words){
            if (!str.equals(target)) result[i++] = str;
        }
        return result;
    }
}
