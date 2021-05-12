package mapAB;

import java.util.Map;

public class MapAB {
    //Se o Map possuir as keys "a" e "b", então retorne um Map que possua um key "ab" cujo valor seja a junçao do "a" e "b".

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab",map.get("a") + map.get("b"));
        }
        return map;
    }
}
