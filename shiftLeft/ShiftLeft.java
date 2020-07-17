package shiftLeft;

public class ShiftLeft {
    //Dado um Array numérico ("nums"), retorne outro que seja semelhante ao original, porém com os valores deslocados para
    //a esquerda. Ex.:(([6, 2, 5, 3]) → [2, 5, 3, 6]; ([1, 2]) → [2, 1]; ([1]) → [1]).

    public int[] shiftLeft(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length - 1 >= 0) System.arraycopy(nums, 1, result, 0, nums.length - 1);
        if (nums.length > 0) result[nums.length-1] = nums[0];
        return result;
    }
}
