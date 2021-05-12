package two2;

import java.util.List;

public class Two2 {
    //Dada uma lista de números não negativos ("nums"), retorne outra que possua seus valores multiplicados por 2 e
    //não contenha nenhum número terminado por 2.

    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n*2);
        nums.removeIf(n -> n%10 == 2);
        return nums;
    }
}
