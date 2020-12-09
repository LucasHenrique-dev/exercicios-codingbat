package mapBully;

import java.util.Map;

public class MapBully {
    //Dado um mapa com chaves "a,b,c,d...", retorne-o com o valor de "b" sendo "a", caso só haja a "a"
    //deve-se criar uma "b", de modo que o valor de "a" seja sempre "".

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a","");
        }
        return map;
    }
}
