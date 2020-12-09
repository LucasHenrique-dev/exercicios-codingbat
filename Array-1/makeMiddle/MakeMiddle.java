package makeMiddle;

public class MakeMiddle {
    //Retorne na forma de Array os 2 elementos centrais do Array dado, cujo "length" é de 2 ou mais.

    public int[] makeMiddle(int[] nums) {
        int mid = nums.length/2;
        return new int[]{nums[mid-1],nums[mid]};
    }
}
