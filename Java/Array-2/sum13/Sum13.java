package sum13;

public class Sum13 {
    //Retorne a soma dos números contidos no Array ("nums"), caso não tenha retorne 0. Contudo, se houver um "13", ele
    //não deverá ser considerado e nem o que lhe sucede.

    public int sum13(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13){
                i++;
                continue;
            }
            count += nums[i];
        }
        return count;
    }
}
