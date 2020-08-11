package noX;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    //Retorne uma lista de Strings cujos valores correspondam aos originais, porém com os "x" removidos.
    //Ex.: ((["ax", "bb", "cx"]) → ["a", "bb", "c"]).

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(str -> str.replace("x",""))
                .collect(Collectors.toList());
    }
}
