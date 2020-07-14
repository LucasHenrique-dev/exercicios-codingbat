package post4;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Post4 {
    //Retorne um Array numérico em que conterá os valores do Array ("nums") após a última aparição do número "4" que
    //deverá estar no Array dado ("nums"). Ex.:(([1, 2, 4, 1]) → [1]; ([4, 1, 4, 2]) → [2]; ([4, 4, 1, 2, 3]) → [1, 2, 3]).

    public int[] post4(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                result = new int[nums.length - (i + 1)];
                j = 0;
            }
            else result[j++] = nums[i];
        }
        return result;
    }
}
