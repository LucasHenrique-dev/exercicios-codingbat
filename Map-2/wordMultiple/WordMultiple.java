package wordMultiple;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    //Retorne um Map<String, boolean> que se relacione com o Array de Strings da seguinte forma: as chaves serão cada valor
    //diferente e os valores serão true se ele se repete 2 ou + vezes no Array e false, caso não.

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        int cont = 0;
        for (String str :
                strings) {
            for (String string : strings) {
                if (string.equals(str)) cont++;
                if (cont == 2) {
                    result.put(str, true);
                    break;
                }
                result.put(str, false);
            }
            cont = 0;
        }
        return result;
    }
    
    //OUTRO JEITO, JEITO NINJA!
    public Map<String, Boolean> wordMultiple_2(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String str: strings) {
            result.put(str, result.containsKey(str));
        }
        return result;
    }
}
