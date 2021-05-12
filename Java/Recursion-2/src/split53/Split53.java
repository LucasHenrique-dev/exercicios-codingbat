package split53;

public class Split53 {
    //Dado um Array de númros "nums", retorne se é possível dividi-lo em dois grupos cujas somas sejam iguais. Porém, todos
    //os múltiplos de 5 devem pertencer a um grupo e todos os múltiplos de 3 (e não múltiplo de 5) ao outro. Todos os
    //números devem pertencer a pelo menos um grupo. Para isso crie um método recursivo auxiliar (parâmetros quaisquer)
    //que possuira a sua primeira chamada em "Split53()". Não é necessário loopings.
    //Ex.:(([1, 1]) → true; ([1, 1, 1]) → false; ([2, 4, 2]) → true).

    public boolean split53(int[] nums) {
        return helper(0,nums,0,0);
    }

    public boolean helper(int start, int[] nums, int target1, int target2){
        if (start >= nums.length) return target1 == target2;
        int val = nums[start];
        if ((val%3 != 0 || val%5 == 0) && helper(start+1,nums,target1+val,target2)) return true;
        return (val%5 != 0 && helper(start+1,nums,target1,target2+val));
    }
}
