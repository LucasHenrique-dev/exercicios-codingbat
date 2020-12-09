package doubling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    //Dada a lista "nums", retorne-a com os seus valores dobrados.

    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> dobro = new ArrayList<>(nums);
        dobro.replaceAll(n -> n*2);
        return dobro;
    }

    //RESOLUÇÃO 2 EM 1
    public List<Integer> doubling_2(List<Integer> nums) {
//        nums.replaceAll(n -> n * 2);
//        return nums;
//
//         OR the equivalent java streams solution:
         return nums.stream()
          .map(n -> n * 2)
          .collect(Collectors.toList());
    }
}
