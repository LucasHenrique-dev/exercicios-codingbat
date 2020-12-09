package noYy;

import java.util.List;
import java.util.stream.Collectors;

public class NoYy {
    //Dada uma lista de Strings ("strings"), retorne outra em que no fim de cada String seja adicionado um "y" e não
    //possua Strings contendo "yy" em qualquer parte da palavra.

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(str -> str+="y")
                .filter(str -> !str.contains("yy"))
                .collect(Collectors.toList());
    }
}
