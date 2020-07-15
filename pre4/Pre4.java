package pre4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pre4 {
    //Retorne um Array numérico em que conterá os valores do Array ("nums") até a primeira aparição do número "4" que
    //deverá estar no Array dado ("nums"). Ex.:(([1, 2, 4, 1]) → [1, 2]; ([3, 1, 4]) → [3, 1]).

    public int[] pre4(int[] nums) {
        int[] result = new int[Arrays.binarySearch(nums,4)];
        if (result.length >= 0) System.arraycopy(nums, 0, result, 0, result.length);
        return result;
    }
}
