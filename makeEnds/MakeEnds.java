package makeEnds;

public class MakeEnds {
    //Retorne um Array de "length" 2 que seja formado pelo primeiro e último elemento do Array dado, o Array dado deve
    //ter "length" de 1 ou mais.

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length-1]};
    }
}
