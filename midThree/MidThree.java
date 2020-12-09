package midThree;

public class MidThree {
    //Dado um Array ímpar de "length" 3 ou mais, retorne um Array que contenha os 3 elementos centaris deste, anteriormente
    //citado.

    public int[] midThree(int[] nums) {
        int tam = nums.length/2;
        return new int[]{nums[tam-1],nums[tam],nums[tam+1]};
    }
}
