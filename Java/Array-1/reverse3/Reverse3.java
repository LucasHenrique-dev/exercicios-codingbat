package reverse3;

public class Reverse3 {
    //Dado um Array de "length" 3, retorne-o em ordem inversa, de modo que ([1,2,3]) -> [3,2,1].

    public int[] reverse3(int[] nums) {
        int[] rev = new int[nums.length];
        int n =0;
        for (int i = nums.length-1; i >= 0; i--) {
            rev[n] = nums[i];
            n++;
        }
        return rev;
    }
}
