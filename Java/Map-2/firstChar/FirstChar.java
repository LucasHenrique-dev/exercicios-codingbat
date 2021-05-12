package firstChar;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    //Retorne um Map que tenha como chave a letra inicial de cada String e com valor igual à concatenação de cada vez que
    //essa letra aparece. (Ex.: (["aba","casa","terrA","abraço"]) -> {"a":"aaaaAabraço", "c": 0, "t": 0}).

    public Map<String, String> firstChar(String[] strings) {
        Map<String,String> letras = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            if (!letras.containsKey(str.substring(0,1))){
                for (String str2 :
                        strings) {
                    if (str2.substring(0, 1).equals(str.substring(0, 1))) {
                        stringBuilder.append(str2);
                    }
                }
            }
            if (!letras.containsKey(str.substring(0,1))) {
                letras.put(str.substring(0, 1), stringBuilder.toString());
            }
            stringBuilder.setLength(0);
        }
        return letras;
    }
}
