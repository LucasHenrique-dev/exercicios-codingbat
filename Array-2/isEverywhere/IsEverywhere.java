package isEverywhere;

public class IsEverywhere {
    //Retorne true se no Array dado ("nums") cada par de números, em sequência, possua, pelo menos, em um dos seus elementos
    //o "val". Ex.:(([1, 2, 1, 3], 1) → true; ([1, 2, 1, 3], 2) → false; ([1, 2, 1, 3, 4], 1) → false).

    public boolean isEverywhere(int[] nums, int val) {
        if (nums.length <= 1) return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i+1] != val) return false;
        }
        return true;
    }
}
