package maxMirror;

import java.util.Arrays;

public class MaxMirror {
    //Dado um Array numérico ("nums"), retorne o tamanho da maior sequência que se repete de modo que se estivesse
    //espelhada, ou seja, espelhada. O elemento espelhado pode aparecer em qualquer parte do Array.
    //Ex.:(([1, 2, 3, 8, 9, 3, 2, 1]) → 3; ([7, 1, 2, 9, 7, 2, 1]) → 2; ([1, 2, 1, 4]) → 3).
    //[2,1,3,4,78,65,4,3,1,5,1]

    public int maxMirror(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if(nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
