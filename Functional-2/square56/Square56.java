package square56;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    //Dada uma lista de inteiros ("nums"), retorne outra que possua seus valores ao quadrado e acrescidos mais 10, porém
    //se algum terminar por 5 ou 6, não deverá estar na lista.

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (int) Math.pow(n,2) + 10)
                .filter(n -> n%10 != 5 && n%10 != 6)
                .collect(Collectors.toList());
    }
}
