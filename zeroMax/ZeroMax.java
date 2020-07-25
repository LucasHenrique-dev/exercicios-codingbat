package zeroMax;

import java.util.Arrays;
import java.util.Collections;

public class ZeroMax {
    //Retorne um Array numérico em que toda a ocorrência de "0" no Array dado ("nums") seja seja substituida pelo maior
    //número ímpar a sua direita, caso não tenha número ímpar, permaneça com o "0".

    public int[] zeroMax(int[] nums) {
        int maior = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i]%2 == 1 && nums[i] > maior) maior = nums[i];
            if (nums[i] == 0) nums[i] = maior;
        }
        return nums;
    }
}
