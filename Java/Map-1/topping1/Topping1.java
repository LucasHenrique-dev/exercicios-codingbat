package topping1;

import java.util.Map;

public class Topping1 {
    //Se houver uma key "ice cream" o valor deverá ser "cherry" e em todos os casos deverá haver uma key "bread" com
    //value "butter".

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }
        map.put("bread","butter");
        return map;
    }
}
