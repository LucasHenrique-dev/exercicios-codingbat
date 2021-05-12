package wordLen;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    //Retorne um Map que contenha como chaves cada String diferente, contida no Array, e como valor o seu "length".

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> palavras = new HashMap<>();
        for (String str :
                strings) {
            palavras.put(str,str.length());
        }
        return palavras;
    }
}
