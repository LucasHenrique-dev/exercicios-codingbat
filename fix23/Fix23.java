package fix23;

public class Fix23 {
    //Se no Array dado houver um 2, seguido por um 3, mude o valor deste 3 para zero, considerando um Array de "length" 3.

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length-1 && nums[i] == 2 && nums[i + 1] == 3) {
                nums[i+1] = 0;
            }
        }
        return nums;
    }
}
