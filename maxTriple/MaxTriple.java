package maxTriple;

public class MaxTriple {
    //Dado um Array ímpar de "length", pelo menos 1, retorne o maior valor entre o inicial, final e o do meio.

    public int maxTriple(int[] nums) {
        int tam = nums.length/2, maior = Math.max(nums[0],nums[tam]);
        return Math.max(maior,nums[nums.length-1]);
    }
}
