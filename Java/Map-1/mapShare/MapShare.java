package mapShare;

import java.util.Map;

public class MapShare {
    //Se houver a chave "a" faça com que "b" partilhe o seu mesmo valor e em todos os casos elimine a chave, juntamente
    //com o valor, "c".

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
