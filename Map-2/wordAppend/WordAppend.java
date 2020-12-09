package wordAppend;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    //Retorne uma String que retorne as Strings que aparecem 2, 4, 6... vezes, em ordem de aparição, caso não tenha
    //retorne vazio. (Ex.: ("a","b","a") -> "a"; ("a","b","b","a","c","a","a") -> "baa").

    public String wordAppend(String[] strings) {
        Map<String,Integer> palavras = new HashMap<>();
        int div = 2;
        StringBuilder result = new StringBuilder();
        for (String str :
                strings) {
            if (!palavras.containsKey(str)) palavras.put(str, 1);
            else if ((palavras.get(str)+1)%div == 0) {
                result.append(str);
                palavras.put(str,palavras.get(str)+1);
            } else palavras.put(str,palavras.get(str)+1);
        }
        return result.toString();
    }

    //TRECHO DE CÓDIGO INTERESSANTE
//    map.forEach((k, v) -> System.out.println(String.format("key: %s | value: %s", k, v)));
}
