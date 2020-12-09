package notAlone;

public class NotAlone {
    //Dado um número "val", analise-o no Array dado ("nums") e verifique se ele apresentasse só (não possui um valor igual
    //nem do lado direito ou esquerdo), caso isso ocorra, deverá ser substituído pelo maior valor entre os seus vizinhos.
    //Ex.:(([1, 2, 3], 2) → [1, 3, 3]; ([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]; ([3, 4], 3) → [3, 4]).

    public int[] notAlone(int[] nums, int val) {
        if (nums.length <= 2) return nums;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i-1] != val && nums[i+1] != val)
                nums[i] = Math.max(nums[i-1],nums[i+1]);
        }
        return nums;
    }
}
