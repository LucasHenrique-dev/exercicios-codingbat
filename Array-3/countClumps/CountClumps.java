package countClumps;

public class CountClumps {
    //Retorne o número de "clumps" que o Array numérico dado ("nums") possui. Sabendo que um "clump" é uma sequência de
    //2 ou mais números iguais. Ex.:(([1, 1, 1, 1, 1]) → 1; ([1, 2, 2, 3, 4, 4]) → 2; ([1, 1, 2, 1, 1]) → 2).

    public int countClumps(int[] nums) {
        if (nums.length <= 0) return 0;
        int valor = nums[0], cont = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1] && nums[i] == valor) {
                while((i+2) <= nums.length-1 && nums[i] == nums[i+2]){
                    i++;
                }
                cont++;
            }
            else valor = nums[i+1];
        }
        return cont;
    }
}
