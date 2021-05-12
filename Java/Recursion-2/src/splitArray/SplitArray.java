package splitArray;

public class SplitArray {
    //Dado um Array de númros "nums", retorne se é possível dividi-lo em dois grupos cujas somas sejam idênticas, todos
    //os números devem pertencer a pelo menos um grupo. Para isso crie um método recursivo auxiliar (parâmetros quaisquer) que possuira
    //a sua primeira chamada em "splitArray()". Não é necessário loopings.
    //Ex.:(([2, 2]) → true; ([2, 3]) → false; ([5, 2, 3]) → true).

    public boolean splitArray(int[] nums) {
        return helper(0, nums, 0);
    }

    public boolean helper(int start, int[] nums, int target){
        if (start >= nums.length) return target == 0;
        if (helper(start+1,nums,target+nums[start])) return true;
        return helper(start+1,nums,target-nums[start]);
    }
}
