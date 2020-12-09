package has271;

public class Has271 {
    //Retorne true se no Array houver um padrão "271", ou seja, um valor qualquer, seguido pelo mesmo - 5 e depois
    //pelo próprio - 1, também vale se esse "1" diferir em 2 ou menos no valor correto.
    //(EX.: (2,7,1) -> true; (2, 7, 5, 10, 1) -> false). 2,7,4

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int diff = nums[i] - 1;
            if (nums[i] == nums[i+1]-5 && (diff + 2 >= nums[i+2] && diff - 2 <= nums[i+2])){
                return true;
            }
        }
        return false;
    }

    //TENTEI ISSO, MAS FALHEI
    public boolean has271_2(int[] nums) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return true immediately when seeing 271.
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&              // the "7" check
                    Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
                return true;
            }
        }

        // If we get here ... none found.
        return false;
    }
}
