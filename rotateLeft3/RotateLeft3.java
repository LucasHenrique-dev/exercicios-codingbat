package rotateLeft3;

public class RotateLeft3 {
    //Dado um Array de tamanho 3, retorne esse mesmo Array com seus elemntos deslocados para a esquerda.
    //(Ex.: ([1,2,3]) -> [2,3,1]; ([5,11,4]) -> [11,4,5]).

    public int[] rotateLeft3(int[] nums) {
        int[] num1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = i+1;
            if (n >= nums.length) n = 0;
            num1[i] = nums[n];
        }
        return num1;
    }
}
