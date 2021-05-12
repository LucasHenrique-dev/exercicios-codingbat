package wordsCount;

public class WordsCount {
    //Dado um Array de Strings ("words"), retorne o número de Strings que possua o seu "length" coincidente com o "len".

    public int wordsCount(String[] words, int len) {
        int cont = 0;
        for (String word : words) {
            if (word.length() == len) cont++;
        }
        return cont;
    }
}
