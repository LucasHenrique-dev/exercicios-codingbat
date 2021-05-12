package twoTwo;

public class TwoTwo {
    //Retorne true se cada "2" que aparece no Array numérico dado ("nums") houver outro em seguida.

    public boolean twoTwo(int[] nums) {
        if (nums.length == 0) return true;
        if (nums.length == 1) return nums[0] != 2;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] != 2) return false;
            if (nums[i] == 2 && nums[i+1] == 2) i++;
        }
        return nums[nums.length - 1] != 2 || nums[nums.length - 2] == 2;
    }
}
