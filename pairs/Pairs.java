package pairs;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    //Retorne um Map que tenha como chaves a primeira letra de cada palavra e os valores serão as suas últimas letras
    //respectivas. (Ex.: (["moon","main"] -> {"m":"n}; (["dog","blue","daisy"]) -> {"d":"y","b":"e"}).

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> inicioFim = new HashMap<>();
        for (String str :
                strings) {
            inicioFim.put(str.substring(0,1), str.substring(str.length()-1));
        }
        return inicioFim;
    }
}
