package has77;

public class Has77 {
    //Retorne true se no Array de números dado ("nums") houver um "7" seguido por outro ou afastado por um valor.
    //Ex.:(([1, 7, 7]) → true; ([1, 7, 1, 7]) → true; ([1, 7, 1, 1, 7]) → false).

    public boolean has77(int[] nums) {
        if (nums.length <= 1) return false;
        int ultimo = nums[nums.length-1], penultimo = nums[nums.length-2];
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == nums[i+1] || nums[i] == nums[i+2]) && nums[i] == 7) return true;
        }
        return (penultimo == ultimo && ultimo == 7);
    }
}
