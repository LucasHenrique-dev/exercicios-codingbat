package evenOdd;

public class EvenOdd {
    //Retorne um Array numérico em que os números pares contidos no Array dado ("nums") venham primero do que os
    //ímpares contido no mesmo.

    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0, j = nums.length - 1; i < nums.length; i++){
            int primeiro = (j + i + 1) - nums.length;
            if (nums[i]%2 == 1) result[j--] = nums[i];
            else result[primeiro] = nums[i];
        }
        return result;
    }
}
