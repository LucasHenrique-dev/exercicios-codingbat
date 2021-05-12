package array123;

import java.util.Arrays;

public class Array123 {
    //Retorne true se a sequência "1,2,3" aparecer em qualquer canto do Array.

    public boolean array123(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length-2; i++) {
            if (Arrays.equals(new int[]{nums[i], nums[i + 1], nums[i + 2]}, new int[]{1, 2, 3})){
                return true;
            }
        }
        return false;
    }
}
