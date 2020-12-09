package no9;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    //Dada uma lista de números não negativos ("nums"), retorne outra que não haja qualquer número terminado por 9.

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n%10 != 9)
                .collect(Collectors.toList());
    }
}
