package noNeg;

import java.util.ArrayList;
import java.util.List;

public class NoNeg {
    //Dada a lista numérica "nums", retorne outra em que não haja números abaixo de 0.

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    //RELEMBRANDO...
    public List<Integer> noNeg_2(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;

        // OR the equivalent stream solution
        // Note that the boolean logic is opposite
        // return nums.stream()
        //   .filter(n -> n >= 0)
        //   .collect(Collectors.toList());
    }
}
