package no34;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    //Dada uma lista de Strings ("strings"), retorne outra que não possua alguma String de tamanho igual a 3 ou 4.

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() != 3 && n.length() != 4)
                .collect(Collectors.toList());
    }
}
