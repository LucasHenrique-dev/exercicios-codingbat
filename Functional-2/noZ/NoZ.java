package noZ;

import java.util.List;

public class NoZ {
    //Dada uma lista de Strings ("strings"), retorne outra que não possua qualquer String contendo um "z".

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
}
