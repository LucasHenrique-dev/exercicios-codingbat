package word0;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    //Retorne um Map que possua como chaves cada elemento distinto que há no Array de Strings e que seus valores sejam 0.

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> letras = new HashMap<>();
        for (String str: strings) {
            letras.put(str,0);
        }
        return letras;
    }
}
