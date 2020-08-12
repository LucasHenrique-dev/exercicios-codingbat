package rightDigit;

import java.util.List;

public class RightDigit {
    //Retorne uma lista de inteiros cujos valores sejam os dífitos mais a direita dos valores da lista original.
    //Ex.: (([12,1,345] -> [2,3,5]).

    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n%10);
        return nums;
    }
}
