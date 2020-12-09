package swapEnds;

public class SwapEnds {
    //Retorne o Array dado de forma que o valor inicial seja trocado com o valor final, o Array original deverá ter "length"
    //de 1 ou mais.

    public int[] swapEnds(int[] nums) {
        int[] sawp = new int[nums.length];
        for (int i = 0; i < sawp.length; i++) {
            if (i==0) sawp[i] = nums[nums.length-1];
            else if (i==nums.length-1) sawp[i] = nums[0];
            else sawp[i] = nums[i];
        }
        return sawp;
    }
}
