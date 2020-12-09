package tenRun;

public class TenRun {
    //Para cada múltiplo de 10 que for encontrado no Array numérico dado ("nums"), preencha os valores seguintes com esse
    //múltiplo até encontrar um outro múltiplo de 10 e então repita o processo.
    //Ex.:(([10, 1, 9, 20]) → [10, 10, 10, 20]; ([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]).

    public int[] tenRun(int[] nums) {
        int val = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%10 == 0) {
                val = nums[i];
                continue;
            }
            if (val != -1 && nums[i]%10 != 0) nums[i] = val;
        }
        return nums;
    }
}
