package commonTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonTwo {
    //Dado 2 Arrays de Strings (ordenados alfabeticamente e permitindo duplicatas- "a" e "b"), retorne a quantidade de
    //elementos em comum nos dois Arrays.

    public int commonTwo(String[] a, String[] b) {
        List<String> a2 = new ArrayList<>(Arrays.asList(a));
        List<String> result = new ArrayList<>();
        for (String str : b) {
            if (a2.contains(str) && !result.contains(str)){
                result.add(str);
            }
        }
        return result.size();
    }
}
