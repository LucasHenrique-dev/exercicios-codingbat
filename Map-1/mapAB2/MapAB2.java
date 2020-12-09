package mapAB2;

import java.util.Map;

public class MapAB2 {
    //Se no Map houver as keys "a" e "b" e ambas tiverem os mesmos valores então remova-as e retorne o Map alterado.

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
