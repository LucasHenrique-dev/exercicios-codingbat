package modThree;

public class ModThree {
    //Retorne true se no Array nummérico dado ("nums") houver três números pares seguidos ou três ímpares seguidos.

    public boolean modThree(int[] nums) {
        if (nums.length <= 2) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i], second = nums[i+1], third = nums[i+2];
            if (first%2 == 0 && second%2 == 0 && third%2 ==0) return true;
            if (first%2 == 1 && second%2 == 1 && third%2 == 1) return true;
        }
        return false;
    }
}
