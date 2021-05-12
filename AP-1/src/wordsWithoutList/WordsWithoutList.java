package wordsWithoutList;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    //Dado um Array de Strings ("words"), retorne uma lista (ArrayList por exemplo) que contenha todas as Strings cujo
    //"length" não seja igual ao "len" dado.

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) result.add(word);
        }
        return result;
    }
}
