package topping2;

import java.util.Map;

public class Topping2 {
    //Se houver um key "ice cream", crie ou altere, a key "yogurt" para que ela possua o seu mesmo valor e ainda, se
    //houver a key "spinach" altere o seu valor para "nuts".

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;
    }
}
