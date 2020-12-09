package lower;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    //Retorne uma lista de Strings cujos valores correspondem aos valores da lista original, porém com as Strings em
    //minúsculo.

    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}
