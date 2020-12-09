package mapAB4;

import java.util.Map;

public class MapAB4 {
    //Se no Map houver as keys "a" e "b" com valores de tamanhos diferentes, então crie/altere uma key "c"
    //para que tenha o valor da maior, caso os valores de "a" e "b" sejam os mesmo então transforme em "".

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));
                } else map.put("c", map.get("b"));
            } else {
                map.put("a","");
                map.put("b","");
            }
        }
        return map;
    }
}
