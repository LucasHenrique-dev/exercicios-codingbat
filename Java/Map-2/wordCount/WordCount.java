package wordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    //Retorne um Map que tenha como chaves cada String diferente que houver no Array e seus valores serão quantas vezes
    //ela aparece.

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> palavras = new HashMap<>();
        for (String str :
                strings) {
            if (!palavras.containsKey(str)) palavras.put(str,1);
            else palavras.put(str, palavras.get(str) + 1);
        }
        return palavras;
    }
}
