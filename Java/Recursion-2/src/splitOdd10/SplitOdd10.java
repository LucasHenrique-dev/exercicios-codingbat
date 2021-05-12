package splitOdd10;

public class SplitOdd10 {
    //Dado um Array de númros "nums", retorne se é possível dividi-lo em dois grupos cuja soma de um deles seja multipla
    //de 10 e do outro seja um número ímpar. Todos os números devem pertencer a pelo menos um grupo. Para isso crie um
    //método recursivo auxiliar (parâmetros quaisquer) que possuira a sua primeira chamada em "SplitOdd10()".
    //Não é necessário loopings.
    //Ex.:(([5, 5, 5]) → true; ([5, 5, 6]) → false; ([5, 5, 6, 1]) → true).

    public boolean splitOdd10(int[] nums) {
        return helper(0,nums,0,0);
    }

    public boolean helper(int start, int[] nums, int target1, int target2){
        if (start >= nums.length)
            return (target1%10 == 0 || target2%10 == 0) && (target2%2 == 1 || target2%2 == 1);
        int val = nums[start];
        if (helper(start+1,nums,target1+val,target2)) return true;
        return (helper(start+1,nums,target1,target2+val));
    }
}
