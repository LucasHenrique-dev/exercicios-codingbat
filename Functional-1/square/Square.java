package square;

import java.util.List;

public class Square {
    //Retornea lista dada ("nums") com os seus itens ao quadrado.

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n*n);
        return nums;
    }
}
