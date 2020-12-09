package mapAB3;

import java.util.Map;

public class MapAB3 {
    //Se houver a key "a" ou "b", mas não ambos, crie a key que falta com o valor da que já possui.

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")){
            map.put("b",map.get("a"));
        }
        if (map.containsKey("b") && !map.containsKey("a")){
            map.put("a",map.get("b"));
        }
        return map;
    }
}
