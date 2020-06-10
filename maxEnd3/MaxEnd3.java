package maxEnd3;

import java.util.Arrays;

public class MaxEnd3 {
    //Dado um Array de 3 elementos, retorne-o completamente preenchido com o maior número entre o primeiro e o último.

    public int[] maxEnd3(int[] nums) {
        int maior = Math.max(nums[0],nums[nums.length-1]);
        Arrays.fill(nums, maior);
        return nums;
    }
}
