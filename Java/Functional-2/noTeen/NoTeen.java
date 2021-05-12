package noTeen;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    //Dada uma lista de números ("nums"), retorne outra que não possua nenhum número entre 13 e 19, inclusive.

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
    }
}
