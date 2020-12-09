package either24;

public class Either24 {
    //Retorne true se no Array dado ("nums"), contiver um "2", seguido por outro "2" ou um "4" seguido por outro "4", mas
    //não os dois ao mesmo tempo.

    public boolean either24(int[] nums) {
        boolean has_22 = false, has_44 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1] && nums[i] == 2) has_22 = true;
            if (nums[i] == 4 && nums[i+1] == 4) has_44 = true;
        }
        return has_22 ^ has_44; //UTILIZAÇÃO DO OPERADOR "OU EXCLUSIVO".
    }
}
