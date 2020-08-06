package copies3;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    //Retorne uma lista de Strings cujos valores sejam um repetição de 3x do valor da lista original dada.

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(str -> str+str+str)
                .collect(Collectors.toList());
    }
}
