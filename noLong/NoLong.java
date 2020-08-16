package noLong;

import java.util.List;

public class NoLong {
    //Dada uma lista de Strings ("strings"), retorne outra que não possua qualquer String com 4 ou mais de tamanho.

    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }
}
