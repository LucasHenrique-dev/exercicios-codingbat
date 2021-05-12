package topping3;

import java.util.Map;

public class Topping3 {
    //Retorne um Map em que havendo a key "potato", deve-se mudar/criar uma key "fries" com o mesmo valor, o mesmo vale
    //se houver uma key "salad", porém deverá haver a key "spinach" com o mesmo valor.

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")){
            map.put("fries",map.get("potato"));
        }
        if (map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
        return map;
    }
}
